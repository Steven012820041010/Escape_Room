import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Error here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Error extends Computer
{

    /**
     * Constructor for objects of class Computer_Error.
     * 
     */
    public Computer_Error()
    {
        
    }
    
    public void act(){
        restart();
        MainRoom.countDown();
    }
    
    public void restart()
    {
        if (Greenfoot.isKeyDown("space")){
            Computer_Screen cs = new Computer_Screen();
            Greenfoot.setWorld(cs);
        }
        
    }
}
