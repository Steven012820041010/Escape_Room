import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClueFromComputer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClueFromComputer extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromComputer.
     * 
     */
    public ClueFromComputer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        MainRoom.computer = true;
        addObject(exit, 65, 35);
    }
    
    public void act()
    {
        MainRoom.countDown();
    }
}
