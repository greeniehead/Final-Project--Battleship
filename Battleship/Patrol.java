import greenfoot.*;

public class Patrol extends Actor
{
    public void act()
    {
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
