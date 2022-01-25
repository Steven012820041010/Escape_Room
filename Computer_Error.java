import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is also an easter egg, begging Mr.Chan to give us a 100%, or at least 99.99%. LOL (Bill came up with this, not Steven's idea, just 
 * blame bill)
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 19, 2022
 */
public class Computer_Error extends Computer
{
    public void act(){
        restart();
        MainRoom.countDown();
    }
    
    /**
     * Back to the computer screen
     */
    public void restart()
    {
        if (Greenfoot.isKeyDown("space")){
            Computer_Screen cs = new Computer_Screen();
            Greenfoot.setWorld(cs);
        }
        
    }
}
