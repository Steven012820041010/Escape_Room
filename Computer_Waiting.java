import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Waiting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Waiting extends Computer
{
    static SimpleTimer countTime = new SimpleTimer();
    static int currentTime = 15;
    static Label time = new Label (currentTime, 30);
    /**
     * Constructor for objects of class Computer_Waiting.
     * 
     */
    public Computer_Waiting()
    {
        countTime.mark();
        //initialize();
        time.setFillColor(Color.BLACK);
        addObject(time, 358, 350);
    }

    public void act()
    {
        countDown();
        pressBack();
        finish();
        MainRoom.countDown();
    }

    public static void initialize()
    {
        if (currentTime == 0){
            currentTime = 15;
            time = new Label (currentTime, 30);
        }
    }

    public static void finish()
    {
        if (currentTime == 0)
        {
            Computer_DMOMG.canPressSubmit = true;
            Computer_Submit.correctOrWrong = true;
        }
    }

    public static void countDown(){
        if (countTime.millisElapsed() > 1000 && !Computer_DMOMG.canPressSubmit && currentTime > 0)
        {
            countTime.mark();
            currentTime--;
            time.setValue(currentTime);
        }

    }
}
