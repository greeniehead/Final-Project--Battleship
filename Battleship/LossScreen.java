import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LossScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LossScreen extends World
{

    /**
     * Constructor for objects of class LossScreen.
     * 
     */
    public LossScreen()
    {    
        super(1152, 648, 1);
        GreenfootImage loss;
        loss = new GreenfootImage("LoseScreen.png");
        this.setBackground(loss);
    }
}
