import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is just provide basic helper methods for sorting algorithms
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 15, 2022
 */
public class Sort extends Canvas
{
    /**
     * Act - do whatever the Sort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   

    /**
     * Set up the array so that every element has a value that is an integer
     * from 1 to the length of the array (1 - N).
     * @param arr An array of integers
     */
    public void setup(double [] arr)
    {
        for (int i=1; i<=arr.length; i++)
        {
            arr[i-1] = (double)(i / 8.0);
        }

    }

    /**
     * TODO: Implement this method
     * Swap elements at index positions i and j in the given array.  
     * @param arr An integer array
     * @param a The index of one of the elements to swap
     * @param b The index of the other element to swap with
     */
    public void swap(double [] arr, int i, int j)
    {
        double tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    /**
     * Shuffle an array using the Fisher-Yates method.
     * The Fisher-Yates method iterates the array once, swapping each
     * element with a random element chosen in the range between
     * the current position to the length of the array.
     * @param arr An array of integers
     */
    public void shuffle(double [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            int currIndex = (int)(Math.random()*(arr.length-i) + i);
            swap(arr,i,currIndex);
        }
    }

    /**
     * Draw the given array
     * @param arr An array of integers
     */
    public void drawArray(double [] arr)
    {
        double bin = 1.0/arr.length;
        for(int i = 0; i < arr.length; i++)
        {
            double height = (double)arr[i]/arr.length;
            double x = i * bin;
            double y = 0;
            // Draw a rectangle on the canvas
            rect2(x, y, bin, height);
        }
        // Show the canvas
        update();
    }

    /**
     * Draw the given array, highlighting the element at position k
     * @param arr An integer array
     * @param k The position in the array to draw in a different color. k < arr.length
     */
    public void drawArray(double [] arr, int k)
    {
        // Exit this method if k is larger than the length of the array

        if(k > arr.length)
        {
            return;
        }

        double bin = 1.0/arr.length;;
        for(int i = 0; i < arr.length; i++)
        {
            double height = (double)arr[i]/arr.length;
            double x = i * bin / 2.52 + 0.247;
            double y = 0.348;

            rect2(x, y, bin, height);

        }
        Greenfoot.delay(1);
        // Show the canvas
        update();
    }
}
