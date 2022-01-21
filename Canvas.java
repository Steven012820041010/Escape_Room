import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains methods to make simple drawings.
 * Extend this class to make your own canvas for drawing.
 * Override the 'run()' method in the subclass
 */
public class Canvas extends Actor
{    
    // The drawing delay
    private int delay = 0;
    
    // The two images that the canvas will switch between
    GreenfootImage image0 = new GreenfootImage(1,1);
    GreenfootImage image1 = new GreenfootImage(1,1);
    
    // The side-length of the world.
    private int scale;

    // The current image to draw on
    public GreenfootImage currentImage;
    
    // Set a default blank image when Canvas is instantiated
    public Canvas()
    {
        setImage(image0);
        
    }
    
    /**
     * Override and implement your drawing in this method.
     * 
     * The canvas has coordinates (0, 0) in the bottom left corner
     * and (1.0, 1.0) in the top right corner
     * 
     *      |-----|(1.0,1.0)
     *      |     |
     *      |     |
     * (0,0)|-----|
     * 
     */
    public void run()
    {
    }

    /**
     * To be called at the point in your code where you want your
     * drawing to be displayed on the Canvas.
     * 
     * The main goal of this method is to eliminate screen flicker.
     * All the drawing will be done on the offscreen image, then that
     * image is shown one time with 'setImage'.  All the screen clearing
     * will happen 'offscreen'.
     */
    public void update()
    {
        // Set the canvas image to the current image that has been drawn on
        setImage(currentImage);
  
        // Prepare the canvas so that any drawing will go on a different
        // Greenfoot image.
        if(currentImage == image0)
        {
            image1.clear();
            currentImage = image1;
        }
        else if (currentImage == image1)
        {
            image0.clear();
            currentImage = image0;
        }
    }

    /**
     * This method is called when the canvas is added to the world.
     * This will set the canvas to the size of the world.
     */
    public void addedToWorld(World world)
    {
        // set the scale to the width of the world
        // ensure width = height in the world
        scale = world.getWidth();

        // instantiate an image to draw on
        image0 = new GreenfootImage(scale, scale);
        image1 = new GreenfootImage(scale, scale);
        currentImage = image0;
    }

    /**
     * Draw a line between coordinates (x1, y1) and (x2, y2)
     * Remember to call the 'update()' method to show your drawing
     */
    public void line(double x1, double y1, double x2, double y2)
    {
        int nx1 = (int) (x1 * scale);
        int nx2 = (int) (x2 * scale);
        int ny1 = (int) ((1 - y1) * scale);
        int ny2 = (int) ((1 - y2) * scale);
        currentImage.drawLine(nx1, ny1, nx2, ny2);
        Greenfoot.delay(delay);
    }

    /**
     * Draw a circle with centre (x, y) and radius
     * Remember to call the 'update()' method to show your drawing
     */
    public void circle(double x, double y, double radius)
    {
        oval(x, y, radius, radius);
    }

    /**
     * Draw an oval with centre (x, y) and with xRadius and yRadius
     * Remember to call the 'update()' method to show your drawing
     */
    public void oval(double x, double y, double xRadius, double yRadius)
    {
        int nx = (int) ((x - xRadius) * scale);
        int ny = (int) ((1 - y) * scale - yRadius * scale);
        int width = (int) (xRadius * 2 * scale);
        int height = (int) (yRadius * 2 * scale);
        currentImage.drawOval(nx, ny, width, height);
        Greenfoot.delay(delay);
    }

    /**
     * Draw a rectangle centred on (x, y) with halfWidth and halfHeight
     * Remember to call the 'update()' method to show your drawing
     */
    public void rect(double x, double y, double halfWidth, double halfHeight)
    {
        int nx = (int) ((x - halfWidth) * scale);
        int ny = (int) ((1 - y) * scale - halfHeight * scale);
        int width = (int) (halfWidth * 2 * scale);
        int height = (int) (halfHeight * 2 * scale);
        currentImage.drawRect(nx, ny, width, height);
        Greenfoot.delay(delay);
    }


    /**
     * Draw a rectangle with bottom left coordinate (x, y) with width and height
     * Remember to call the 'update()' method to show your drawing
     */
    public void rect2(double x, double y, double width, double height)
    {
        int nx = (int) (x * scale);
        int ny = (int) ((1-y) * scale - height * scale);
        int w = (int) (width * scale / 2.8);
        int h = (int) (height * scale);
        currentImage.drawRect(nx, ny, w, h);
        Greenfoot.delay(delay);
    }

    /**
     * Set the drawing color
     * Remember to call the 'update()' method to show your drawing
     */
    public void setColor(Color color)
    {
        currentImage.setColor(color);
    }
    
    
    

}
