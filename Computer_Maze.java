import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Computer_Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Maze extends Computer
{
    Exit exit = new Exit();
    Maze_Player mP = new Maze_Player();
    int currPlayerX = 386; // Record the initial x-index of the player on screen
    int currPlayerY = 483; // Record the initial y-index of the player on screen
    int g_r = 0; // Record the initial x-index of the player in grid
    int g_c = 0; // Record the initial y-index of the player in grid

    SimpleTimer moveSpeed = new SimpleTimer(); // Control the speed of the player in case it won't go too fast
    int currSpeed = 350; 
    boolean [][] maze = new boolean [8][8]; //Store which blocks user can or can not go

    //(386, 437)
    //    ^ 
    //    |
    //    |
    //(386, 483) --> (435, 483)
    //Horizontal difference: 49; Vertical: 45;

    static int totalStep = 0;

    
    Guider g = new Guider();

    /**
     * Constructor for objects of class Computer_Maze.
     * 
     */
    public Computer_Maze()
    {
        setUpMaze();
        //totalStep = 0;
        addObject(mP, 386, 483);
        addObject(exit, 65, 35);
        
    }

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
        //touchGreenfoot();
        detectDirection();
    }

    public void detectDirection()
    {
        if (g_r == 7 && g_c == 7 && Greenfoot.isKeyDown("right")){
            removeObject(mP);
            addObject(mP, currPlayerX+49, currPlayerY);
            System.out.println(totalStep);
            Greenfoot.delay(50);
            Computer_Maze_Win cMW = new Computer_Maze_Win();
            
            Greenfoot.setWorld(cMW);
            
        }else{

            if (Greenfoot.isKeyDown("right") && g_c + 1 < 8 && maze[g_r][g_c+1]){
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerX += 49;
                    g_c += 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);

                }
            }
            if (Greenfoot.isKeyDown("down") && g_r - 1 >= 0 && maze[g_r-1][g_c]){
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerY += 45;
                    g_r -= 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);

                }
            }
            if (Greenfoot.isKeyDown("left") && g_c - 1 >= 0 && maze[g_r][g_c-1]){
                if (moveSpeed.millisElapsed() > currSpeed){
                    moveSpeed.mark();
                    removeObject(mP);
                    currPlayerX -= 49;
                    g_c -= 1;
                    totalStep++;
                    addObject(mP, currPlayerX, currPlayerY);

                }
            }

            if (Greenfoot.isKeyDown("up") && g_r + 1 < 8 && maze[g_r+1][g_c]){
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
