import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        super(500, 500, 1);
        GreenfootImage win;
        win = new GreenfootImage("WinScreen.png");
        this.setBackground(win);
        
        End en = new End();
        addObject(en, 250, 465);
    }
}
