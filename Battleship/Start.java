import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    
    public void act() 
    {
        GreenfootImage start;
        start = new GreenfootImage("startimage.png");
        setImage(start);
        //getImage().setTransparency(0);
     
        if(Greenfoot.mouseClicked(this))
        {
            GameWorld gWorld = new GameWorld();
            Greenfoot.setWorld(gWorld);
            
          
        }
    }    
}
