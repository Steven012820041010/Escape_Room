import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays a question for the user. The question is testing the user's understanding toward the different sorting algorithms and the
 * Big O Notation, which is also called time complexity. Users can submit their solution by clicking "Submit solution" button. Also, they can also
 * cheat by clicking a hidden tab beside the current tab.
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 14, 2022
 */
public class Computer_DMOMG extends Computer
{
    Exit exit = new Exit();
    static boolean canPressSubmit = true; // Determine if user can submit their solution again
    /**
     * Constructor for objects of class Computer_DMOMG.
     * 
     */
    public Computer_DMOMG()
    {
        addObject(exit, 65, 35); //Add the exit button
    }

    public void act()
    {
        MainRoom.countDown();
        closeTab();
        clickSubmit();
        goCheating();
        continueCountdown();
        Computer_Waiting.finish();
    }

    /**
     * Continue to count down the time though leaving the Computer_Waiting world
     */
    public static void continueCountdown(){
        if (!canPressSubmit && Computer_Waiting.currentTime > 0)
            Computer_Waiting.countDown();
    }
    
    /**
     * Switch to the cheating website
     */
    public void goCheating()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 373 && mx < 513 && my > 125 && my < 155) {
                    Computer_Cheating c = new Computer_Cheating();
                    Greenfoot.setWorld(c);
                }
            }
        }
    }

    /**
     * Allow user to submit. If user's previous answer is wrong, user has to wait 10 seconds to submit the solution again.
     */
    public void clickSubmit()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 680 && mx < 860 && my > 230 && my < 260) {
                    if(Computer_Submit.correctOrWrong){
                        canPressSubmit = true;
                        Computer_Submit s = new Computer_Submit();
                        Greenfoot.setWorld(s);
                    }else{
                        canPressSubmit = false;
                        Computer_Waiting w = new Computer_Waiting();
                        Greenfoot.setWorld(w);
                    }
                }
            }
        }
    }
}
