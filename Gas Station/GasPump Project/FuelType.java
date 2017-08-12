import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuleType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelType extends Actor
{
    /**
     * Act - do whatever the FuleType wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean isWorking = false;
    protected double price = 0;
    GreenfootSound gSound = new GreenfootSound("");
    public void setToWorkingState(){
        isWorking = true;
    }
    
    public boolean isWorking(){
    
        return isWorking;
    }
    
    public void displayMessage(){
           World world = getWorld();
           DisplayScreen ds = new DisplayScreen("Please select Fuel Type");
           
           world.addObject(ds,100,250); 
        
    
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
