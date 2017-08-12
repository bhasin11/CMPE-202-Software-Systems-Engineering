import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public static GasPumpWorld gpWorld;
    
    public GasPumpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        gpWorld = this;
    }
    
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare(){
        GasPumpMachine gasMachine = new GasPumpMachine();
        //System.out.println("Initializing World");
        addObject(gasMachine, 420, 290);
        addObject( new RealCard(), 100, 300 );
        //addObject( new FakeCard(), 57, 100 );
        addObject( new CardSlot(),230,480);
        addObject( new DisplayScreen(), 367, 367 ) ;
        addObject( new Keypad(), 430, 500);
        addObject( new NozzleHole(), 650, 80);
        addObject( new Nozzle(), 720,140);
        addObject( new Fuel93(),250,350);
        addObject( new Fuel89(),340,350);
        addObject( new Fuel87(),430,350);
        addObject( new ReceiptPrinter(),630,350);
        
        addObject( new ScreenOKButton(),140,200);
        addObject( new ScreenDummyButton(),140,150);
        addObject( new ScreenJokeButton(),140,100);
        addObject( new ScreenMoreAssistButton(),140,50);

        addObject( new ScreenDeclineButton(),508,100);
        addObject( new ScreenDummyButton(),508,150);
        addObject( new ScreenAbortButton(),508,200);
        addObject( new ScreenHelpButton(),508,50);
        addObject( new Scenario1(),15,18);
        addObject( new Scenario2(),15,50);
        addObject( new Scenario3(),15,82);
       
    }

    
}


