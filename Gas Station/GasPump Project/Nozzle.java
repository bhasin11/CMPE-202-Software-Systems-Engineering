import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.text.DecimalFormat;

/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
    /**
     * Act - do whatever the Nozzle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void drag(){
    
    
    }
    private boolean startFilling = false;
    private long startTime=0;
    private long counter = 0;
    private double currentBill=0;
    private double fuelPrice=0;
    private boolean textDisplayedOnce = false;
    
       public double getCurrentBill(){
        return currentBill;
    } 
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
       
        //NozzleHole nozzleHole = world.getObjects(NozzleHole.class).get(0);
        if(gpState.getState() == State.isFuelSelectedButUnfueled){
           World world = getWorld();
            int mouseX=0;
           int mouseY=0;
           
           if (Greenfoot.mouseDragged(this)){
               if (!startFilling){
                   startFilling = true;
                   startTime = System.currentTimeMillis();
                }
                MouseInfo mouse = Greenfoot.getMouseInfo();  
                mouseX=mouse.getX();  
                mouseY=mouse.getY();  
                setLocation(mouseX, mouseY);
                
            }
          
            if(startFilling){
                counter++;
                
                double fuelPrice = 0;
                Fuel89 fuel89Instance = world.getObjects(Fuel89.class).get(0);
                Fuel87 fuel87Instance = world.getObjects(Fuel87.class).get(0);
                Fuel93 fuel93Instance = world.getObjects(Fuel93.class).get(0);
                boolean isf89 = fuel89Instance.wasSelected();
                boolean isf87 = fuel87Instance.wasSelected();
                boolean isf93 = fuel93Instance.wasSelected();
                if(isf89){
                    fuelPrice = fuel89Instance.getPrice();
                }
                else if(isf87){
                fuelPrice = fuel87Instance.getPrice();
                
                }
                else if(isf93){
                fuelPrice = fuel93Instance.getPrice();
                }
                currentBill=counter*fuelPrice/100;
                DecimalFormat df = new DecimalFormat("0.00");
                
                
                 //ds =new DisplayScreen("");
                 //System.out.println("textDisplayedOnce: "+textDisplayOnce);
                if(!textDisplayedOnce){
                    world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                    System.out.println("textDisplayedOnce: "+textDisplayedOnce);
                DisplayScreen ds = new DisplayScreen("Fuel Filling in progress...");
                world.addObject(ds,350,250);
                textDisplayedOnce = true;
                }
                 //DisplayScreen ds2 = new DisplayScreen(Long.toString(counter));
                 DisplayScreen ds4 = new DisplayScreen("Price: $"+df.format(fuelPrice)+"/gal.");
                 DisplayScreen ds5 = new DisplayScreen("Fuel: "+df.format(counter/100.00)+"gal.");
                 DisplayScreen ds6 = new DisplayScreen("Bill: $"+df.format(currentBill));
                 //world.removeObject(ds2);
                 world.addObject(ds4,663,490);
                 world.addObject(ds5,670,520);
                 world.addObject(ds6,663,550);
                 //List<NozzleHole> nozzleHole = getIntersectingObjects(NozzleHole.class);
                 //nozzleHole != null && nozzleHole.size() != 0 
                 if(getOneObjectAtOffset(0,0,NozzleHole.class) !=null && counter >10){
                     //for(NozzleHole n : nozzleHole){
                         long endTime = System.currentTimeMillis();
                         int durationMillis = (int)(endTime - startTime);
                         System.out.println("You fueled for "+Integer.toString(durationMillis/1000)+ " seconds");
                         gpState.setState(State.isFilled);
                     //}
                     
                          /*world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                          DisplayScreen ds = new DisplayScreen("Thanks for going paperless");
                          DisplayScreen ds2 = new DisplayScreen("Bye Bye...");
           
                          world.addObject(ds,330,120);
                          //world.addObject(ds2,320,180);*/
                    }
                }   
           
           }
        
    }    
}
