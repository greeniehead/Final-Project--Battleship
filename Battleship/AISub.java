import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class AICarrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AISub extends Actor
{
    public void act() 
    {
        GreenfootImage AISub;
        AISub = new GreenfootImage("sub2.fw.png");
        setImage(AISub);
        
        AISub.setColor(Color.green);
        AISub.fill();
        
        while((this.getX()-80)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }        
        while((this.getY()-505)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        }        
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
                while(this.getY() > 294)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 10)
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
                while(this.getY() > 265)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 50)
                {
                    this.setLocation(this.getX(), this.getY()+1);
                }
            }  
            /*while(this.getIntersectingObjects(null).size() > 3 ){
          this.setLocation(this.getX()+(int)(Math.random()*10)-10, this.getY()-(int)(Math.random()*10)-10);
          
        } */  
    }    
    public static void notOnTop(AISub sub ){
        
        
        
        
        
        /*
        System.out.println("sub");
        
        System.out.println("cruiser: "+sub.isTouching(AICruiser.class));
        System.out.println("patrol: "+sub.isTouching(AIPatrol.class));
        System.out.println("carrier: "+sub.isTouching(AICarrier.class));
        System.out.println("battle: "+sub.isTouching(AIBattle.class));
        
        for(Object element : sub.getIntersectingObjects(null))
        {
            System.out.println(element.toString());
        }
        
        while(sub.getIntersectingObjects(null).size() > 6 ){
          sub.setLocation(sub.getX()+(int)(Math.random()*10)-10, sub.getY()-(int)(Math.random()*10)-10);
          
        }
        */
    }
    public static int[] placeSub(){
       String[][] SubOnBoard = new String[10][10];
       for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    SubOnBoard[x][y] = "Empty";                    
                }               
        }         
       int x = (int)(Math.random()*10);
       int y = (int)(Math.random()*10);
       int UpDownOrLeftRight = (int)(Math.random()*11);
       int[] choices = new int[3];
       choices[0] = x;
       choices[1] = y;
       choices[2] = UpDownOrLeftRight;
       SubOnBoard[x][y] = "C1";
    
        if(x-5 <= 0 && choices[2] <= 5){
           SubOnBoard[x+1][y] = "C2";
           SubOnBoard[x+2][y] = "C3";
            //place C2 at x+1 on the gameboard array
        }
        else if (x-5 > 0 && choices[2] <= 5){
           SubOnBoard[x-1][y] = "C2";
           SubOnBoard[x-2][y] = "C3";
            //place C2 at x-1 on the gameboard array
        }
        else if(y-5 <= 0 && choices[2] > 5){
            //System.out.println("HI!!!");
           SubOnBoard[x][y+1] = "C2";
           SubOnBoard[x][y+2] = "C3";
            //place C2 at y+1 on the gameboard array
        }
        else if(y-5 > 0 && choices[2] > 5){
    
            SubOnBoard[x][y-1] = "C2";
            SubOnBoard[x][y-2] = "C3";
            //place C2 at y-1 on the gameboard array
        }
        /*for(int row =0;row<SubOnBoard.length; row++){
           for(int col = 0; col<SubOnBoard[0].length;col++){ 
               System.out.print(SubOnBoard[row][col] + " ");
            }
            System.out.println();
        } */
       int[] SubCoords = new int[6]  ;  
        for(int row =0;row<SubOnBoard.length; row++){
               for(int col = 0; col<SubOnBoard[0].length;col++){     
                   if(SubOnBoard[row][col].equals("C1")){ 
                       SubCoords[0] = row;
                       SubCoords[1] = col;
                    }
                   else if(SubOnBoard[row][col].equals("C2")){ 
                       SubCoords[2] = row;
                       SubCoords[3] = col;
                    }
                   else if(SubOnBoard[row][col].equals("C3")){ 
                       SubCoords[4] = row;
                       SubCoords[5] = col;
                    } 
                    
                }
            }
       SubCoords[3] = UpDownOrLeftRight;
       return SubCoords;
       
        }
    
    public static void stayInGrid(AISub sub)
    {
        if(sub.getRotation() == 0)
            {
                while(sub.getX() < 65)
                {
                    sub.setLocation(sub.getX()+1, sub.getY());
                }
                while(sub.getX() > 290)
                {
                    sub.setLocation(sub.getX()-1, sub.getY());
                }
                while(sub.getY() > 294)
                {
                    sub.setLocation(sub.getX(), sub.getY()-1);
                }
                while(sub.getY() < 10)
                {
                    sub.setLocation(sub.getX(), sub.getY()+1);
                }
            }
            else
            {
                while(sub.getX() < 35)
                {
                    sub.setLocation(sub.getX()+1, sub.getY());
                }
                while(sub.getX() > 320)
                {
                    sub.setLocation(sub.getX()-1, sub.getY());
                }
                while(sub.getY() > 265)
                {
                    sub.setLocation(sub.getX(), sub.getY()-1);
                }
                while(sub.getY() < 50)
                {
                    sub.setLocation(sub.getX(), sub.getY()+1);
                }
            } 
    }
}