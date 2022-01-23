import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the error page if the user submit the wrong answer
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 18, 2022
 */
public class Computer_Lose extends Computer
{
    public void act(){
        MainRoom.countDown();
        pressBack();
        closeTab();
    }

}
