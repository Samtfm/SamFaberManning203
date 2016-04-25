/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author safabermanning
 */
public class BankingSystem {
    public BankingSystem(){
        //accounts = null;
    }
    public void addAccount(String name, float balance){
        
    }
    public long add2(long num){
        return num +2;
    }
    public void printAccounts(){
    
    }
    
    Comparator<BankAccount> compName = new
        Comparator<BankAccount>()
        {
            public int com pare(BankAccount account1, BankAccount account2)
            {
                return account1.getName().compareTo(account2.getName());
            }
        };
    Comparator<BankAccount> compBalance = new
        Comparator<BankAccount>()
        {
            public int compare(BankAccount account1, BankAccount account2)
            {
                float a = account1.getBalance();
                float b = account2.getBalance();      
                if (a>b){ return 1;}
                else if (a<b){return -1;}
                else return 0;
            }
        };
    
    public void sortByName(boolean alphabetical){
        
    }
    public void sortByBalance(boolean increasing){
        
    }
    
    private List<BankAccount> accounts;
    
    
    
    /*public void sortByBalance(){
        accounts.sort(null);
    }*/
}
