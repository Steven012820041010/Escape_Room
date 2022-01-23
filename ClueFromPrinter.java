import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the clue that user gets from the printer by winning the hunger snake game
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 10, 2022
 */
public class ClueFromPrinter extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromPrinter.
     * 
     */
    public ClueFromPrinter()
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
