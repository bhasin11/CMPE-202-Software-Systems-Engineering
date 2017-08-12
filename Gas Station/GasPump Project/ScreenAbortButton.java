import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CallHelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenAbortButton extends ScreenButtons
{
    /**
     * Act - do whatever the CallHelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
                    GasPumpState gpState = GasPumpState.getInstance();
        if(gpState.getState() == State.isUnInitialized && Greenfoot.mousePressed(this)){
            GreenfootSound gSound = new GreenfootSound("beepSound.wav");
            gSound.play();
            
        
        }
        else if(Greenfoot.mousePressed(this)){
            World world = getWorld();

            world.removeObjects(getWorld().getObjects(DisplayScreen.class));
            DisplayScreen ds = new DisplayScreen("BYE BYE");
            world.addObject(ds,340,150);
            
            gpState.setState(State.isOver);
    }
    }    
}
