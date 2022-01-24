import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world lets user to wait 10 seconds before they can submit their solution again
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 17, 2022
 */
public class Computer_Waiting extends Computer
{
    static SimpleTimer countTime = new SimpleTimer(); // Control the speed of count down time
    static int currentTime = 5; // Waiting for user to resumbit their solution
    static Label time = new Label (currentTime, 30); // Display the time that has left for user to resubmit
    static boolean returnDMOMG = false;
    /**
     * Constructor for objects of class Computer_Waiting.
     * 
     */
    public Computer_Waiting()
    {
        countTime.mark();
        returnDMOMG = false;
        time.setFillColor(Color.BLACK); // Set the label "time" to color black
        addObject(time, 358, 350); // Display the time on the screen
    }

    public void act()
    {
        countDown();
        pressBack();
        finish();
        canReturn();
        MainRoom.countDown();
    }

    /**
     * Reset the waiting time
     */
    public static void initialize()
    {
        if (currentTime == 0){
            currentTime = 5;
            
            time = new Label (currentTime, 30); // reinitializing the variable
        }
    }

    /**
     * Set the boolean variables to true and then allow the user to submit the solution again
     */
    public static void finish()
    {
        if (currentTime == 0)
        {
            Computer_DMOMG.canPressSubmit = true;
            Computer_Submit.correctOrWrong = true;
            returnDMOMG = true;
        }
    }
    
    public void canReturn()
    {
        if (returnDMOMG){
            
            Computer_DMOMG cd = new Computer_DMOMG();
            Greenfoot.setWorld(cd);
        }
    }
    

    /**
     * Count down the time, in seconds
     */
    public static void countDown(){
        if (countTime.millisElapsed() > 1000 && !Computer_DMOMG.canPressSubmit && currentTime > 0)
        {
            countTime.mark();
            currentTime--;
            time.setValue(currentTime);
        }

    }
}
