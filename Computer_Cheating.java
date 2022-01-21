import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Computer_Cheating here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Cheating extends Computer
{
    Exit exit = new Exit();
    Apple apple = new Apple();
    int currButtonState = 0; //Bubble: 1; Insertion: 2; Selection: 3; Quick: 4; Binary: 5;
    BubbleS bS = new BubbleS();
    InsertionS iS = new InsertionS();
    SelectionS sS = new SelectionS();
    QuickS qS = new QuickS();
    Binary binary = new Binary();
    BinaryMock mock = new BinaryMock();
    Label currTime = new Label(" ", 20);
    
    BubbleSort b = new BubbleSort();
    InsertionSort i = new InsertionSort();
    SelectionSort s = new SelectionSort();
    QuickSort q = new QuickSort();
    BinarySearch bi = new BinarySearch();
    

    /**
     * Constructor for objects of class Computer_Cheating.
     * 
     */
    public Computer_Cheating()
    {
        currTime.setFillColor(Color.BLACK);
        addObject(exit, 65, 35);
        //addObject(apple, 565, 484);

    }

    public void act()
    {
        closeTab();
        hideAndSeek();
        clickSort();
        Computer_DMOMG.continueCountdown();
        Computer_Waiting.finish();
        MainRoom.countDown();
    }

    public void clickSort()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                //Bubble
                if (mx > 360 && mx < 450 && my > 442 && my < 472) {//min and max should be the edges of the area;
                    bubbleSort();
                }

                //Insertion
                else if (mx > 469 && mx < 559 && my > 442 && my < 472) {//min and max should be the edges of the area;
                    insertionSort();
                }

                //Selection 
                else if (mx > 578 && mx < 668 && my > 442 && my < 472) {//min and max should be the edges of the area;
                    selectionSort();
                }

                //Quick
                else if (mx > 687 && mx < 777 && my > 442 && my < 472) {//min and max should be the edges of the area;
                    quickSort();
                }

                //Binary Search
                else if (mx > 520 && mx < 610 && my > 469 && my < 509) {//min and max should be the edges of the area;
                    binarySearch();
                }
            }

        }
    }

    public void bubbleSort()
    {
        currTime.setValue(" ");
        if (currButtonState == 1){
            removeObject(bS);
            removeObject(b);
        }
        if (currButtonState == 2){
            removeObject(iS);
            removeObject(i);
        }
        if (currButtonState == 3){
            removeObject(sS);
            removeObject(s);
        }
        if (currButtonState == 4){
            removeObject(qS);
            removeObject(q);
        }
        if (currButtonState == 5) {
            removeObject(binary);
            removeObject(mock);
        }
        
        addObject(bS, 625, 212);
        
        b = new BubbleSort();
        addObject(b, 625, 212);
        b.run();
        
        addObject(currTime, 603, 410);
        currButtonState = 1;

    }

    public void insertionSort()
    {
        currTime.setValue(" ");
        if (currButtonState == 1){
            removeObject(bS);
            removeObject(b);
        }
        if (currButtonState == 2){
            removeObject(iS);
            removeObject(i);
        }
        if (currButtonState == 3){
            removeObject(sS);
            removeObject(s);
        }
        if (currButtonState == 4){
            removeObject(qS);
            removeObject(q);
        }
        if (currButtonState == 5) {
            removeObject(binary);
            removeObject(mock);
        }

        addObject(iS, 625, 212);
        
        i = new InsertionSort();
        addObject(i, 625, 212);
        i.run();
        
        addObject(currTime, 603, 410);
        
        currButtonState = 2;

    }

    public void selectionSort()
    {
        currTime.setValue(" ");
        if (currButtonState == 1){
            removeObject(bS);
            removeObject(b);
        }
        if (currButtonState == 2){
            removeObject(iS);
            removeObject(i);
        }
        if (currButtonState == 3){
            removeObject(sS);
            removeObject(s);
        }
        if (currButtonState == 4){
            removeObject(qS);
            removeObject(q);
        }
        if (currButtonState == 5) {
            removeObject(binary);
            removeObject(mock);
        }

        addObject(sS, 625, 212);
        
        s = new SelectionSort();
        addObject(s, 625, 212);
        s.run();
        
        addObject(currTime, 603, 410);
        
        currButtonState = 3;

    }

    public void quickSort()
    {
        currTime.setValue(" ");
        if (currButtonState == 1){
            removeObject(bS);
            removeObject(b);
        }
        if (currButtonState == 2){
            removeObject(iS);
            removeObject(i);
        }
        if (currButtonState == 3){
            removeObject(sS);
            removeObject(s);
        }
        if (currButtonState == 4){
            removeObject(qS);
            removeObject(q);
        }
        if (currButtonState == 5) {
            removeObject(binary);
            removeObject(mock);
        }

        addObject(qS, 625, 212);
        
        q = new QuickSort();
        addObject(q, 625, 212);
        q.run();
        
        addObject(currTime, 603, 410);
        currButtonState = 4;

    }

    public void binarySearch()
    {
        currTime.setValue(" ");
        if (currButtonState == 1){
            removeObject(bS);
            removeObject(b);
        }
        if (currButtonState == 2){
            removeObject(iS);
            removeObject(i);
        }
        if (currButtonState == 3){
            removeObject(sS);
            removeObject(s);
        }
        if (currButtonState == 4){
            removeObject(qS);
            removeObject(q);
        }
        if (currButtonState == 5) {
            removeObject(binary);
            removeObject(mock);
        }
        addObject(mock, 555, 295);
        addObject(binary, 625, 212);
        currButtonState = 5;

        
        

    }
    
    
    public void hideAndSeek()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 267 && mx < 367 && my > 125 && my < 155) {//min and max should be the edges of the area;
                    Computer_DMOMG c = new Computer_DMOMG();
                    Greenfoot.setWorld(c);
                }
            }

        }
    }
    
    
}
