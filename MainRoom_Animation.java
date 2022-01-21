import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainRoom_Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(mR, 565, 400);
    }
    
    public void act()
    {
        if (mR.titleI == 3 && mR.fading.millisElapsed() > 100){
            MainRoom m = new MainRoom();
            Greenfoot.setWorld(m);
            return;
        }
        mR.update();
        
    }
}
