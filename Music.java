import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Helper
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootSound playSound = new GreenfootSound("Snake.mp3");
    GreenfootImage[] soundImage = new GreenfootImage[2]; //Stores "on" and "off" of sound figures
    static int currIndex = 1; //Record the index of the sound figure after changing the world in case the sound image is matched after return to the TitlePage world

    public Music()
    {
        initMusicFigure();
        setSoundImage();
        playSound.setVolume(20);
    }

    public void act() 
    {
        clickMusicButton();
        
    }    

    public void initMusicFigure()
    {
        soundImage[0] = new GreenfootImage("music on.png"); 
        soundImage[1] = new GreenfootImage("music off.png"); 
    }

    /**
     * Set the current sound image using variable currIndex
     */
    public void setSoundImage()
    {
        setImage(soundImage[currIndex]);
    }

    /**
     * Stop the music
     */
    public void halt()
    {
        playSound.stop();
    }

    /**
     * Turn on the music if it is not playing; otherwise, turn it on.
     */
    public void clickMusicButton()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this))
        {
            if (currIndex==0)
            {
                setImage(soundImage[1]);
                playSound.stop();
                currIndex++;
            }
            else if (currIndex==1)
            {
                setImage(soundImage[0]);
                playSound.playLoop();
                currIndex--;
            }

        }

    }
}
