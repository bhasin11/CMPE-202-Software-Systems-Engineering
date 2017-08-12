/**
 * Write a description of class BuildOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOrder 
{
    public static Component getOrder(){
    Composite scene1 = new Composite();
    //Composite scene1 = new Composite();
    Component registerEvent = new RegisterObserversEvent();
    Component wait4CCEvent = new WaitForCreditCardEvent();
    Component fuelEvent = new FuelEvent();
    Component printRecEvent = new PrintReceiptEvent();
    scene1.addChild(registerEvent);
    scene1.addChild(wait4CCEvent);
    scene1.addChild(fuelEvent);
    scene1.addChild(printRecEvent);
        
  
        
    return scene1;
    }
    
}
