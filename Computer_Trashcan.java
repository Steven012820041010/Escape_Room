import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Trashcan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Trashcan extends Computer
{

    /**
     * Constructor for objects of class Computer_Trashcan.
     * 
     */
    Greenfoot_Error gE = new Greenfoot_Error();
    boolean canTouch = true;
    public Computer_Trashcan()
    {
    }

    public void act()
    {
        if(canTouch){
            close();
            clickPastProjects();
        }
        clickOk();
        MainRoom.countDown();
    }

    public void clickOk()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                System.out.println(mx);
                System.out.println(my);
                if (mx > 670 && mx < 742 && my > 368 && my < 387) {//min and max should be the edges of the area;
                    removeObject(gE);
                    canTouch = true;
                }
            }
        }

    }

    public void clickPastProjects()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                System.out.println(mx);
                System.out.println(my);
                if (mx > 423 && mx < 589 && my > 205 && my < 259) {//min and max should be the edges of the area;
                    addObject(gE, 600, 350);
                    canTouch = false;
                }
            }
        }
    }

    public void close()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                //System.out.println(mx);
                // System.out.println(my);
                if (mx > 789 && mx < 803 && my > 157 && my < 172) {//min and max should be the edges of the area;
                    Computer_Screen cS = new Computer_Screen();
                    Greenfoot.setWorld(cS);
                }
            }
        }
    }
}
