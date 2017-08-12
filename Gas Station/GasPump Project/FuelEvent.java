/**
 * Write a description of class FuelEven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
public class FuelEvent implements Component 
{
        
    public void startEvent(){
    GasPumpState gpState = GasPumpState.getInstance();
    
    if(gpState.getState() == State.isValidatedButUnfueled){
        //do not proceed until proper state is set
        Fuel93 f93 = GasPumpWorld.gpWorld.getObjects(Fuel93.class).get(0);
        Fuel87 f87 = GasPumpWorld.gpWorld.getObjects(Fuel87.class).get(0);
        Fuel89 f89 = GasPumpWorld.gpWorld.getObjects(Fuel89.class).get(0);
        System.out.println("Fuel event Start Triggered");
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
        DecimalFormat df = new DecimalFormat("0.00");
        DisplayScreen ds = new DisplayScreen("Please select the Fuel type");
        DisplayScreen ds2 = new DisplayScreen("$"+(df.format(f93.getPrice())+"/\ngal."));
        DisplayScreen ds3 = new DisplayScreen("$"+String.valueOf(df.format(f89.getPrice())+"/\ngal."));
        DisplayScreen ds4 = new DisplayScreen("$"+String.valueOf(df.format(f87.getPrice())+"/\ngal."));
        GasPumpWorld.gpWorld.addObject(ds2,250,240);
         GasPumpWorld.gpWorld.addObject(ds3,340,240);
         GasPumpWorld.gpWorld.addObject(ds4,430,240);
         GasPumpWorld.gpWorld.addObject(ds,320,150); 
           
          // GasPumpWorld.gpWorld.addObject(ds,350,250);

    f93.setToWorkingState();
    //System.out.println("Commanded Fuel93 to start working");

    f87.setToWorkingState();
    


    f89.setToWorkingState();
    }
    
    
    }

    }
