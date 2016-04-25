/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairApp;

import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author safabermanning
 */
public class PairApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Pair<String> stringPair1 = new Pair("hello", "world");
        Pair<String> stringPair2= stringPair1.clone();
        
        //change stringPair1, to make sure it does not change stringPair2
        stringPair1.setFirst("HELLO");
        stringPair1.setSecond("WERLD");
        
        //print string pairs
        System.out.println("stringPair1: " + stringPair1.getFirst() + ", " + stringPair1.getSecond());
        System.out.println("stringPair2: " + stringPair2.getFirst() + ", " + stringPair2.getSecond());

        //initiailize rectPair1
        Rectangle rect1 = new Rectangle(10,20);
        Rectangle rect2 = new Rectangle(30, 30);
        Pair<Rectangle> rectPair1 = new Pair(rect1, rect2);
        
        //Serialize
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("out.txt"));
        out.writeObject(rectPair1);
        out.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("out.txt"));
        Pair<Rectangle> rectPair2 = (Pair<Rectangle>) in.readObject();
        
        //print rectPair1 and rectPair2
        System.out.println("rectPair1: " + rectPair1.getFirst() + ", " + rectPair1.getSecond());
        System.out.println("rectPair2: " + rectPair2.getFirst() + ", " + rectPair2.getSecond());

        
        
        
    }
    
}
