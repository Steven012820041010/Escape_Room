import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loading_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loading_Page extends World
{

    /**
     * Constructor for objects of class Loading_Page.
     * 
     */
    GreenfootImage loadingRec = new GreenfootImage("redRectangle.png"); // A red rectangle loading bar to show the loading process
    SimpleTimer loadingTimer = new SimpleTimer(); // To control the loading speed
    

    public Loading_Page()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        
        getBackground().drawImage(loadingRec, 236, 153); //Shows the red rectangle loading bar

    }

    public void act(){
        updateLoadingSign();
        
        MainRoom.countDown();
    
    }

    /**
     * Keeps the red progress rectangle moving forward
     */
    public void updateLoadingSign()
    {
        if (loadingTimer.millisElapsed() > 50)
        {
            loadingRec.scale(loadingRec.getWidth() + 30, loadingRec.getHeight());
            ifFinishLoading(); //To check if finished loading
            getBackground().drawImage(loadingRec,236,153);
            loadingTimer.mark();
        }

    }

    /**
     *  Switch to the game after finishing loading 
     */
    public void ifFinishLoading()
    {
        if (loadingRec.getWidth() > 1035) 
        {
           Computer_DMOMG dmomg = new Computer_DMOMG();
           Greenfoot.setWorld(dmomg);
          
        }
    }
}
