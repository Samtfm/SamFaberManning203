/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author sfmem_000
 */
public class SavingsAccount extends Account {
    public SavingsAccount(String name){
        setName(name);
        setBalance(0);
        lastUpdate = LocalDate.now();
    }
    
    private final double INTEREST_RATE = 1.0001;
    
    //returns false if transaction fails
    public boolean withdraw(double amount){
        if (getBalance()>=amount){
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
        
    }
    public void updateInterest(LocalDate date){
        int days = (int) Math.floor(DAYS.between(lastUpdate, date));
        setBalance(getBalance()*Math.pow(INTEREST_RATE, days));
    }
    private LocalDate lastUpdate;
}
