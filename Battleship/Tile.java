import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile extends Actor
{
    /**
     * Act - do whatever the Tile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(GameWorld.getFiring())
        {
            if(Greenfoot.mouseClicked(this))
            {
                
                this.removeSelf();
                GameWorld.setAIFiring(true);
            }
        }

        
    }
    
    public void removeSelf()
    {
        
        GameWorld.setFiring(false);
        getWorld().removeObject(this);
    }
    
}