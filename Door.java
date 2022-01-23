import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * This world displays the security lock and user can input their password by pressing the buttons on the lock. If the password is correct, the world
 * will be lead to the end screen; otherwise, an "INCORRECT" sign will be displayed on the screen of the lock
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 15, 2022
 */
public class Door extends World
{
    final int TARGET = 2344; // Correct password 
    Exit exit = new Exit();
    Incorrect incorrect = new Incorrect();

    Stack<Label> p = new Stack<Label>(); // Store the label of the digit
    int l_x = 293; // Current password x-index
    int currDigit = 0; // Record the current single digit that user pressed
    int currPassword = 0; // Record the password that user pressed so far

    /**
     * Constructor for objects of class Door.
     * 
     */
    public Door()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        addObject(exit, 65, 35); //Add the exit button
    }

    public void act(){
        clickLockPassword();
        retract();
        unlock();
        MainRoom.countDown();
    }

    /**
     * Remove the previous password that user just inputs
     */
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

    /**
     * Click the unlock button 
     */
    public void unlock()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 390 && mx < 404 && my > 520 && my < 580) {
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

    /**
     * Click the digit on the lock
     */
    public void clickLockPassword()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 275 && mx < 370 && my > 465 && my < 567){
                    if (mx > 275 && mx < 305 && my > 465 && my <= 497) currDigit = 1;

                    if (mx > 306 && mx < 335 && my > 465 && my <= 497) currDigit = 2;

                    if (mx > 338 && mx < 370 && my > 465 && my <= 497) currDigit = 3;

                    if (mx > 275 && mx < 305 && my > 497 && my <= 533) currDigit = 4;

                    if (mx > 306 && mx < 335 && my > 497 && my <= 533) currDigit = 5;

                    if (mx > 338 && mx < 370 && my > 497 && my <= 533) currDigit = 6;

                    if (mx > 275 && mx < 305 && my > 533 && my <= 567) currDigit = 7;

                    if (mx > 306 && mx < 335 && my > 533 && my <= 567) currDigit = 8;

                    if (mx > 338 && mx < 370 && my > 533 && my <= 567) currDigit = 9;

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
