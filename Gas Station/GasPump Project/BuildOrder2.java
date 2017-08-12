/**
 * Write a description of class BuildOrder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOrder2 
{
    public static Component getOrder(){
    Composite scene2 = new Composite();
    //Composite scene1 = new Composite();
    Component registerEvent = new RegisterObserversEvent();
    Component wait4CCEvent = new WaitForCreditCardEvent();
    Component carWashEvent = new CarWashEvent();
    Component fuelEvent = new FuelEvent();
    Component printRecEvent = new PrintReceiptEvent();
    scene2.addChild(registerEvent);
    scene2.addChild(wait4CCEvent);
    scene2.addChild(carWashEvent);
    scene2.addChild(fuelEvent);
    scene2.addChild(printRecEvent);
        
  
        
    return scene2;
    }
    
}