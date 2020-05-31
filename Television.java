/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 * Encapsulation
 * @author Eric Cheok
 */
public class Television {
  
// Title : television
/* I choose three type of television that is PlasmaTV, LEDTv and OledTV

The class Plasma TV, LED TV and OLED TV inherit from the class Television.
The class Television is the superclass of Plasma TV, LED TV and OLED TV. Plasma TV, LED TV and OLED TV are subclasses of Television. 

*/

//defining attributes
   private String Type;
   private double screenSize;
   private boolean power;
   private String channel;
   private int maxVolume;
   private int volume;
   
      //Constructor method assigns values to the corresponding fields
      public void Television(String Type, double screenSize, boolean power,String channel,int volume)
      {
         this.Type = Type;
         this.screenSize = screenSize;
         this.power = power;
         this.channel = channel;
         this.volume = volume;
      }
      
//Methods
//Sets a name for type
	public void setType(String newType)
	{
		this.Type = newType;
	}
//Gets type and returns it
	public String getType()
	{
		return Type;
	}      
   
//Sets a value for screen size
	public void setscreenSize(double newScreenSize)
	{
		this.screenSize = newScreenSize;
	}
//Gets screen size and returns it
	public double getscreenSize()
	{
		return screenSize;
	}    
//Turns power On/Off 
    public void powerSwitch()
    {
        if (true)
        {
            power = !power;
            System.out.println("\nPower On!");
        }
        else
        {
            power = power;
            System.out.println("\nPower Off!");
        }
    }
//Sets a name for Channel
  	public void setChannel(String newChannel)
	{
		this.channel = newChannel;
	}
//Gets channel and return it
	public String getChannel()
	{
		return channel;
	}
      
//Sets a value for volume
   public void setVolume(int newVolume)
   {
      this.volume = newVolume;
   }
//Gets volume and return it
   public int getVolume()
   {
      return volume;
   }
   
//Increase volume
   public int increaseVolume()
   {
      if(maxVolume>volume)
         volume++;
      return volume;
   }
//Decrease volume
   public int decreaseVolume()
   {
      if(0<volume)
         volume--;
      return volume;
   } 
//Override
//Display info   
   public void info()
   {
      System.out.println("\nThis Television price is depends on the television type!");
   }   
 }
  
