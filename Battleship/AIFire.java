import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class AIFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIFire extends Actor
{
    /**
     * Act - do whatever the AIFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(GameWorld.getFiring() == false && GameWorld.getAIFiring() == true){ 
      GameWorld.setAIFiring(true);
      int x = AIFireMethod()[0];
      int y = AIFireMethod()[1];
      getWorld().addObject(new AIMiss(),x,y);
      for(int i = 0; i < getWorld().getObjectsAt(x,y, null).size(); i++){
          System.out.println(getWorld().getObjectsAt(x,y, null).get(i));
          /*if(true){
              getWorld().addObject(new AIHit(),x,y);
          } */
          
      }
      GameWorld.setAIFiring(false);
    }
    }
    public static int[] AIFireMethod(){
        //GameWorld.addObject(miss4, 2 ,2);
          int[] XandY = new int[2];
            
          XandY[0] = ThreadLocalRandom.current().nextInt(35, 335);
          XandY[1] = ThreadLocalRandom.current().nextInt(360, 660);
          
        
        return XandY;
    }
    }    

