import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSE extends Actor
{
    /**
     * Act - do whatever the LOSE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            LossScreen loss = new LossScreen();
            Greenfoot.setWorld(loss);
        }
    }    
}
