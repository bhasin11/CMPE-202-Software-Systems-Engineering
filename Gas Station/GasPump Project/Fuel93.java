import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel93 extends FuelType
{
    /**
     * Act - do whatever the Premium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double price = 2;
    private boolean isSelected = false;
    public double getPrice(){
        //DecimalFormat df = new DecimalFormat("0.00");
        return price;
    }
    
    
    public boolean wasSelected(){
        return isSelected;
    }
    
    
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Premium Fuel \n\t\tType");
           DisplayScreen ds2 = new DisplayScreen("Please start filling your tank");
           
           world.addObject(ds,330,120);
           world.addObject(ds2,320,180);
    }
    
    public void act() 
    {
        if(isWorking){
        GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        if(gpState.getState() == State.isValidatedButUnfueled && Greenfoot.mousePressed(this)){
                this.displayMessage();
                System.out.println("Inside Fuel93 - Setting the state to isFuelSelectedButUnfueled");
                gpState.setState(State.isFuelSelectedButUnfueled);
                isSelected = true;
        
        }
       }
        else if(Greenfoot.mousePressed(this)){
            System.out.println("Fuel93 Status: "+isWorking);
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
        
        }
}

