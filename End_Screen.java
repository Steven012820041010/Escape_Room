import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is the end page and tells the user how long they have spent to escape the room
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 19, 2022
 */
public class End_Screen extends World
{
    Label totalTime = new Label (String.valueOf(MainRoom.totalPlayingTime) + " s", 50);
    /**
     * Constructor for objects of class End_Screen.
     * 
     */
    public End_Screen()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(totalTime, 720, 477);
    }

}
