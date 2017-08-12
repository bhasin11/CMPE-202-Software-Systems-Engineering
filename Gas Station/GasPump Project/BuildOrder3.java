/**
 * Write a description of class BuildOrder3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOrder3  
{
   public static Component getOrder(){
    Composite scene3 = new Composite();
    //Composite scene1 = new Composite();
    Component registerEvent = new RegisterObserversEvent();
    Component wait4CCEvent = new WaitForCreditCardEvent();
    Component printApprovalEvent = new PrintApprovalEvent();
    Component fuelEvent = new FuelEvent();
    Component printRecEvent = new PrintReceiptEvent();
    scene3.addChild(registerEvent);
    scene3.addChild(wait4CCEvent);
    scene3.addChild(printApprovalEvent);
    scene3.addChild(fuelEvent);
    scene3.addChild(printRecEvent);
        
  
        
    return scene3;
    }
}
