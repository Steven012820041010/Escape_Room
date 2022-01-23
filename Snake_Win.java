import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is the winning page if user scores 15 points
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 11, 2022
 */
public class Snake_Win extends World
{

    Exit exit = new Exit();
    static boolean win = false;
    /**
     * Constructor for objects of class Snake_Win.
     * 
     */
    public Snake_Win()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        win = true;
        addObject(exit, 65, 35);
    }
    
    public void act()
    {
        MainRoom.countDown();
    }
}
