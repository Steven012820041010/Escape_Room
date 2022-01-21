import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Win extends Computer
{

    /**
     * Constructor for objects of class Computer_Win.
     * 
     */
    public Computer_Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
    }
    
    public void act()
    {
        closeTab();
        pressContinue();
        MainRoom.countDown();
    }
    
    public void pressContinue(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 265 && mx < 325 && my > 469 && my < 479)) {//min and max should be the edges of the area;
                    Computer_Redirecting r = new Computer_Redirecting();
                    Greenfoot.setWorld(r);
                }
            }
        }
    }
    
    
}
