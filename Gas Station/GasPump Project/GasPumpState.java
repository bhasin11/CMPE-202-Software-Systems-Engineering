/**
 * Write a description of class GasPumpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class GasPumpState implements Subject
{
    private List<Observer> observerList = new ArrayList<Observer>();

    private State myState;

    
    private static GasPumpState instance = null;
    
    private GasPumpState(){
        super();
    }
    
    public static GasPumpState getInstance(){
        if(instance == null)
            instance = new GasPumpState();
        return instance;
    }
    
    public void register(Observer o){
        observerList.add(o);
        
    }
    
    public void unregister(Observer o){
        observerList.remove(o);
    }
    public void setState(State state){
        myState = state;
        notifyObservers();
    }
    
    public State getState(){
        return myState;
    }
    private void notifyObservers(){
     for(Observer o: observerList){
         //o.act();
        
        
     }
     System.out.println("All observers notified");   
    }
}
