import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the winning page if the user submit the correct answer
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 18, 2022
 */
public class Computer_Win extends Computer
{
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
                if ((mx > 265 && mx < 325 && my > 469 && my < 479)) {
                    Computer_Redirecting r = new Computer_Redirecting();
                    Greenfoot.setWorld(r);
                }
            }
        }
    }
    
    
}
