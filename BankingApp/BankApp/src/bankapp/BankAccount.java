/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import java.util.Comparator;

/**
 *
 * @author safabermanning
 */
public class BankAccount implements Comparable<BankAccount> {
    public BankAccount(String name, float balance){
        this.name = name;
        this.balance = balance;
    }
    private String name;
    private float balance;

    @Override
    public int compareTo(BankAccount other) {
      if (balance < other.getBalance()) return -1;
      if (balance > other.getBalance()) return 1;
      return 0;
    }
    
    
    
    public float getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}
