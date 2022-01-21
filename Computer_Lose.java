import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Lose extends Computer
{

    /**
     * Constructor for objects of class Computer_Lose.
     * 
     */
    public Computer_Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
    }
    public void act(){
        pressBack();
        closeTab();
        MainRoom.countDown();
    }
    
    
}
