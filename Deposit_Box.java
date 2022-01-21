import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deposit_Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deposit_Box extends Actor
{
    /**
     * Act - do whatever the Deposit_Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        touchKeyHint();
    }    
    public void touchKeyHint()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 70 && mx < 92 && my > 460 && my < 495) {//min and max should be the edges of the area;
                    MainRoom.deposit = true;
                    ClueFromDeposit cFD = new ClueFromDeposit();
                    Greenfoot.setWorld(cFD);
                }
            }
        }
    }
}
