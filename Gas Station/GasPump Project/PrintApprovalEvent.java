/**
 * Write a description of class PrintApprovalEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintApprovalEvent implements Component
{
    private boolean hasRan = false;
  public void startEvent(){
      GasPumpState gpState = GasPumpState.getInstance();
      
        if((gpState.getState() == State.isValidatedButUnfueled
            || gpState.getState() == State.isPrintApproval) && !hasRan ){
        //ReceiptPrinter rp = GasPumpWorld.gpWorld.getObjects(ReceiptPrinter.class).get(0);
        //rp.setPrintApproval();
        
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
        DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
        GasPumpWorld.gpWorld.addObject(ds1,340,150);
        DisplayScreen ds4 = new DisplayScreen("OK");
        DisplayScreen ds5 = new DisplayScreen("NO");
        GasPumpWorld.gpWorld.addObject(ds4,190,200);
        GasPumpWorld.gpWorld.addObject(ds5,460,100);
        gpState.setState(State.isPrintApproval);
        hasRan = true;
        }
      
  }
}
