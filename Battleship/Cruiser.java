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
        
        while((this.getX()-80)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }
        
        while((this.getY()-585)%30 != 0)
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
