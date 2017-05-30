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
        super(598, 548, 1);
        GreenfootImage loss;
        loss = new GreenfootImage("NewLose.png");
        this.setBackground(loss);
        
        Restart re = new Restart();
        addObject(re, 475, 225);
    }
}
