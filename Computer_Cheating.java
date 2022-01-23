import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world displays four sorting algorithms: Bubble Sort, Insertion Sort, Selection Sort, and Quick Sort, and shows the amount of 
 * time for each sorting algorithm takes. Also, binary search is also adding in this world to "mock" the user for considering 
 * searching as sorting. XD
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 17, 2022
 */
public class Computer_Cheating extends Computer
{
    Exit exit = new Exit();

    //Image of different sortings
    BubbleS bS = new BubbleS();
    InsertionS iS = new InsertionS();
    SelectionS sS = new SelectionS();
    QuickS qS = new QuickS();
    Binary binary = new Binary();
    BinaryMock mock = new BinaryMock();

    //Displaying different sorting methods
    BubbleSort b = new BubbleSort();
    InsertionSort i = new InsertionSort();
    SelectionSort s = new SelectionSort();
    QuickSort q = new QuickSort();
    BinarySearch bi = new BinarySearch();

    int currButtonState = 0; //Bubble: 1; Insertion: 2; Selection: 3; Quick: 4; Binary: 5;
    Label currTime = new Label(" ", 20); // Displaying the amount of time for each sorting algorithm takes

    /**
     * Constructor for objects of class Computer_Cheating.
     * 
     */
    public Computer_Cheating()
    {
        currTime.setFillColor(Color.BLACK); // Set the color of label "currTime" to black
        addObject(exit, 65, 35); //Add the exit button
    }

    public void act()
    {
        MainRoom.countDown();
        closeTab();
        hideAndSeek();
        clickSort();
        Computer_DMOMG.continueCountdown();
        Computer_Waiting.finish();
    }

    /**
     * Detect which sorting algorithms that user clicks
     */
    public void clickSort()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                //Bubble
                if (mx > 360 && mx < 450 && my > 442 && my < 472) bubbleSort();

                //Insertion
                if (mx > 469 && mx < 559 && my > 442 && my < 472) insertionSort();

                //Selection 
                if (mx > 578 && mx < 668 && my > 442 && my < 472) selectionSort();

                //Quick
                if (mx > 687 && mx < 777 && my > 442 && my < 472) quickSort();                     

                //Binary Search
                if (mx > 520 && mx < 610 && my > 469 && my < 509) binarySearch();
            }
        }
    }

    /**
     * Clear all the objects on the display canvas and reset the timer
     */
    public void clearCanvas()
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
    }

    /**
     * Display the way that how Bubble Sort works
     */
    public void bubbleSort()
    {
        clearCanvas(); // Clean all the objects
        addObject(bS, 625, 212); // Display the "Bubble Sort" sign for user

        b = new BubbleSort(); // Re-initializing the object
        addObject(b, 625, 212);
        b.run(); // Run the sorting algorithm

        addObject(currTime, 603, 410); // Display the amount of time that the bubble sort algorithm takes to sort the array
        currButtonState = 1; // Keep track the currButton state
    }

    /**
     * Display the way that how Insertion Sort works
     */
    public void insertionSort()
    {
        clearCanvas(); // Clean all the objects
        addObject(iS, 625, 212); // Display the "Insertion Sort" sign for user

        i = new InsertionSort(); // Re-initializing the object
        addObject(i, 625, 212);
        i.run(); // Run the sorting algorithm

        addObject(currTime, 603, 410); // Display the amount of time that the insertion sort algorithm takes to sort the array
        currButtonState = 2; // Keep track the currButton state
    }

    /**
     * Display the way that how Selection Sort works
     */
    public void selectionSort()
    {
        clearCanvas(); // Clean all the objects
        addObject(sS, 625, 212); // Display the "Selection Sort" sign for user

        s = new SelectionSort(); // Re-initializing the object
        addObject(s, 625, 212);
        s.run(); // Run the sorting algorithm

        addObject(currTime, 603, 410); // Display the amount of time that the selection sort algorithm takes to sort the array
        currButtonState = 3; // Keep track the currButton state
    }

    /**
     * Display the way that how Quick Sort works
     */
    public void quickSort()
    {
        clearCanvas(); // Clean all the objects
        addObject(qS, 625, 212); // Display the "Quick Sort" sign for user

        q = new QuickSort(); // Re-initializing the object
        addObject(q, 625, 212);
        q.run(); // Run the sorting algorithm

        addObject(currTime, 603, 410); // Display the amount of time that the quick sort algorithm takes to sort the array
        currButtonState = 4; // Keep track the currButton state
    }

    /**
     * Display an Easter Egg
     */
    public void binarySearch()
    {
        clearCanvas(); // Clean all the objects
        addObject(mock, 555, 295); // Display the "mock" for user
        addObject(binary, 625, 212); // Display the "Binary Search" sign for user
        currButtonState = 5;// Keep track the currButton state
    }

    /**
     * Switch back to the question website
     */
    public void hideAndSeek()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (mx > 267 && mx < 367 && my > 125 && my < 155) {
                    Computer_DMOMG c = new Computer_DMOMG();
                    Greenfoot.setWorld(c);
                }
            }
        }
    }

}
