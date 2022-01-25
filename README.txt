  _____    ____    ____   __  __   ______   _____   _____            _____   ______ 
 |  __ \  / __ \  / __ \ |  \/  | |  ____| / ____| / ____|    /\    |  __ \ |  ____|
 | |__) || |  | || |  | || \  / | | |__   | (___  | |        /  \   | |__) || |__   
 |  _  / | |  | || |  | || |\/| | |  __|   \___ \ | |       / /\ \  |  ___/ |  __|  
 | | \ \ | |__| || |__| || |  | | | |____  ____) || |____  / ____ \ | |     | |____ 
 |_|  \_\ \____/  \____/ |_|  |_| |______||_____/  \_____|/_/    \_\|_|     |______|
                                                                                    
                        
   ___  ___   ___  _____  _   _  ___   ___  _  _  _____   ___  ___  ___  _____  ___  ___   _  _ 
  / __|/ __| / __||_   _|| | | ||   \ | __|| \| ||_   _| | __||   \|_ _||_   _||_ _|/ _ \ | \| |
 | (__ \__ \ \__ \  | |  | |_| || |) || _| | .` |  | |   | _| | |) || |   | |   | || (_) || .` |
  \___||___/ |___/  |_|   \___/ |___/ |___||_|\_|  |_|   |___||___/|___|  |_|  |___|\___/ |_|\_|
                                                                                                


== PROJECT TITLE ==
Room Escape CS Student Edition


== AUTHORS ==
@Bill Wei  @Steven Zhu  @Eric Chen


== PURPOSE OF PROJECT == 
A classic room escape game, with a computer science themed twist. Find all the clues and escape the room!


== VERSION + DATE ==
Janurary 25, 2022


== HOW TO START THIS PROJECT ==
Open the greenfoot file, and click the run button at the bottom to start this game. Make sure Greenfoot is pointed at the TitlePage class under the World superclass. 


== USER INSTRUCTIONS ==
Click around the room, and see if you can find all the clues that will allow you to escape
The clues could be hiding anywhere around the room!
Once you have discovered the clue, you can revisit it by clicking the numbered boxes that will appear on the top left of your screen
If you are REALLY stuck, you can check out the intended way of solving it below, although trying it for yourself first is highly recommended.


== ALGORITHMS & NOTABLE DATA STRUCTURE USED [GAME SPOILERS] ==
THIS SECTION CONTAINS SPOILERS TO THE GAME so you may want to complete it first before reading down






Recursion - Procedrally generate the snake as it gets longer in the snake game, located in the Snake_Play class

Various sorting algorithms - The website displaying sorting algorithms with timer, located in their own classes. Includes Bubble, Insertion, Selection and Quicksort 

Stack - displaying user inputted password on the numpad lock, that allows the user to backspace to remove the previous input, located in the Door class

Queue - finding the shortest path of the maze in the "Maze Game" as a part of the BFS algorithm, located in Computer_Maze_Win class

Boolean 2D Array - In the "Maze Game" on the computer, keep track of the spots on the grid map that are blocked by the red dots that the user is not allowed to step on, located in Computer_Maze class













HOW TO SOLVE & EASTER EGGS

SPOILER ALERT! Scroll down to find out the intended solution of the game
Please try to solve it for yourself before scrolling down

↓↓↓↓↓↓↓↓↓↓↓↓












































↓ keep scrolling ↓





















































################################################################################################

By clicking the keypad on the door, you will find out that 4 digits are required to unlock the door

There are 4 clues in total
you can find any of them in any order.

1. 
There is a paper slip tucked into the carpet
It tells you: "The third digit and the fourth digit are the same number"


2.
There is a key label behind the clock
when you click it, it will drop down to the floor
By clicking the key and then clicking the yellow lock on the safe, you can discover another paper slip
It says: "The second and third will be increasing consecutive integers."


3. 
When you click on the power switch of the console, the TV will be lit, displaying the title screen of a snake game. You can play the console by clicking onto the TV. After you beat the displayed high score of 15 points, a message will be sent to your printer. When you exit the console you will see that the printer printed out a document that says "The difference between first and third digit is 2"


4. 
By clicking the power button of the PC, you can turn it on. When you click on the TV you will be at the desktop. Clicking the upside down chrome logo will bring you to a brower page with the "DMOMG" website. The problem asks you to identify the quickest way to sort an array of size 50, and in this case Insertion Sort and Selection Sort will be the quickest due to the small size of the array. If you look at the "comment section", it will hint you that the other tab of your brower page has a website containing all the sorting algorithms with a timer. By playing through all algorithms, you will find out that selection and insertion sort are the quickest. After you submit the correct solution, it will give you the clue of the first digit being the smallest prime number, 2.

Features / Eastereggs on the computer page

The "Maze Game" can count the minimum steps you take to escape the room and can show you the optimal solution, however it will not give you any clues. 

The "File Explorer" is clickable, but is empty.

The "Useless Stuff" contains Steven's Grade 11 Greenfoot final project and Our group's Grade 12 Greenfoot midterm project, although they do not run on this paticular PC :(

The "Greenfoot" does not work.



Final Answer:

If you take into consideration all the clues given, the only possible solution is 2344. 








































