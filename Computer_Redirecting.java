import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Redirecting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Redirecting extends Computer
{
    
    /**
     * Constructor for objects of class Computer_Redirecting.
     * 
     */
    public Computer_Redirecting()
    {
        
    }
    public void act(){
        MainRoom.countDown();
        ClueFromComputer cFC = new ClueFromComputer();
        Greenfoot.delay(200);
        Greenfoot.setWorld(cFC);
    }
}
