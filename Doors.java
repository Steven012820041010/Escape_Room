import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doors extends Actor
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

    public void update(){

        if (fading.millisElapsed() > 700){
            fading.mark();
            titleI++;
            setCurrPage();
            //System.out.println(i);
        }
        //fading.mark();

    } 
}
