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
public class CheckingAccount extends Account {
    public CheckingAccount(String name){
        setName(name);
        setBalance(0);
    }
    
    @Override
    public boolean withdraw(double amount){
        double total = amount + TRANSACTION_FEE;
        if (getBalance()>= total){
            setBalance(getBalance() - total);
            return true;
        }else{
            return false;
        }
    }
    private final double TRANSACTION_FEE = .1;

    @Override
    public void updateInterest(LocalDate date) {
       //checking accounts don't have interest!
    }
}
