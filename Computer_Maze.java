import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * This world displays the maze game. This maze game is mainly focusing on how to use 2D array and queue to find the shortest path of the maze.
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 20, 2022
 */
public class Computer_Maze extends Computer
{
    //(386, 437)
    //    ^ 
    //    |
    //    |
    //(386, 483) --> (435, 483)
    //Horizontal difference: 49; Vertical: 45;
    Guider g = new Guider();
    Maze_Player mP = new Maze_Player();
    int currPlayerX = 386; // Record the initial x-index of the player on screen
    int currPlayerY = 483; // Record the initial y-index of the player on screen
    int g_r = 0; // Record the initial x-index of the player in grid
    int g_c = 0; // Record the initial y-index of the player in grid

    SimpleTimer moveSpeed = new SimpleTimer(); // Control the speed of the player in case it won't go too fast
    int currSpeed = 300; // Player moving speed
    boolean [][] maze = new boolean [8][8]; //Store which blocks user can or can not go

    static int totalStep = 0; // Record the numbers of step that user moves 

    /**
     * Constructor for objects of class Computer_Maze.
     * 
     */
    public Computer_Maze()
    {
        setUpMaze(); 
        addObject(mP, 386, 483); // Add the player
    }

    /**
     * Set up the maze and set the wall coordinates to false
     */
    public void setUpMaze()
    {
        for (int r=0; r<8; r++){
            Arrays.fill(maze[r], true);
        }

        maze[0][2] = false; maze[0][7] = false;
        maze[1][4] = false; maze[1][5] = false; maze[1][6] = false;
        maze[2][0] = false; maze[2][2] = false; maze[2][3] = false; maze[2][4] = false; 
        maze[3][0] = false; maze[3][4] = false; maze[3][6] = false;
        maze[4][0] = false; maze[4][2] = false; maze[4][4] = false; maze[4][6] = false;
        maze[5][2] = false; maze[5][6] = false;
        maze[6][1] = false; maze[6][2] = false; maze[6][3] = false; maze[6][5] = false;
        maze[7][5] = false;
    }

    public void act()
    {
        closeTab();
        detectDirection();
    }

    /**
     * Switch to the maze game
     */
    public void closeTab()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if ((mx > 972 && mx < 990 && my > 90 && my < 107)) {
                    totalStep = 0; 
                    Computer_Screen c = new Computer_Screen();
                    Greenfoot.setWorld(c);
                }
            }
        }
    }

    /**
     * Detect the player's direction and upate the player's current position 
     */
    public void detectDirection()
    {
        if (g_r == 7 && g_c == 7 && Greenfoot.isKeyDown("right")){ // At the exit of the maze
            removeObject(mP);
            addObject(mP, currPlayerX+49, currPlayerY);

            Greenfoot.delay(50);

            Computer_Maze_Win cMW = new Computer_Maze_Win();
            Greenfoot.setWorld(cMW);
        }else{
            if (Greenfoot.isKeyDown("right") && g_c + 1 < 8 && maze[g_r][g_c+1]){ // Check if player can move right 1 unit
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerX += 49;
                    g_c += 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);
                }
            }
            
            if (Greenfoot.isKeyDown("down") && g_r - 1 >= 0 && maze[g_r-1][g_c]){ // Check if player can move down 1 unit
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerY += 45;
                    g_r -= 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);
                }
            }
            
            if (Greenfoot.isKeyDown("left") && g_c - 1 >= 0 && maze[g_r][g_c-1]){ // Check if player can move left 1 unit
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerX -= 49;
                    g_c -= 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);
                }
            }

            if (Greenfoot.isKeyDown("up") && g_r + 1 < 8 && maze[g_r+1][g_c]){ // Check if player can move up 1 unit
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerY -= 45;
                    g_r += 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);
                }
            }
        }
    }

}
