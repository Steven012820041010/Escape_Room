import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainRoom extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //TV left-top: (196, 240);
    //TV left-bottom: (196, 420);
    //TV right-top: (535, 240);
    //TV right-bottom: (535, 420);

    //Lock left-top: (910, 519);
    //Lock left-bottom: (910, 550);
    //Lock right-top: (928, 519);
    //Lock right-bottom: (928, 550);

    //Clock left-top: (940, 60);
    //Clock left-bottom: (940, 155);
    //Clock right-top: (1040, 60);
    //Clock right-bottom: (1040, 155);

    Apple apple = new Apple();
    PrinterClue pC = new PrinterClue();

    Deposit_Box dB = new Deposit_Box();
    Deposit_Door dD = new Deposit_Door();
    Deposit_Lock dL = new Deposit_Lock();
    Key_Hint kH = new Key_Hint();
    Key key = new Key();

    TV_Snake_Screen snakeScreen = new TV_Snake_Screen();
    Window_Screen windowScreen = new Window_Screen();
    boolean touchSnakeButton = false;
    boolean touchComputerButton = false;

    boolean hasKey = false;
    
    First first = new First();
    Second second = new Second();
    Third third = new Third();
    Fourth fourth = new Fourth();

    static boolean carpet = false;
    static boolean deposit = false;
    static boolean snake = false;
    static boolean computer = false;
    
    static SimpleTimer wholeTimer = new SimpleTimer();
    static int totalPlayingTime = 0;
    
    public MainRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        Music.playSound.stop(); 
        addObject(kH, 986, 174);
        addObject(dL, 53, 431);
        
        
        
        
        //addObject(apple, 54, 434);

    }

    public void act()
    {
        touchButton();
        touchComputerButton();
        touchTV();
        touchLock();
        touchKeyHint();
        touchKey();
        touchClueFromCarpet();
        printClue(); 
        countDown();
        updateClue();
        touchClueAtLeftCorner();
    }
    
    public void updateClue()
    {
        if (carpet) addObject(first, 35, 40);
        if (deposit) addObject(second, 95, 40);
        if (snake) addObject(third, 155, 40);
        if (computer) addObject(fourth, 215, 40);
    }
    
    public void touchClueAtLeftCorner()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                System.out.println(mx);
                System.out.println(my);
                if (carpet && mx > 15 && mx < 51 && my > 11 && my < 67) {//min and max should be the edges of the area;
                    ClueFromCarpet cFC = new ClueFromCarpet();
                    Greenfoot.setWorld(cFC);
                }
                
                if (deposit && mx > 75 && mx < 111 && my > 11 && my < 67) {//min and max should be the edges of the area;
                    ClueFromDeposit cFD = new ClueFromDeposit();
                    Greenfoot.setWorld(cFD);
                }
                
                if (snake && mx > 135 && mx < 171 && my > 11 && my < 67) {//min and max should be the edges of the area;
                    ClueFromPrinter cFP = new ClueFromPrinter();
                    Greenfoot.setWorld(cFP);
                }
                
                if (computer && mx > 195 && mx < 261 && my > 11 && my < 67) {//min and max should be the edges of the area;
                    ClueFromComputerSecond cFc = new ClueFromComputerSecond();
                    Greenfoot.setWorld(cFc);
                }
                
                
            }
        }
    }
    
    
    
    
    
    
    public static void countDown(){
        if (wholeTimer.millisElapsed() > 1000)
        {
            wholeTimer.mark();
            totalPlayingTime++;
           
        }

    }
    
    

    public void touchClueFromCarpet()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 838 && mx < 848 && my > 710 && my < 720) {//min and max should be the edges of the area;
                    carpet = true;
                    ClueFromCarpet cFC = new ClueFromCarpet();
                    Greenfoot.setWorld(cFC);
                }
            }
        }
    }

    public void touchKeyHint()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 980 && mx < 992 && my > 168 && my < 180) {//min and max should be the edges of the area;
                    removeObject(kH);
                    addObject(key, 1040, 715);
                }
            }
        }
    }

    public void touchKey()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();

            if (hasKey){
                if (Greenfoot.mouseClicked(dL)){
                   
                    addObject(dB, 81, 416);
                    addObject(dD, 184, 417);
                    hasKey = false;
                }
                else if (Greenfoot.mouseClicked(null)) {
                    hasKey = false;
                    addObject(key, 1040, 715);
                }
            }

            if (Greenfoot.mouseClicked(key)) {
                removeObject(key);
                hasKey = true;
            }
            
        }
    }

    public void touchLock()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 910 && mx < 928 && my > 519 && my < 550) {//min and max should be the edges of the area;
                    Door d = new Door();
                    Greenfoot.setWorld(d);
                }
            }
        }

    }

    public void touchButton()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 654 && mx < 666  && my > 561  && my < 573) {//min and max should be the edges of the area;
                    touchSnakeButton = true;
                    touchComputerButton = false;
                    addObject(snakeScreen, 367, 331);
                    removeObject(windowScreen);
                }
            }
        }

    }

    public void touchComputerButton()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 40 && mx < 80 && my > 634 && my < 664) {//min and max should be the edges of the area;
                    touchComputerButton = true;
                    touchSnakeButton = false;
                    addObject(windowScreen, 367, 331);
                    removeObject(snakeScreen);
                }
            }
        }

    }

    public void touchTV()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 196 && mx < 535 && my > 240 && my < 420) {//min and max should be the edges of the area;
                    if(touchSnakeButton){
                        Snake_Title sT = new Snake_Title();
                        Greenfoot.setWorld(sT);
                    }
                    else if(touchComputerButton){
                        Computer_Screen cS = new Computer_Screen();
                        Greenfoot.setWorld(cS);
                    }
                }
            }
        }
    }

    public void printClue()
    {
        if (Snake_Win.win)
        {
            addObject(pC, 705, 460);
            snake = true;
            Snake_Win.win = false;
        }

    }

}
