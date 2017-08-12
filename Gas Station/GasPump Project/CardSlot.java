import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class CardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSlot extends Actor
{
    /**
     * Act - do whatever the CardSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean isWorking = false;
    
 
    public void setToWorkingState(){
        isWorking = true;
    }
    
    public boolean isWorking(){
    
        return isWorking;
    }
    
    public void act() 
    {
        
        List<Card> cards = getIntersectingObjects(Card.class);
        if(cards != null && cards.size() != 0){
            for(Card card : cards){
                if(Greenfoot.mouseDragEnded(card)){
                    cardSlided(card);
                }
            }
        }
    }
    
    
    
    private void cardSlided(Card card){
        if( isWorking && card instanceof RealCard){
            System.out.println("Card and Slots intersected!!");   
           
          GasPumpState gps = GasPumpState.getInstance();
            //set state
            gps.setState(State.isUnValidated);
            System.out.println("Setting new state "+gps.getState());
            
        }else{
            //TODO: print Fake Card
        }
    }
    
}
