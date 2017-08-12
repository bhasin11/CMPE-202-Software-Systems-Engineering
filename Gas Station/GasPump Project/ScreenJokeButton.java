import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.*;
/**
 * Prints random jokes to user - after validation
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenJokeButton extends ScreenButtons
{
    /**
     * . This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        GasPumpState gpState = GasPumpState.getInstance();
        
        if((gpState.getState() == State.isUnValidated || gpState.getState() == State.isUnInitialized) && Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
        else if(Greenfoot.mousePressed(this)){
            World world = getWorld();   
            world.removeObjects(getWorld().getObjects(DisplayScreen.class));
            List<String> jokesList = new ArrayList<String>();
            jokesList.add("Team work is important; it helps to\n put the blame on someone else.");
            jokesList.add("You're not fat, you're just... \n\teasier to see.");
            jokesList.add("My wife and I were happy for twenty years. \nThen we met.");
            int randomNum = ((int)((Math.random()*jokesList.size())%jokesList.size()));
            DisplayScreen ds = new DisplayScreen(jokesList.get(randomNum));

                world.addObject(ds,340,250);
        }
    }    
}
