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
        
        if(!(Greenfoot.mouseDragged(this)))
        {
            if(this.getRotation() == 0)
            {
                while(this.getX() < 95)
                {
                    this.setLocation(this.getX()+1, this.getY());
                }
                while(this.getX() > 260)
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
                while(this.getY() > 585)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 430)
                {
                    this.setLocation(this.getX(), this.getY()+1);
                }
            }
        }
    }
    
    
}
