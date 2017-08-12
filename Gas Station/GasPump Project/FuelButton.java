/**
 * Write a description of class FuelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class FuelButton implements Observer
{
    // instance variables - replace the example below with your own
   private GasPumpState gpState = GasPumpState.getInstance();
   
   public void update(){
       if(gpState.getState() == State.isValidatedButUnfueled){
          FuelType fuel = new FuelType();
          fuel.displayMessage();
        
       
        
        }
    }
    
    public void act(){
        System.out.println("Inside FuelButton class which implements Observer---No actor assigned");
    
    }
}
