import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is kind of a loading page from Computer_Win to ClueFromComputer
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 15, 2022
 */
public class Computer_Redirecting extends Computer
{
    public void act(){
        MainRoom.countDown();
        ClueFromComputer cFC = new ClueFromComputer();
        Greenfoot.delay(200); //Wait
        Greenfoot.setWorld(cFC);
    }
}
