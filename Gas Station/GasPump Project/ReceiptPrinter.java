import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiptPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiptPrinter extends Actor
{
    /**
     * Act - do whatever the ReceiptPrinter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean isWorking = false;
    private boolean printApproval =false;
    private boolean displayedTextOnce = false;
    private boolean resolver = true;
    
    public void setPrintApproval(){
    printApproval = true;
    
    }
    
    public boolean getPrintApprovalStatus(){
    return printApproval;
    
    }
    public void setDisplayedTextOnce(){
        displayedTextOnce=true;
    }
    public void setToWorkingState(){
        isWorking = true;
    }
    public void setResolver(){
     resolver=false;
    }
    public boolean isWorking(){
    
        return isWorking;
    }
    
    private void startPrintingReceipt(){
    GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        World world = getWorld();
        //System.out.println("PrintApproval :"+printApproval);
        if(gpState.getState() == State.isFilled){
            if (!printApproval && !displayedTextOnce){
                
           
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
            DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
            DisplayScreen ds2 = new DisplayScreen("YES");
            DisplayScreen ds3 = new DisplayScreen("NO");
            world.addObject(ds1,330,150);
            world.addObject(ds2,190,200);
            world.addObject(ds3,460,100);
            displayedTextOnce = true;
            
        }
           
            //If yes
            if(printApproval){
                Receipt receipt = new Receipt();
                world.addObject(receipt,550,450);
                
                gpState.setState(State.isPrintReceipt);
                
            
            }
            
         if(!resolver){
            gpState.setState(State.isPrintReceipt);
            resolver = true;
            }
            
        
        }
    
    }
    public void act() 
    {
        if (isWorking){
           startPrintingReceipt();
        }
        else if(Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
    }    
}