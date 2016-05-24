/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.time.LocalDate;

/**
 *
 * @author sfmem_000
 */
public abstract class Account implements java.io.Serializable{
    
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setBalance(double balance){this.balance = balance;}
    public double getBalance(){return balance;}
    
    
    public void deposit(double amount){
        this.balance += amount;
    }
    public boolean isSavings(){
        return this.getClass() == SavingsAccount.class;
    }
    public boolean isChecking(){
        return this.getClass() == CheckingAccount.class;
    }
    //does nothing and returns false if transaction fails
    public abstract boolean withdraw(double amount);
    public abstract void updateInterest(LocalDate date);
    private double balance;
    private String name;
}
