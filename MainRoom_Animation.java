import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the animaition of fading of main room
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 18, 2022
 */
public class MainRoom_Animation extends World
{
    MainRooms mR = new MainRooms();
    /**
     * Constructor for objects of class MainRoom_Animation.
     * 
     */
    public MainRoom_Animation()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(mR, 565, 400);
    }
    
    public void act()
    {
        if (mR.titleI == 3 && mR.fading.millisElapsed() > 100){ //Finish Animation
            MainRoom m = new MainRoom();
            Greenfoot.setWorld(m);
            return;
        }
        mR.update();

    }
}
