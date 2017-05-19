import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(600, 600, 1);
        setBackground("battleshipscreen600x600.png");
        Start star = new Start();
        addObject(star, 150, 300);
    }
}
