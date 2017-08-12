import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scenario2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario2 extends Actor
{
    /**
     * Act - do whatever the Scenario2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isRunning = false;
    private Component order2;
    public void act() 
    {
        // Add your action code here.
        
         if(Greenfoot.mousePressed(this)){
          isRunning = true;
          System.out.println("Hitting scenario2");
        order2 = BuildOrder2.getOrder();
        order2.startEvent();
        }
        
        if (isRunning){
        //Component order = BuildOrder.getOrder();
        order2.startEvent();
        
        
        }
    }    
}
