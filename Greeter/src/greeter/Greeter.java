/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author safabermanning
 */
/**
   A class for producing simple greetings.
*/
public class Greeter {

    public static void main(String[] args) {
        // TODO code application logic here
      Greeter myGreeter = new Greeter("Mickey");
      Greeter myGreeterAlt = myGreeter;
      
      myGreeterAlt.setName("Minnie");
      String greeting = myGreeter.sayHello();
      System.out.println(greeting);
      
      Greeter greeterA = new Greeter("Adam");
      Greeter greeterB = new Greeter("Betty");
      greeterA.swapNames(greeterB);
      String greetingA = greeterA.sayHello();
      System.out.println("A: " + greetingA);
      String greetingB = greeterB.sayHello();
      System.out.println("B: "+ greetingB);
      
    }
    
    /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
    public Greeter(String aName)
    {
      name = aName;
    }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   /**Assigns a new name to a greeter
    * @param newName the new name to be set
    */
   public void setName(String newName)
   {
       name = newName;
   }
   /**Swaps the names of two Greeters
    * 
    * @param other a second greeter to swap names with 
    */
   public void swapNames(Greeter other)
   {
       String temp = name;
       name = other.name;
       other.setName(temp);
   }
   private String name;
}
