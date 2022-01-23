import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the animaition of opening the door
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 19, 2022
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
        if (d.titleI == 3 && d.fading.millisElapsed() > 600){ //Finish Animation
            End_Screen eS = new End_Screen(); 
            Greenfoot.setWorld(eS);
            return;
        }
        d.update();

    }
    
}
