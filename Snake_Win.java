import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake_Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        win = true;
        addObject(exit, 65, 35);
    }
    
    public void act()
    {
        MainRoom.countDown();
    }
}
