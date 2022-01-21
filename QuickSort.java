import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort extends Sort
{
    /**
     * Act - do whatever the QuickSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int N = 50; // The size of your array
    double [] nums = new double[N]; // The main array to visualize
    SimpleTimer timer = new SimpleTimer(); // A timer for keeping track of how long your algorithm takes

    public QuickSort()
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
        quickSort(nums,0, N-1);  

        // How much time has elapsed?
        double time = (double)timer.millisElapsed()/1000;

        // Display that time on the canvas
        Computer_Cheating cC = (Computer_Cheating) getWorld();

        String result = Double.toString(time);
        cC.currTime.setValue(result);
        //System.out.println("hi");

    }     
    
    public void quickSort(double [] arr, int lo, int high)
    {
        if (lo < high){
            int pivot = partion(arr, lo, high);
            quickSort(arr, lo, pivot-1);
            quickSort(arr, pivot+1, high);
        }

    }

    public int partion(double [] arr, int lo, int high)
    {
        double pivot = arr[high];
        int i = lo-1;

        for (int j=lo; j<=high-1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
                if (i != j) drawArray(arr,i);
                //Greenfoot.delay(1);

            }

        }
        swap(arr,i+1,high);
        drawArray(arr,i);
        //Greenfoot.delay(1);
        return i+1;

    }
    
    
}
