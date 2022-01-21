import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_Animation extends World

{
    Doors d = new Doors();
    /**
     * Constructor for objects of class Door_Animation.
     * 
     */
    public Door_Animation()
    {
        super(1130, 800, 1);
        addObject(d, 565, 400);
    }
    
    public void act()
    {
        if (d.titleI == 3 && d.fading.millisElapsed() > 600){
            End_Screen eS = new End_Screen();
            Greenfoot.setWorld(eS);
            return;
        }
        d.update();
        
    }
    
}
