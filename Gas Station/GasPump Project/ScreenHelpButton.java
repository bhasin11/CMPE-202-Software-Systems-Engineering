import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenHelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenHelpButton extends ScreenButtons
{
    /**
     * Act - do whatever the ScreenHelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        
        if(Greenfoot.mousePressed(this)){
        world.removeObjects(getWorld().getObjects(DisplayScreen.class));
        DisplayScreen ds = new DisplayScreen("Press Red Button to Abort\nPress Yellow Button for Jokes.\nPress Orange Button\n for more assistance");
        world.addObject(ds,335,225);
        }
        
    }    
}
