import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer extends World
{

    /**
     * Constructor for objects of class Computer.
     * 
     */
    public Computer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1);
    }
    
    public void closeTab()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            
            if (Greenfoot.mouseClicked(null)) {
                //System.out.println(mx);
                //System.out.println(my);
                if (mx > 852 && mx < 872 && my > 110 && my < 130) {//min and max should be the edges of the area;
                    Computer_Screen cS = new Computer_Screen();
                    Greenfoot.setWorld(cS);
                }
            }
        }
    }
    
    public void pressBack()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 265 && mx < 306 && my > 469 && my < 479)) {//min and max should be the edges of the area;
                    Computer_DMOMG d = new Computer_DMOMG();
                    Greenfoot.setWorld(d);
                }
            }
        }

    }
}
