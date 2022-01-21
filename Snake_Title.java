import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake_Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake_Title extends World
{

    /**
     * Constructor for objects of class Snake_Title.
     * 
     */

    public static Music figure = new Music();
    Exit exit = new Exit();

    public Snake_Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(exit, 65, 35);
        addObject(figure,160,550);

    }
    public void act()
    {
        pressSpace();
        MainRoom.countDown();
    }
    public void pressSpace()
    {

        if(Greenfoot.isKeyDown("space"))
        {
            Snake_Play sP = new Snake_Play();
            Greenfoot.setWorld(sP);
        }
    }

}
