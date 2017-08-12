import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scenario3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario3 extends Actor
{
    /**
     * Act - do whatever the Scenario3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isRunning = false;
    private Component order3;
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
         System.out.println("Scenario 3 Clicked");
        isRunning = true;
        order3 = BuildOrder3.getOrder();
        order3.startEvent();
        }
        
        if (isRunning){
        //Component order = BuildOrder.getOrder();
        order3.startEvent();
        
        
        }
    } 
}
