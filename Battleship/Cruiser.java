import greenfoot.*;

public class Cruiser extends Actor
{
    public void act() 
    {
        GreenfootImage cru;
        cru = new GreenfootImage("sub.png");
        setImage(cru);
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
