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
        
        if(this.getRotation() == 90)
        {
            while((this.getX()-80)%30 != 0)
            {
                this.setLocation(this.getX() +1, this.getY());
            }
            
            while((this.getY()-660)%30 != 0)
            {
                this.setLocation(this.getX(), this.getY() + 1);
            }
        }
        else
        {
            while((this.getX()-65)%30 != 0)
            {
                this.setLocation(this.getX() + 1, this.getY());
            }
            while((this.getY()-645)%30 != 0)
            {
                this.setLocation(this.getX(), this.getY() + 1);
            }
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
