import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenDummyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenDummyButton extends ScreenButtons
{
    /**
     * Act - do whatever the ScreenDummyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
        
        if((gpState.getState() == State.isUnInitialized || gpState.getState() == State.isUnValidated) && Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
          gSound.play();
        }
    }    
}
