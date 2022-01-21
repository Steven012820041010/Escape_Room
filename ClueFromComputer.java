import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClueFromComputer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClueFromComputer extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromComputer.
     * 
     */
    public ClueFromComputer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        MainRoom.computer = true;
        addObject(exit, 65, 35);
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
    
    public void act()
    {
        MainRoom.countDown();
        closeTab();
    }
}
