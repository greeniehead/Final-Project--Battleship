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
        UserBoard user = new UserBoard();
        CompBoard comp = new CompBoard();
        
        for(int x = 50; x < 351; x += 30)
        {
            for(int y = 25; y < 326; y += 30)
            {
                Tile til2 = new Tile();
                addObject(til2, x, y);
            }
        }
        
        for(int x = 50; x < 351; x += 30)
        {
            for(int y = 375; y < 651; y += 30)
            {
                Tile til3 = new Tile();
                addObject(til3, x, y);
            }
        }
        addObject(comp, 185, 290);
        addObject(user, 185, 610);
        
        
    }
}
