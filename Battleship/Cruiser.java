import greenfoot.*;

public class Cruiser extends Actor
{
    public void act() 
    {
        GreenfootImage cru;
        cru = new GreenfootImage("sub2.fw.png");
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
    
    
}
