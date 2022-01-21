import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Computer_Maze_Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer_Maze_Win extends Computer
{

    /**
     * Constructor for objects of class Computer_Maze_Win.
     * 
     */
    Guider g = new Guider();
    Computer_Maze cm = new Computer_Maze();
    int minimumStep = 0;
    int [][] dist = new int [8][8]; // Record the distance from each grid

    boolean [][] maze = cm.maze;
    boolean [][] visited = new boolean [8][8];
    int [][] coordinates = new int [22][2];

    SimpleTimer speed = new SimpleTimer();
    int currIndex = 0; //Record curr coordinates that guider is on
    
    Label computer;
    Label user;

    //Exit exit = new Exit();
    public Computer_Maze_Win()
    {
        speed.mark();
        bfs();
        minimumStep = dist[7][7];
        computer = new Label (minimumStep, 40);
        user = new Label (Computer_Maze.totalStep, 40);
        
        computer.setFillColor(Color.GREEN);
        addObject(computer, 925, 385);

        user.setFillColor(Color.GREEN);
        addObject(user, 920, 265);
        
        setUpCorrectPath();
        addObject(g, 386, 483);

    }

    public void setUpCorrectPath()
    {
        coordinates[0][0] = 386; coordinates[0][1] = 483; 
        coordinates[1][0] = 435; coordinates[1][1] = 483;

        coordinates[2][0] = 435; coordinates[2][1] = 438; 
        coordinates[3][0] = 435; coordinates[3][1] = 393; 
        coordinates[4][0] = 435; coordinates[4][1] = 348; 

        coordinates[5][0] = 484; coordinates[5][1] = 348; 
        coordinates[6][0] = 533; coordinates[6][1] = 348; 

        coordinates[7][0] = 533; coordinates[7][1] = 303;
        coordinates[8][0] = 533; coordinates[8][1] = 258; 

        coordinates[9][0] = 582; coordinates[9][1] = 258; 
        coordinates[10][0] = 631; coordinates[10][1] = 258; 

        coordinates[11][0] = 631; coordinates[11][1] = 303; 
        coordinates[12][0] = 631; coordinates[12][1] = 348; 
        coordinates[13][0] = 631; coordinates[13][1] = 393; 

        coordinates[14][0] = 680; coordinates[14][1] = 393; 
        coordinates[15][0] = 729; coordinates[15][1] = 393;

        coordinates[16][0] = 729; coordinates[16][1] = 348; 
        coordinates[17][0] = 729; coordinates[17][1] = 303;
        coordinates[18][0] = 729; coordinates[18][1] = 258; 
        coordinates[19][0] = 729; coordinates[19][1] = 213;
        coordinates[20][0] = 729; coordinates[20][1] = 168;

        coordinates[21][0] = 778; coordinates[21][1] = 168;
    }

    public void act()
    {
        demonstration();
        closeWindow();

    }
    
    public void demonstration()
    {
        if(speed.millisElapsed()>500 && currIndex < 22){
            removeObject(g);
            speed.mark();
            addObject(g, coordinates[currIndex][0], coordinates[currIndex][1]);
            currIndex++;
        }
    }
    
    
    public void closeWindow()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx, my;
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                
                if ((mx > 972 && mx < 990 && my > 90 && my < 107)) {//min and max should be the edges of the area;
                    Computer_Maze.totalStep = 0;
                    Computer_Screen cS = new Computer_Screen();
                    Greenfoot.setWorld(cS);
                }
            }
        }

    }

    public void bfs()
    {
        Queue<int[]> q = new LinkedList<int[]>();
        int [] arr = {0, 0}; int currR, currC;
        q.add(arr);

        while(!q.isEmpty()){
            int [] curr = q.poll();
            currR = curr[0]; currC = curr[1];
            //Right
            if (currC + 1 < 8 && maze[currR][currC+1] && !visited[currR][currC+1]){
                visited[currR][currC+1] = true;
                dist[currR][currC+1] = dist[currR][currC] + 1;
                int [] newArr = {currR, currC+1};
                q.add(newArr);
            }

            //Left
            if (currC - 1 >= 0 && maze[currR][currC-1] && !visited[currR][currC-1]){
                visited[currR][currC-1] = true;
                dist[currR][currC-1] = dist[currR][currC] + 1;
                int [] newArr = {currR, currC-1};
                q.add(newArr);
            }

            //Up
            if (currR + 1 < 8 && maze[currR+1][currC] && !visited[currR+1][currC]){
                visited[currR+1][currC] = true;
                dist[currR+1][currC] = dist[currR][currC] + 1;
                int [] newArr = {currR+1, currC};
                q.add(newArr);
            }

            //Down
            if (currR - 1 >= 0 && maze[currR-1][currC] && !visited[currR-1][currC]){
                visited[currR-1][currC] = true;
                dist[currR-1][currC] = dist[currR][currC] + 1;
                int [] newArr = {currR-1, currC};
                q.add(newArr);
            }

        }

    }
}
