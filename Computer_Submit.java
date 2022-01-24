import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Submit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Submit extends Computer
{

    /**
     * Constructor for objects of class Computer_Submit.
     * 
     */
    int userChoice = 0;

    Pointer pointer = new Pointer();
    Apple apple = new Apple();
    static boolean correctOrWrong = true;
    public Computer_Submit()
    {    

        //addObject(apple, 715, 290);
    }

    public void act()
    {
        pressBack();
        closeTab();
        pressDigitButton();
        sumbitSolution();
        
    }

    public void pressDigitButton()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 263 && mx < 293 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 1;
                    removeObject(pointer);
                    addObject(pointer, 277, 330);
                }
                if ((mx > 298 && mx < 328 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 2;
                    removeObject(pointer);
                    addObject(pointer, 312, 330);
                }
                if ((mx > 333 && mx < 363 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 3;
                    removeObject(pointer);
                    addObject(pointer, 347, 330);
                }
                if ((mx > 368 && mx < 398 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 4;
                    removeObject(pointer);
                    addObject(pointer, 382, 330);
                }
                if ((mx > 403 && mx < 433 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 5;
                    removeObject(pointer);
                    addObject(pointer, 417, 330);
                }
                if ((mx > 438 && mx < 468 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 6;
                    removeObject(pointer);
                    addObject(pointer, 452, 330);
                }
                if ((mx > 473 && mx < 503 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 7;
                    removeObject(pointer);
                    addObject(pointer, 487, 330);
                }
                if ((mx > 508 && mx < 538 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 8;
                    removeObject(pointer);
                    addObject(pointer, 522, 330);
                }
                if ((mx > 543 && mx < 573 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 9;
                    removeObject(pointer);
                    addObject(pointer, 557, 330);
                }
                if ((mx > 578 && mx < 608 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    userChoice = 10;
                    removeObject(pointer);
                    addObject(pointer, 592, 330);
                }
            }
        }
    
    }

    

    public void sumbitSolution()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 670 && mx < 760 && my > 270 && my < 310)) {//min and max should be the edges of the area;
                    if (userChoice == 3 || userChoice == 5)
                    {
                        correctOrWrong = true;
                        Computer_Win cW = new Computer_Win();
                        Greenfoot.setWorld(cW);
                    }else{
                        correctOrWrong = false;
                        Computer_Waiting.initialize();
                        Computer_Lose cL = new Computer_Lose();
                        Greenfoot.setWorld(cL);
                    }
                }
            }
        }

    }

}
