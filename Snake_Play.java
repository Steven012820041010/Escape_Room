import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * This world allows the user to play the hunger snake game. Use arrow key to control the snake and the goal is to get a clue by scoring 15 points
 * We used recursion to generate the snake bodies. 
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 11, 2022
 */
public class Snake_Play extends World
{

    /**
     * Constructor for objects of class Snake_Play.
     * 
     */

    //Telescreen left-top corner: (155,107)
    //Telescreen left-bottom corner: (155,491)
    //Telescreen right-top corner: (960,107)
    //Telescreen right-bottom corner: (960,491)

    SimpleTimer moveSpeed = new SimpleTimer(); // Control the speed of the snake in case it won't go too fast
    Snakebody sB = new Snakebody();
    int currSnakeX = 400; // Record the initial x-index of the snake
    int currSnakeY = 300; // Record the initial y-index of the snake
    int previousDire = 1; // Right: 1; Down: 2; Left: 3; Up: 4;
    int snakeSpeed = 230; // Moving speed of the snake

    boolean hasStart = false; // Check if the game has started yet
    int numberOfBodies = 1; // Record how many squares that the snake contains
    List<Snakebody> body = new ArrayList<Snakebody>(); // Store the snakebody objects
    List<int[]> currIndex = new ArrayList<int[]>();
    int currPosi = 0; // Record the current Index position

    Apple apple = new Apple();
    int currAppleX = Greenfoot.getRandomNumber(775) + 185; // Record the initial x-index of the apple
    int currAppleY = Greenfoot.getRandomNumber(354) + 137; // Record the initial y-index of the apple

    Label userScore = new Label(numberOfBodies-1, 50);
    Label highscore = new Label(15, 50);

    public Snake_Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
        moveSpeed.mark();
        body.add(sB);
        int [] original = {currSnakeX, currSnakeY};
        currIndex.add(original);
        userScore.setFillColor(Color.BLACK);
        highscore.setFillColor(Color.BLACK);

        addObject(sB, currSnakeX, currSnakeY);
        addObject(apple, currAppleX, currAppleY);
        addObject(userScore, 370, 540);
        addObject(highscore, 770, 540);

    }

    public void act()
    {
        MainRoom.countDown();
        currPosi = 0;
        detectDirection();
        eatApple();
        beatHighscore();
        move();
    }
    
    /**
     * Move the snake according to the method detectDirection()
     */
    public void move()
    {
        int currSpeed = (snakeSpeed - (numberOfBodies-1) * 10 > 40) ? snakeSpeed - (numberOfBodies-1) * 10 : 40; // set the current speed 
        if (previousDire == 1){
            if (moveSpeed.millisElapsed() > currSpeed) moveSnakeRight();
        }
        if (previousDire == 2){
            if (moveSpeed.millisElapsed() > currSpeed) moveSnakeDown();
        }
        if (previousDire == 3){
            if (moveSpeed.millisElapsed() > currSpeed) moveSnakeLeft();
        }
        if (previousDire == 4){
            if (moveSpeed.millisElapsed() > currSpeed) moveSnakeUp();
        }
    }

    public void beatHighscore()
    {
        if (numberOfBodies-1 == 15)
        {
            Snake_Win sW = new Snake_Win();
            Greenfoot.setWorld(sW);
        }
    }

    public void touchWallOrSelf()
    {
        if (currSnakeX < 150 || currSnakeX > 965 || currSnakeY < 104 || currSnakeY > 497)
        {
            Snake_Lose sE = new Snake_Lose();
            Greenfoot.setWorld(sE);
        }

        for (int [] arr : currIndex)
        {
            int x = arr[0], y = arr[1];
            if (Math.abs(x - currSnakeX) < 10 && Math.abs(y - currSnakeY) < 10){
                Snake_Lose sE = new Snake_Lose();
                Greenfoot.setWorld(sE);
            }
        }

    }

    public void eatApple()
    {
        if (Math.abs(currAppleX - currSnakeX) <= 10 && Math.abs(currAppleY - currSnakeY) <= 10)
        {
            numberOfBodies++;
            userScore.setValue(numberOfBodies-1);
            //Right
            if (previousDire == 1){
                int[] newBody = {currSnakeX - 18, currSnakeY};
                currIndex.add(newBody);
            }
            //Down
            if (previousDire == 2){
                int[] newBody = {currSnakeX, currSnakeY - 18};
                currIndex.add(newBody);
            }
            //Left
            if (previousDire == 3){
                int[] newBody = {currSnakeX + 18, currSnakeY};
                currIndex.add(newBody);
            }
            //Up
            if (previousDire == 4){
                int[] newBody = {currSnakeX, currSnakeY + 18};
                currIndex.add(newBody);
            }
            respawnApple();  
        }
    }

    public void respawnApple()
    {
        removeObject(apple);
        currAppleX = Greenfoot.getRandomNumber(775) + 185;
        currAppleY = Greenfoot.getRandomNumber(354) + 137;
        addObject(apple, currAppleX, currAppleY);
    }

    public void drawSnake(int N, int X, int Y)
    {
        if (N == 0) return;
        else
        {
            Snakebody s = new Snakebody();
            body.add(s);
            addObject(s, X, Y);
            int [] curr = {X, Y};
            int [] next = currIndex.get(currPosi);
            int nextX = next[0], nextY = next[1];
            currIndex.set(currPosi, curr);
            currPosi++;
            drawSnake(N-1, nextX, nextY);

        }
    }

    public void clearAllBody()
    {
        while(!body.isEmpty())
        {
            removeObject(body.remove(0));
        }
    }

    public void detectDirection()
    {
        if (Greenfoot.isKeyDown("right")){
            if (previousDire != 3) previousDire = 1; 
        }
        if (Greenfoot.isKeyDown("down")){
            if (previousDire != 4) previousDire = 2; 
        }
        if (Greenfoot.isKeyDown("left")){
            if (previousDire != 1) previousDire = 3; 
        }
        if (Greenfoot.isKeyDown("up")){
            if (previousDire != 2) previousDire = 4; 
        }

    }

    public void moveSnakeRight()
    {
        moveSpeed.mark();
        previousDire = 1;
        clearAllBody();
        currSnakeX += 18;
        touchWallOrSelf();
        drawSnake(numberOfBodies, currSnakeX, currSnakeY);

    }

    public void moveSnakeDown()
    {
        moveSpeed.mark();
        previousDire = 2;
        clearAllBody();
        currSnakeY += 18;
        touchWallOrSelf();
        drawSnake(numberOfBodies, currSnakeX, currSnakeY);

    }

    public void moveSnakeLeft()
    {
        moveSpeed.mark();
        previousDire = 3;
        clearAllBody();
        currSnakeX -= 18;
        touchWallOrSelf();
        drawSnake(numberOfBodies, currSnakeX, currSnakeY);

    }

    public void moveSnakeUp()
    {
        moveSpeed.mark();
        previousDire = 4;
        clearAllBody();
        currSnakeY -= 18;
        touchWallOrSelf();
        drawSnake(numberOfBodies, currSnakeX, currSnakeY);

    }

}
