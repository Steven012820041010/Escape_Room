import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort extends Sort
{
    /**
     * Act - do whatever the SelectionSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int N = 50; // The size of your array
    double [] nums = new double[N]; // The main array to visualize
    SimpleTimer timer = new SimpleTimer(); // A timer for keeping track of how long your algorithm takes

    public SelectionSort()
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
        selectionSort(nums);  

        // How much time has elapsed?
        double time = (double)timer.millisElapsed()/1000;

        // Display that time on the canvas
        Computer_Cheating cC = (Computer_Cheating) getWorld();

        String result = Double.toString(time);
        cC.currTime.setValue(result);
        //System.out.println("hi");

    }      
    
    public void selectionSort(double[] arr)
    {
        for(int curIndex = 0; curIndex < arr.length - 1; curIndex++)
        {
            
            int minIndex = findMin(arr, curIndex);
            
            // Swap the minimum into the correct position
            swap(arr, curIndex, minIndex);
        }
    }
    
    private int findMin(double[] arr, int startingIndex)
    {
        int minIndex = startingIndex;
        
        for(int i = minIndex + 1; i < arr.length; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
                
            }
        }
        drawArray(arr,minIndex);
        return minIndex;
    }
}
