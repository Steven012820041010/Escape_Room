import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible of the transition in the title page
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 20, 2022
 */
public class MainRooms extends TransitionAnimation
{
    /**
     * Act - do whatever the MainRooms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] image = new GreenfootImage[4];
    SimpleTimer fading = new SimpleTimer();
    int titleI = 0;
    /**
     * Constructor for objects of class Door_Animation.
     * 
     */
    public MainRooms()
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
            image[i-1] = new GreenfootImage("M" + i + ".png");
        }
    }
    public void update(){
        if (fading.millisElapsed() > 100){
            fading.mark();
            titleI++;
            setCurrPage();
        }
    }    
}
