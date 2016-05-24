/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sfmem_000
 */
public class BankAppGUI extends JFrame implements ActionListener {

    ListOfAccounts accounts;
    JFrame frame;
    JPanel panel;

    JTextField newAccountName;

    JTextField amount;
    JTextField depositAmount;
    JTextField currentAccount;
    JTextArea allAccounts;
    JLabel message;

    public BankAppGUI(ListOfAccounts accounts) {
        this.accounts = accounts;
        this.accounts.updateInterest();

        frame = new JFrame("BANK TO THE FUTURE");
        panel = new JPanel();

        //Create Account Section
        newAccountName = new JTextField(6);
        JButton createSavings = new JButton();
        createSavings.addActionListener(this);
        createSavings.setText("Create Savings Account");
        createSavings.setActionCommand("newSavings");
        JButton createChecking = new JButton();
        createChecking.addActionListener(this);
        createChecking.setText("Create Checking Acount");
        createChecking.setActionCommand("newChecking");
        //add elements
        panel.add(new JLabel("New Account          Name:"));
        panel.add(newAccountName);
        panel.add(createSavings);
        panel.add(createChecking);
        addSpacer(panel);

        //Deposit/Withdrawal section
        JButton withdraw = new JButton("Make Withdrawal");
        withdraw.setActionCommand("withdraw");
        withdraw.addActionListener(this);
        JButton deposit = new JButton("Make Deposit");
        deposit.setActionCommand("deposit");
        deposit.addActionListener(this);
        amount = new JTextField(4);
        currentAccount = new JTextField(6);

        panel.add(new JLabel("Make Withdrawal or Deposit          Name:"));
        panel.add(currentAccount);
        panel.add(new JLabel("Amount: "));
        panel.add(amount);
        panel.add(withdraw);
        panel.add(deposit);

        addSpacer(panel);
        message = new JLabel("");
        message.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(message);
        addSpacer(panel);
        allAccounts = new JTextArea(accounts.printAll());
        panel.add(allAccounts);

        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        message.setText("");
        String action = ae.getActionCommand();
        if (action.equals("newSavings")) {
            accounts.newSavingsAccount(newAccountName.getText());
        }
        if (action.equals("newChecking")) {
            accounts.newCheckingAccount(newAccountName.getText());
        }
        try {
            if (action.equals("withdraw")) {
                Account acc = accounts.getAccount(currentAccount.getText());
                double amt = Double.parseDouble(amount.getText());
                acc.withdraw(amt);

            }
            if (action.equals("deposit")) {
                Account acc = accounts.getAccount(currentAccount.getText());
                double amt = Double.parseDouble(amount.getText());
                acc.deposit(amt);
            }
        } catch (Exception e) {
             message.setText("invalid input");
        }
        accounts.updateInterest();
        allAccounts.setText(accounts.printAll());
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("data.txt"));
            out.writeObject(accounts);
            out.flush();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(BankAppGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addSpacer(JPanel panel) {
        JSeparator bar;
        bar = new JSeparator(SwingConstants.HORIZONTAL);
        bar.setPreferredSize(new Dimension(750, 10));
        panel.add(bar);

    }

    public void updateAccounts() {

    }
}
