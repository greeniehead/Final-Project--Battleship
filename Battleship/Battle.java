import greenfoot.*;

public class Battle extends Actor
{
    public void act() 
    {
        GreenfootImage batt;
        batt = new GreenfootImage("batt.png");
        setImage(batt);
        if (Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
    }
    
    public void horizontal()
    {
        this.setRotation(0);
    }
    
    public void vertical()
    {
        this.setRotation(90);
    }
}
