/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author safabermanning
 */
public class BankingSystemTest {
    
    public BankingSystemTest() {
    }
    
    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void add2check() {
        BankingSystem sys = new BankingSystem();
        System.out.println("* test: add2Check()");
        assertEquals(sys.add2(4), 6);
    }
    
    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void sortByNameCheck() {
        BankingSystem sys = new BankingSystem();
        sys.addAccount("Blake", 130);
        sys.addAccount("Cindy", 60);
        sys.addAccount("Adam", 100);
        
        System.out.println("* BankingSystemTest: sortByNameCheck()");
        assertEquals(sys.add2(4), 6);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
