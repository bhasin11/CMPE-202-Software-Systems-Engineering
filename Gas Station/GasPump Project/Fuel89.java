import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
/**
 * Write a description of class Unleaded here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel89 extends FuelType
{
    /**
     * Act - do whatever the Unleaded wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean isWorking = false;
    private double price = 1.50;
    private boolean isSelected = false;
    //GreenfootSound gSound = new GreenfootSound("");
    
    public void setToWorkingState(){
        isWorking = true;
    }
    
    public double getPrice(){
        //DecimalFormat df = new DecimalFormat("0.00");
        return price;
    }
    
    public boolean wasSelected(){
        return isSelected;
    }
    
    public boolean isWorking(){
        
        return isWorking;
    }
    
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Plus Fuel \n\t\tType");
           DisplayScreen ds2 = new DisplayScreen("Please start filling your tank");
           //DisplayScreen ds3 = new DisplayScreen("$2/lt.");
           world.addObject(ds,330,120);
           world.addObject(ds2,320,180);
           //world.addObject(ds3, 628, 549);
    }
    
    public void act() 
    {
       if(isWorking){
           World world = getWorld();
           //System.out.println("Fuel89 Now functional");
           GasPumpState gpState = GasPumpState.getInstance();
           // Add your action code here.
           if(gpState.getState() == State.isValidatedButUnfueled && Greenfoot.mousePressed(this)){
           //Nozzle nozzel=world.getObjects(Nozzle.class).get(0);
           //nozzel.setFuelPrice(2);
           isSelected = true;
           this.displayMessage();
            System.out.println("Inside Fuel89 - Setting the state to isFuelSelectedButUnfueled");
            gpState.setState(State.isFuelSelectedButUnfueled);
        
           }
        }
        else if(Greenfoot.mousePressed(this)){
            System.out.println("Fuel89 Status: "+isWorking);
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
    }    
}
