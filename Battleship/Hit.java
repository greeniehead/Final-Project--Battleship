import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit extends Actor
{
    /**
     * Act - do whatever the Hit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage hittt = new GreenfootImage("redtile.fw.png");
        setImage(hittt);

        while((this.getX()-80)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }        
        while((this.getY()-505)%30 != 0)
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
        while(this.getY() > 295)
        {
            this.setLocation(this.getX(), this.getY()-1);
        }
        while(this.getY() < 10)
        {
            this.setLocation(this.getX(), this.getY()+1);
        }
    }    
}
