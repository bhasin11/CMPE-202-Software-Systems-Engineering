import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ScreenDeclineButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenDeclineButton  extends ScreenButtons
{
    
  //  rp.setPrintApproval();
     GasPumpState gpState = GasPumpState.getInstance();
    public void act() 
    {
        World world = getWorld(); 
        if((gpState.getState() == State.isCarWashSelected 
           ||gpState.getState() == State.isPrintApproval) && Greenfoot.mousePressed(this)){
            System.out.println("Inside screenDeclineButton for carwash/printApproval");
            ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
            System.out.println("PrintApproval boolean"+rp.getPrintApprovalStatus());
            if(gpState.getState() == State.isPrintApproval){
                rp.setResolver();
                rp.setDisplayedTextOnce();
            }
            gpState.setState(State.isValidatedButUnfueled);
        }
        // Add your action code here.
        if((gpState.getState() == State.isUnInitialized 
        || gpState.getState() == State.isUnValidated) && Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
          gSound.play();
        }
        
        if(gpState.getState() == State.isFilled && Greenfoot.mousePressed(this)){
            //world.removeObjects(getWorld().getObjects(DisplayScreen.class));
            System.out.println("Inside decline button after filling fuel");
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("Thanks for going paperless");
           DisplayScreen ds2 = new DisplayScreen("Bye Bye...");
           
           world.addObject(ds,330,120);
           world.addObject(ds2,320,180);
            
            gpState.setState(State.isOver);
        }
    } 
}
