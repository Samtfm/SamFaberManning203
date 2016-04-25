/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairApp;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;

/**
 *
 * @author safabermanning
 */
public class PairTest {
    
    public PairTest() {

    }
    
    @Test
    public void getFirstTest(){
        Pair<String> testPair = new Pair("hello", "world");
        assertEquals("hello", testPair.getFirst());
    }
    
    @Test
    public void getSecondTest(){
        Pair<String> testPair = new Pair("hello", "world");
        assertEquals("world", testPair.getSecond());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
