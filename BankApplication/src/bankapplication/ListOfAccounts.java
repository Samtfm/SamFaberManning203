/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sfmem_000
 */
public class ListOfAccounts implements java.io.Serializable {
    
    private ArrayList<Account> accountList;
    
    public ListOfAccounts(){
        accountList = new ArrayList<>();
    }
    public void updateInterest(){
        for (Account account : accountList){
            account.updateInterest(LocalDate.now());
            
        }
    }
    public void newSavingsAccount(String name){
        if (getAccount(name) == null){
            accountList.add(new SavingsAccount(name));
        }

    }
    public void newCheckingAccount(String name) {
        if (getAccount(name)==null){
            accountList.add(new CheckingAccount(name));
        }
    }
    public void deleteAccount(String name){
        if (getAccount(name)!=null){
            accountList.remove(getAccount(name));
        }
    }
    public Account getAccount(String name){
        for (Account account: accountList){
            if(account.getName().equals(name)){
                return account;
            }
        }
        return null;
    }
    public String printAll(){
        String output = "Name \t Type \t Balance \n";
        
        for (Account account: accountList){
            String type = "";
            if (account.isSavings()) type = "Savings";
            if (account.isChecking()) type = "Checking";
            output = output + account.getName() + "\t" + type + "\t" + account.getBalance() + "\n";
        }
        //output = "<html>" + output + "</html>";
        return output;
    }
    
}
