/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 *
 * @author Eric Cheok
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      Television TV = new Television();   
      PlasmaTV PTV = new PlasmaTV();
      PTV.powerSwitch();
      PTV.setType("Plasma");
      PTV.setscreenSize(50);
      PTV.setChannel("8TV");
      PTV.setVolume(5);
      
      
      System.out.println("TYPE: " + PTV.getType());
      System.out.println("Screen Size: " + PTV.getscreenSize());
      System.out.println("Channel Available: " + PTV.getChannel());
      System.out.println("Volume: " + PTV.getVolume());
      PlasmaTV.Speaker("Does Not Have");
      PlasmaTV.Speaker("No Speaker","\nYou Have To buy a speaker");
      TV.info();
      PTV.info();
      System.out.println("---------------------------------------------------------------------------------------------");
      
      
      Television TV1 = new Television();
      LEDTV LED = new LEDTV();
      LED.powerSwitch();
      LED.setType("LED");
      LED.setscreenSize(40);
      LED.setChannel("RTM");
      LED.setVolume(5);
      
      System.out.println("TYPE: " + LED.getType());
      System.out.println("Screen Size: " + LED.getscreenSize());
      System.out.println("Channel Available: " + LED.getChannel());
      System.out.println("Volume: " + LED.getVolume());
      LEDTV.Speaker("Have");
      LEDTV.Speaker("2 Speaker","\nYou don't have to buy a speaker!");
      TV1.info();
      LED.info();
      System.out.println("---------------------------------------------------------------------------------------------");
      
      
      Television TV2 = new Television();
      OLEDTV OLED = new OLEDTV();
      OLED.powerSwitch();
      OLED.setType("OLED");
      OLED.setscreenSize(60);
      OLED.setChannel("Astro");
      OLED.setVolume(5);
      
      System.out.println("TYPE: " + OLED.getType());
      System.out.println("Screen Size: " + OLED.getscreenSize());
      System.out.println("Channel Available: " + OLED.getChannel());
      System.out.println("Volume: " + OLED.getVolume());
      OLEDTV.Speaker("Have");
      OLEDTV.Speaker("4 Speaker","\nYou don't have to buy a speaker!");
      TV2.info();
      OLED.info();
      System.out.println("---------------------------------------------------------------------------------------------");
      
    }
 }   

