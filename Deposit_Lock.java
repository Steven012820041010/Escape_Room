import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class detects whether user has touched this object yet or not
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 13, 2022
 */
public class Deposit_Lock extends Props
{
    /**
     * Act - do whatever the Deposit_Lock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public boolean click()
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            return true;
        }
        return false;
    }
}
