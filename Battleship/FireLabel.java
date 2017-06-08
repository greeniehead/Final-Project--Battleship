import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Message2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireLabel extends Message
{
    /**
     * Act - do whatever the Message2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    
    public FireLabel(String text)
    {
        updateImage(text);
    }
    
    public void setText(String text)
    {
        updateImage(text);
    }
    
    private void updateImage(String text)
    {
        setImage(new GreenfootImage(text, 30, Color.black, Color.white));
    }
}
