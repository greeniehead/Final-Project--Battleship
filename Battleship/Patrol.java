import greenfoot.*;

public class Patrol extends Actor
{
    public void act()
    {
        GreenfootImage pat;
        pat = new GreenfootImage("patrol.png");
        setImage(pat);
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
