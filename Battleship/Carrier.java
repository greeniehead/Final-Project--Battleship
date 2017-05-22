import greenfoot.*;

public class Carrier extends Actor
{
    public void act() 
    {
        GreenfootImage car;
        car = new GreenfootImage("carrier.png");
        setImage(car);
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
