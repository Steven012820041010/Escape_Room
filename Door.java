import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends World
{
    Exit exit = new Exit();
    Apple apple = new Apple();
    Incorrect incorrect = new Incorrect();

    int currDigit = 0;
    int currPassword = 0;
    Stack<Label> p = new Stack<Label>();

    int l_x = 293;
    boolean hasChange = false;
    final int TARGET = 2344;
    /**
     * Constructor for objects of class Door.
     * 
     */
    public Door()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(exit, 65, 35);
        
        //addObject(apple, 397, 480);
    }

    public void act(){
        touchLock();
        retract();
        unlock();
        
        MainRoom.countDown();
    
    }

    public void retract()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (!p.isEmpty() && mx > 390 && mx < 404 && my > 460 && my < 500) {
                    removeObject(incorrect);
                    removeObject(p.pop());
                    currPassword /= 10;
                    l_x -= 33;
                }
            }
        }
    }

    public void unlock()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 390 && mx < 404 && my > 520 && my < 580) {
                    System.out.println(currPassword);
                    if (currPassword == TARGET){
                        
                        Door_Animation dA = new Door_Animation();
                        Greenfoot.setWorld(dA);
                    }else{
                        addObject(incorrect, 345, 420);
                    }
                }
            }
        }
    }

    public void touchLock()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                System.out.println(mx);
                System.out.println(my);
                
                if (mx > 275 && mx < 370 && my > 465 && my < 567){
                    if (mx > 275 && mx < 305 && my > 465 && my <= 497) {//min and max should be the edges of the area;
                        currDigit = 1;
                    }
                    if (mx > 306 && mx < 335 && my > 465 && my <= 497) {//min and max should be the edges of the area;
                        currDigit = 2;
                    }
                    if (mx > 338 && mx < 370 && my > 465 && my <= 497) {//min and max should be the edges of the area;
                        currDigit = 3;
                    }
                    if (mx > 275 && mx < 305 && my > 497 && my <= 533) {//min and max should be the edges of the area;
                        currDigit = 4;
                    }
                    if (mx > 306 && mx < 335 && my > 497 && my <= 533) {//min and max should be the edges of the area;
                        currDigit = 5;
                    }
                    if (mx > 338 && mx < 370 && my > 497 && my <= 533) {//min and max should be the edges of the area;
                        currDigit = 6;
                    }

                    if (mx > 275 && mx < 305 && my > 533 && my <= 567) {//min and max should be the edges of the area;
                        currDigit = 7;

                    }
                    if (mx > 306 && mx < 335 && my > 533 && my <= 567) {//min and max should be the edges of the area;
                        currDigit = 8;
                    }
                    if (mx > 338 && mx < 370 && my > 533 && my <= 567) {//min and max should be the edges of the area;
                        currDigit = 9;
                    }

                    if (currDigit != 0 && p.size() < 4){
                        Label l = new Label (currDigit, 45);
                        l.setLineColor(Color.WHITE);
                        p.push(l);
                        currPassword = (currPassword) * 10 + currDigit;
                        addObject(l, l_x, 426);
                        l_x += 33;
                    }
                }
            }

        }
    }

}
