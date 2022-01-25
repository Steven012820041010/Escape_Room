import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible when user enters the correct password, the door's opening animation
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 20, 2022
 */
public class Doors extends TransitionAnimation
{
    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] image = new GreenfootImage[4];
    SimpleTimer fading = new SimpleTimer();
    int titleI = 0;
    /**
     * Constructor for objects of class Door_Animation.
     * 
     */
    public Doors()
    {
        fading.mark();
        setTitlePage();
        setCurrPage();
    }
    public void setCurrPage()
    {
        setImage(image[titleI]);
    }

    public void setTitlePage()
    {
        for(int i=1; i<5; i++){
            image[i-1] = new GreenfootImage("D" + i + ".png");
        }

    }

    /**
     * Updating the next animation
     */
    public void update(){

        if (fading.millisElapsed() > 700){
            fading.mark();
            titleI++;
            setCurrPage();
 
        }
       
    } 
}
