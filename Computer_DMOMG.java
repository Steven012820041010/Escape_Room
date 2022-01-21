import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_DMOMG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_DMOMG extends Computer
{
    Exit exit = new Exit();
    Apple apple = new Apple();
    static boolean canPressSubmit = true;
    /**
     * Constructor for objects of class Computer_DMOMG.
     * 
     */
    public Computer_DMOMG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1130, 800, 1);
        //addObject(apple, 317, 140);
        addObject(exit, 65, 35);
    }

    public void act()
    {
        closeTab();
        clickSubmit();
        goCheating();
        continueCountdown();
        Computer_Waiting.finish();
        MainRoom.countDown();
    }

    public static void continueCountdown(){
        if (!canPressSubmit && Computer_Waiting.currentTime > 0){
            Computer_Waiting.countDown();
            
        }
    }
    
    public void goCheating()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 373 && mx < 513 && my > 125 && my < 155) {//min and max should be the edges of the area;
                    Computer_Cheating c = new Computer_Cheating();
                    Greenfoot.setWorld(c);
                }
            }
        }
    }

    public void clickSubmit()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 680 && mx < 860 && my > 230 && my < 260) {//min and max should be the edges of the area;
                    if(Computer_Submit.correctOrWrong){
                        canPressSubmit = true;
                        Computer_Submit s = new Computer_Submit();
                        Greenfoot.setWorld(s);
                    }else{
                        canPressSubmit = false;
                        Computer_Waiting w = new Computer_Waiting();
                        Greenfoot.setWorld(w);
                    }
                }
            }
        }
    }

}
