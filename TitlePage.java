import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends World
{

    SimpleTimer space = new SimpleTimer();
    Main main = new Main();
    Press_Space pS = new Press_Space();

    int currState = 1; //0: no text; 1: yes text
    boolean tran = false;
    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        space.mark();
        MainRoom.totalPlayingTime = 0;
        MainRoom.carpet = false;
        MainRoom.deposit = false;
        MainRoom.snake = false;
        MainRoom.computer = false;
        addObject(main, 565, 400);

        addObject(pS, 565, 540);
    }

    public void act()
    {
        if (main.titleI == 5 && main.fading.millisElapsed() > 100){
            tran = false;           
            MainRoom_Animation mR = new MainRoom_Animation();
            Greenfoot.setWorld(mR);
            return;
        }
        blink();
        pressSpace();
        if(tran){
            removeObject(pS);
        }
    }

    public void pressSpace()
    {
        if (Greenfoot.isKeyDown("space") || tran){
            tran = true;
            main.update(); // 1

        }
    }
    public void blink(){
        if (space.millisElapsed() > 800 && !tran)
        {
            space.mark();
            if (currState == 1) {
                removeObject(pS);
                currState = 0;
            }else{
                addObject(pS, 565, 550);
                currState = 1;
            }
        }

    }
}
