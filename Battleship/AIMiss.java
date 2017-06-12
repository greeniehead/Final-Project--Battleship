import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AIMiss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIMiss extends Actor
{
    /**
     * Act - do whatever the AIMiss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage misssss = new GreenfootImage("whitetile.png");
        setImage(misssss);
        
        while((this.getX()-80)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }        
        while((this.getY()-645)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        }
        
        while(this.getX() < 35)
        {
            this.setLocation(this.getX()+1, this.getY());
        }
        while(this.getX() > 320)
        {
            this.setLocation(this.getX()-1, this.getY());
        }
        while(this.getY() > 645)
        {
            this.setLocation(this.getX(), this.getY()-1);
        }
        while(this.getY() < 375)
        {
            this.setLocation(this.getX(), this.getY()+1);
        }
    }    
}
