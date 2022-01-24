import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for user to return to the MainRoom
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 10, 2022
 */
public class Exit extends Helper
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            MainRoom mR = new MainRoom();
            Greenfoot.setWorld(mR);
        }
    }    
    
    
}
