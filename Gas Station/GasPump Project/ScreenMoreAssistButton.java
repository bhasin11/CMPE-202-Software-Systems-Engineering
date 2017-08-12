import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenMoreAssistButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenMoreAssistButton extends ScreenButtons
{
    /**
     * Act - do whatever the ScreenMoreAssistButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        if(Greenfoot.mousePressed(this)){
        world.removeObjects(getWorld().getObjects(DisplayScreen.class));    
        DisplayScreen ds = new DisplayScreen("Please stay put.\nHelp is on the way ");
        world.addObject(ds,340,150);
        GreenfootSound helpSound = new GreenfootSound("HelpNeeded.wav");
        helpSound.play();
        GasPumpState gpState  = GasPumpState.getInstance();
        
        gpState.setState(State.isOver);
        }
    }    
}
