import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Actor
{
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
        World world = getWorld();
        if(gpState.getState() == State.isPrintReceipt){
            //System.out.println("Inside receipt act");

            //get price
            //get price + Carwash Price <---need to print sum
            //boolean of carwash scenario
            ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
            
            DecimalFormat df = new DecimalFormat("0.00");
            Nozzle noz = world.getObjects(Nozzle.class).get(0);
            DisplayScreen ds1 = new DisplayScreen("Thanks for\n your visit !");
            DisplayScreen ds2_withoutCarwash = new DisplayScreen("BILL DETAILS:\n "+"Gas Bill: $"+df.format(noz.getCurrentBill()));
            DisplayScreen ds3_CarwashDetails = new DisplayScreen("Car Wash: $5\nCarwash Discount: 20%");
            DisplayScreen ds3_finalBill = new DisplayScreen("DISCOUNTED BILL: $"+df.format((noz.getCurrentBill()*0.8)+5));
            ScreenOKButton cwStatus = world.getObjects(ScreenOKButton.class).get(0);
        
         if(rp.getPrintApprovalStatus()){
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                world.addObject(ds1,550,368);
                world.addObject(ds2_withoutCarwash,550,440);
                System.out.print("Car wash status "+cwStatus.getCarWashSelectedStatus());
                if(cwStatus.getCarWashSelectedStatus()){
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                world.addObject(ds2_withoutCarwash,550,368);
                    world.addObject(ds3_CarwashDetails,550,423);
                    world.addObject(ds3_finalBill,550,463);
                }
                
                //world.addObject(ds1,550,450);
            }
            else{
             System.out.println("after filling fuel");
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("Thanks for going paperless");
           DisplayScreen ds2 = new DisplayScreen("Bye Bye...");
           
           world.addObject(ds,330,120);
           world.addObject(ds2,320,180);
            
            
            }
           
        }
    }    
}
