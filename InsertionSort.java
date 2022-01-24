import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is to show how insertion sort works
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 16, 2022
 */
public class InsertionSort extends Sort
{
    /**
     * Act - do whatever the InsertionSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int N = 50; // The size of your array
    double [] nums = new double[N]; // The main array to visualize
    SimpleTimer timer = new SimpleTimer(); // A timer for keeping track of how long your algorithm takes

    public InsertionSort()
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
        insertionSort(nums);  

        // How much time has elapsed?
        double time = (double)timer.millisElapsed()/1000;

        // Display that time on the canvas
        Computer_Cheating cC = (Computer_Cheating) getWorld();

        String result = Double.toString(time);
        cC.currTime.setValue(result);

    }   
    
    public void insertionSort(double [] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            double curNumber = arr[i];
            int curIndex = i-1;
            boolean isChange = false;
            while (curIndex > -1 && arr[curIndex] > curNumber)
            {
                arr[curIndex+1] = arr[curIndex];
                
                curIndex--;
                isChange = true;
            }
            if (isChange) drawArray(arr,curIndex);
            arr[curIndex+1] = curNumber;
            
        }

    }
}
