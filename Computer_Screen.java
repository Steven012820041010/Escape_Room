import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Screen extends Computer
{
    Exit exit = new Exit();
    Apple apple = new Apple();
    File_Explorer fE = new File_Explorer();

    boolean openFile = false;
    /**
     * Constructor for objects of class Computer_Screen.
     * 
     */
    public Computer_Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        Computer_Maze.totalStep = 0;
        //addObject(apple, 515, 425);
        addObject(exit, 65, 35);
        //addObject(fE, 580, 310);
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
                if ((mx > 495 && mx < 535 && my > 395 && my < 440)) {//min and max should be the edges of the area;
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
                //System.out.println(mx);
                //System.out.println(my);
                if ((mx > 605 && mx < 661 && my > 400 && my < 461)) {//min and max should be the edges of the area;
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
                if ((mx > 130 && mx < 180 && my > 100 && my < 160)) {//min and max should be the edges of the area;
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
                if ((mx > 130 && mx < 180 && my > 215 && my < 250) || (mx > 206 && mx < 246 && my > 533 && my < 573)) {//min and max should be the edges of the area;
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
                if (mx > 130 && mx < 180 && my > 315 && my < 370 || (mx > 270 && mx < 310 && my > 533 && my < 573)) {//min and max should be the edges of the area;
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
                if (mx > 803 && mx < 823 && my > 145 && my < 165 && openFile) {//min and max should be the edges of the area;
                    openFile = false;
                    removeObject(fE);
                }
            }
        }
    }
}
