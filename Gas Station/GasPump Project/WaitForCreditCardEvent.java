/**
 * Write a description of class WaitForCreditCardEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;
public class WaitForCreditCardEvent implements Component
{
    // instance variables - replace the example below with your own
    private boolean isStarted= false;
    public void startEvent(){
       if(!isStarted){
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
       //System.out.println("WaitForCreditCard Event Started");
        DisplayScreen ds = new DisplayScreen("Please swipe the credit card to BEGIN");
       GasPumpWorld.gpWorld.addObject(ds,335,250);
       CardSlot cardSlot = GasPumpWorld.gpWorld.getObjects(CardSlot.class).get(0);
       cardSlot.setToWorkingState();
       isStarted =true;
       GasPumpState gpState = GasPumpState.getInstance();
       gpState.setState(State.isUnInitialized);
        }

        
        
    
    }
}
