/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.io.*;
import java.time.LocalDate;

/**
 *
 * @author sfmem_000
 */
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        ListOfAccounts accountList;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"));
            accountList = (ListOfAccounts) in.readObject();
        }
        catch (IOException | ClassNotFoundException e){
            accountList = new ListOfAccounts();
        }
        
        BankAppGUI gui = new BankAppGUI(accountList);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
        out.writeObject(accountList);
        out.flush();
        out.close();
        
    }
    
}
