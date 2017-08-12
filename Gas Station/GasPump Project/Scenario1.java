import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scenario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario1 extends Actor
{
    /**
     * Act - do whatever the Scenario1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isRunning = false;
    private Component order;
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
         System.out.println("Scenario 1 Clicked");
        isRunning = true;
        order = BuildOrder.getOrder();
        order.startEvent();
        }
        
        if (isRunning){
        //Component order = BuildOrder.getOrder();
        order.startEvent();
        
        
        }
    }    
}
