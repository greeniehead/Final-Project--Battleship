import greenfoot.*;

public class Submarine extends Actor
{
    public void act() 
    {
        GreenfootImage sub;
        sub = new GreenfootImage("sub.png");
        setImage(sub);
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
