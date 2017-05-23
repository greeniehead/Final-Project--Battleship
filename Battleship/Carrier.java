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
            String key = Greenfoot.getKey();
            if((key != null) && (key.equals("space")))
            {
                if(this.getRotation()==0)
                {
                    this.setRotation(90);
                }
                else
                {
                    this.setRotation(0);
                }
            }
        }
        
        while((this.getX()-110)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }
        
        while((this.getY()-525)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
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
