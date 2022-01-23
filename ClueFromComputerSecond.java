import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the clue in annother way if user solves the question and wants to check the clue again
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 21, 2022
 */
public class ClueFromComputerSecond extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromComputerSecond.
     * 
     */
    public ClueFromComputerSecond()
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
