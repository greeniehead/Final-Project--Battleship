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
        addObject(star, 60, 300);
        star.getImage().setTransparency(0);
        Quit quitButton = new Quit();
        addObject(quitButton, 60, 400);
        quitButton.getImage().setTransparency(0);
    }
}
