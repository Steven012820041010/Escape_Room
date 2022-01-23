import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the clue that user gets from the safe deposit box
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 11, 2022
 */
public class ClueFromDeposit extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromDeposit.
     * 
     */
    public ClueFromDeposit()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(exit, 65, 35); //Add the exit button
    }
    public void act()
    {
        MainRoom.countDown(); //Keep recording the time the user takes
    }
}
