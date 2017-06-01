import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(1071, 600, 1);
        setBackground("goodstartmenu.png");
        Start star = new Start();
        addObject(star, 220, 123);
        star.getImage().setTransparency(0);
        Quit quitButton = new Quit();
        addObject(quitButton, 900, 123);
        quitButton.getImage().setTransparency(0);
    }
}
