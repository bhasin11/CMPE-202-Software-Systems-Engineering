/**
 * Write a description of class CarWashEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashEvent implements Component 
{
    private boolean hasRan = false;
    public void startEvent(){
     GasPumpState gpState = GasPumpState.getInstance();
     
     if((gpState.getState() == State.isValidatedButUnfueled 
         || gpState.getState() == State.isCarWashSelected) && !hasRan)
     {
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
     DisplayScreen ds3 = new DisplayScreen("Do you want to add a \nCar wash for $5.00?\n Discount 20% on Fuel");
     GasPumpWorld.gpWorld.addObject(ds3,330,150);
     DisplayScreen ds4 = new DisplayScreen("OK");
     DisplayScreen ds5 = new DisplayScreen("NO");
     GasPumpWorld.gpWorld.addObject(ds4,190,200);
     GasPumpWorld.gpWorld.addObject(ds5,460,100);
     gpState.setState(State.isCarWashSelected);
     System.out.println("CarWashEvent Running");
     hasRan=true;
        }   
    }
}
