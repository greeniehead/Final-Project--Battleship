import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Quit extends Actor
{
    
    public void act() 
    {
        GreenfootImage quit;
        quit = new GreenfootImage("startimage.png");
        setImage(quit);
        //getImage().setTransparency(0);
     
        if(Greenfoot.mouseClicked(this))
        {
            System.exit(0);
            
          
        }
    }    
}
