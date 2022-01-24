import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is to show how bubble sort works
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 16, 2022
 */
public class BubbleSort extends Sort
{
    /**
     * Act - do whatever the BubbleSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int N = 50; // The size of your array
    double [] nums = new double[N]; // The main array to visualize
    SimpleTimer timer = new SimpleTimer(); // A timer for keeping track of how long your algorithm takes

    public BubbleSort()
    {
        // Instantiate the main array

        nums = new double[N];

        // Setup the array 
        setup(nums);

        // shuffle the array
        shuffle(nums);

    }
    public void run()
    {
        // Set the timer to 0
        timer.mark();

        // Run the sort algorithm on an array
        bubbleSort(nums);  

        // How much time has elapsed?
        double time = (double)timer.millisElapsed()/1000;

        // Display that time on the canvas
        Computer_Cheating cC = (Computer_Cheating) getWorld();

        String result = Double.toString(time);
        cC.currTime.setValue(result);
        //System.out.println("hi");

    }
    /**
     * A simple sorting algorithm
     * @param arr An integer array
     */
    public void bubbleSort(double [] arr)
    {
        timer.mark(); 
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 1; j < arr.length; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                    drawArray(arr, j);
                }
            }
        }
    }

}
