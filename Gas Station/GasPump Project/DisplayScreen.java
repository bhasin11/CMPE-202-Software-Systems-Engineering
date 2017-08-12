import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayScreen extends Actor
{
    /**
     * Act - do whatever the DisplayScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public DisplayScreen(){
        setDisplayScreen("");
    }
    
    public DisplayScreen(String str){
        setDisplayScreen(str);
    }
    
    
    public void setDisplayScreen(String str){
        setImage(new GreenfootImage(str, 24, Color.BLACK, Color.WHITE));
    }
    
        
    public void act() 
    {
        // Add your action code here.
        /*World world = getWorld();
        
    
        switch (gpState.getState()){
            case isUnValidated:
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                String str = "Please enter the 5 digit Zip code Below";
                this.setMessage(str);
                world.addObject(this,100,200);
              
                break;
                
               
            case default:
                String str = "Please swipe your credit card to begin";
                this.setMessage(str);
                world.addObject(this,100,200);
                

        
        } */
            
        
    }    
    
}
