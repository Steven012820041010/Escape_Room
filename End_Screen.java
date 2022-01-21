import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End_Screen extends World
{

    Label totalTime = new Label (String.valueOf(MainRoom.totalPlayingTime) + " s", 50);
    static int bestTime = Math.min(MainRoom.totalPlayingTime, 10000);
    //Label totalEgg = new Label (50, 50);
    /**
     * Constructor for objects of class End_Screen.
     * 
     */
    public End_Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(totalTime, 720, 477);
        //addObject(totalEgg, 720, 563);
    }
    
   
}
