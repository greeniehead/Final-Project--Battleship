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
        super(500, 500, 1);
        GreenfootImage loss;
        loss = new GreenfootImage("LossScreen.png");
        this.setBackground(loss);
    }
}
