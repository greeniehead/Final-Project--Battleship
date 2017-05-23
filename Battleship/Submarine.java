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
        
        while((this.getY()-615)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        }
        
        if(!(Greenfoot.mouseDragged(this)))
        {
            if(this.getRotation() == 0)
            {
                while(this.getX() < 65)
                {
                    this.setLocation(this.getX()+1, this.getY());
                }
                while(this.getX() > 290)
                {
                    this.setLocation(this.getX()-1, this.getY());
                }
                while(this.getY() > 644)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 360)
                {
                    this.setLocation(this.getX(), this.getY()+1);
                }
            }
            else
            {
                while(this.getX() < 35)
                {
                    this.setLocation(this.getX()+1, this.getY());
                }
                while(this.getX() > 320)
                {
                    this.setLocation(this.getX()-1, this.getY());
                }
                while(this.getY() > 615)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 400)
                {
                    this.setLocation(this.getX(), this.getY()+1);
                }
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
