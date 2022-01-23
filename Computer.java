import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world controls all the games and pages and providing 2 methods, "closeTab" and "pressBack" that can be both used in all the sub-classes
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 15, 2022
 */
public class Computer extends World
{
    /**
     * Constructor for objects of class Computer.
     * 
     */
    public Computer()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1);
    }

    /**
     * Click the 'x' to close the tab on the computer
     */
    public void closeTab()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 852 && mx < 872 && my > 110 && my < 130) {
                    Computer_Screen cS = new Computer_Screen(); // Switch to the main computer screen
                    Greenfoot.setWorld(cS);
                }
            }
        }
    }

    /**
     * Return to the question page by clicking the 'Back' button
     */
    public void pressBack()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 265 && mx < 306 && my > 469 && my < 479)) {
                    Computer_DMOMG d = new Computer_DMOMG(); // Switch to the question page
                    Greenfoot.setWorld(d);
                }
            }
        }

    }
}
