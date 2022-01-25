import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will show the third clue at the printer when user passes the hunger snake game
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 13, 2022
 */
public class PrinterClue extends Props
{
    /**
     * Act - do whatever the PrinterClue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            ClueFromPrinter cFP = new ClueFromPrinter();
            Greenfoot.setWorld(cFP);
        }
    }    
}
