import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the computer screen and with many softwares on the screen such as trash can, file explorer, some web browser, greenfoot, 
 * and maze game. By clicking different softwares, there will be different scenario.
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 12, 2022
 */
public class Computer_Screen extends Computer
{
    Exit exit = new Exit();
    File_Explorer fE = new File_Explorer();
    boolean openFile = false;
    /**
     * Constructor for objects of class Computer_Screen.
     * 
     */
    public Computer_Screen()
    {    
        Computer_Maze.totalStep = 0; // set the maze step to zero
        addObject(exit, 65, 35);
    }

    public void act()
    {
        touchFileExplorer();
        closeFile();
        touchChrome();
        touchGreenfoot();
        touchTrashCan();
        touchMaze();
        MainRoom.countDown();
    }

    public void touchGreenfoot()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 495 && mx < 535 && my > 395 && my < 440)) {
                    Computer_Error e = new Computer_Error();
                    Greenfoot.setWorld(e);
                }
            }
        }

    }

    public void touchMaze()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 605 && mx < 661 && my > 400 && my < 461)) {
                    Computer_Maze m = new Computer_Maze();
                    Greenfoot.setWorld(m);
                }
            }
        }

    }

    public void touchTrashCan()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 130 && mx < 180 && my > 100 && my < 160)) {
                    Computer_Trashcan cT = new Computer_Trashcan();
                    Greenfoot.setWorld(cT);
                }
            }
        }

    }

    public void touchFileExplorer()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 130 && mx < 180 && my > 215 && my < 250) || (mx > 206 && mx < 246 && my > 533 && my < 573)) {
                    openFile = true;
                    addObject(fE, 580, 310);
                }
            }
        }

    }

    public void touchChrome()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 130 && mx < 180 && my > 315 && my < 370 || (mx > 270 && mx < 310 && my > 533 && my < 573)) {
                    Loading_Page loading = new Loading_Page();
                    Greenfoot.setWorld(loading);
                }
            }
        }

    }

    public void closeFile()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 803 && mx < 823 && my > 145 && my < 165 && openFile) {
                    openFile = false;
                    removeObject(fE);
                }
            }
        }
    }
}
