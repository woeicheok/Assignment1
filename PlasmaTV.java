/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 * Inheritance
 * @author Eric Cheok
 */
public class PlasmaTV extends Television{

//overloading
    public static void Speaker(String A)
   {  
      System.out.println("This television " + A + " build-in speaker!");
   }
   public static void Speaker(String B,String C)
   {
      System.out.println("Number of Speaker of this television is : " + B + "," + C);
   }

   @Override
   public void info()
   {
      System.out.println("\nThis Television price: RM5000");
   }
}
  
