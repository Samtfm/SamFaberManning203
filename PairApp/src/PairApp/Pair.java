/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairApp;

import java.io.Serializable;

/**
 *
 * @author safabermanning
 */
public class Pair<E> implements Cloneable, Serializable{
    public Pair(E thing1, E thing2){
        first = thing1;
        second = thing2;
    }
    public E getFirst(){
        return(first);
    }
    public E getSecond(){
        return(second);
    }
    public void setFirst(E element){
        first = element;
    }
    public void setSecond(E element){
        second = element;
    }
    public Pair clone() 
    { 
      try 
      { 
         Pair<E> cloned = (Pair)super.clone();
         //cloned.setFirst((E)first.clone());
         //cloned.setSecond((E)second.clone());
         return(cloned);
      } 
      catch(CloneNotSupportedException e) 
      { 
         return(null);
      }
    } 
    private E first;
    private E second;
    
    
}
