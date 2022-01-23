import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world tells that the snake is either touching itself or touching the wall
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 11, 2022
 */
public class Snake_Lose extends World
{

    /**
     * Constructor for objects of class Snake_End.
     * 
     */
    public Snake_Lose()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
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
