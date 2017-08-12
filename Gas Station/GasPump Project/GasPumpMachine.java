import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends Actor
{
    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private boolean isStarted = false;
    public void act() 
    {
        // Add your action code here.
        World world = getWorld(); 
        
        //world.removeObjects(getWorld().getObjects(DisplayScreen.class));
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int x= Greenfoot.getMouseInfo().getX();
        int y =Greenfoot.getMouseInfo().getY();
         
         /*DisplayScreen ds1 = new DisplayScreen(Integer.toString(x));
         DisplayScreen ds2 = new DisplayScreen(Integer.toString(y));
         world.removeObject(ds1);
         world.removeObject(ds2); 
         world.addObject(ds1,20,580);
         world.addObject(ds2,60,580);*/
        
        
        }
       
      
        //isStarted = true;
        
    }    
}
