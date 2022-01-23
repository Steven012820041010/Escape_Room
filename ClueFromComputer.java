import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays the clue on computer that user solves the question 
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 17, 2022
 */
public class ClueFromComputer extends World
{
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ClueFromComputer.
     * 
     */
    public ClueFromComputer()
    {    
        // Create a new world with 1130x800 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        MainRoom.computer = true; // Sets the boolean "computer" to true
        //addObject(exit, 65, 35); // Add the exit button 
    }
    
    /**
     * Click the 'x' to close the tab on the computer
     */
    public void closeTab()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 852 && mx < 872 && my > 110 && my < 130) {
                    Computer_Screen cS = new Computer_Screen(); // Switch to the main computer screen
                    Greenfoot.setWorld(cS);
                }
            }
        }
    }
    
    public void act()
    {
        MainRoom.countDown(); //Keep recording the time the user takes
        closeTab();
    }
}
