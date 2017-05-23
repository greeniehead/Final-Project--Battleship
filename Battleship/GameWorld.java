import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        super(600, 700, 1);
        End en = new End();
        addObject(en, 550, 550);
        Restart re = new Restart();
        addObject(re, 550, 475);
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 326; y += 30)
            {
                Tile til2 = new Tile();
                addObject(til2, x, y);
            }
        }
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 375; y < 651; y += 30)
            {
                Tile til3 = new Tile();
                addObject(til3, x, y);
            }
        }//THIS WILL GO IN AFTER THE POINT WHERE THE COMPUTER PLACES ITS SHIPS WHICH WILL BE
         //IMMEDIATE IN THE FINAL CODE.  DO NOT FORGET TO FIX!!!!!
        
        Patrol pt = new Patrol();
        addObject(pt, 65, 645);
        
        Submarine sub = new Submarine();
        addObject(sub, 80, 615);
        
        Cruiser crui = new Cruiser();
        addObject(crui, 80, 585);
        
        Battle batt = new Battle();
        addObject(batt, 95, 555);
        
        Carrier carr = new Carrier();
        addObject(carr, 110, 525);
        
        
        String[][] AIBoardArray = new String[10][10];
        int counter = 0;
        for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    AIBoardArray[x][y] = "Empty";
                }
                    }
            
        
        
    }
}
