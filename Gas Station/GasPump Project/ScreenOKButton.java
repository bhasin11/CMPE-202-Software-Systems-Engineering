import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenOKButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenOKButton extends ScreenButtons
{
    /**
     * Act - do whatever the ScreenOKButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
  //  rp.setPrintApproval();
     GasPumpState gpState = GasPumpState.getInstance();
     private boolean carWashSelected = false;
     
     public boolean getCarWashSelectedStatus(){
        return carWashSelected;
        
        }
     
    public void act() 
    {
            World world = getWorld(); 
        if((gpState.getState() == State.isCarWashSelected 
           ||gpState.getState() == State.isPrintApproval) && Greenfoot.mousePressed(this)){
            ReceiptPrinter rp=world.getObjects(ReceiptPrinter.class).get(0);
            
            System.out.println("Inside screenOKButton for carwash and setting PrintApproval to yes");
            if(gpState.getState() == State.isCarWashSelected){
                System.out.println("Setting carwashSelected boolean to true");
                carWashSelected = true;
            }
            gpState.setState(State.isValidatedButUnfueled);
            rp.setPrintApproval();
        }
       
        
        if((gpState.getState() == State.isUnInitialized
        || gpState.getState() == State.isUnValidated) && Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
          gSound.play();
        }
        // Add your action code here.
        
        
        if(gpState.getState() == State.isFilled && Greenfoot.mousePressed(this)){

        world.removeObjects(getWorld().getObjects(DisplayScreen.class));
        DisplayScreen ds1 = new DisplayScreen("Printing Receipt! ");
        world.addObject(ds1,100,250);
        ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
        rp.setPrintApproval();
        Receipt receipt = new Receipt();
        world.addObject(receipt,550,450);
        gpState.setState(State.isPrintReceipt);
        
        }
    }    
}