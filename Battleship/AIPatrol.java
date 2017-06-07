import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIPatrol extends Actor
{
    
    public void act() 
    {
      GreenfootImage AIpat;
      AIpat = new GreenfootImage("patrol2.fw.png");
      setImage(AIpat);       
      if(this.getRotation() == 0){
          while((this.getX()-5)%30 != 0)
        {
            this.setLocation(this.getX() + 1, this.getY());
        }        
        while((this.getY()-505)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        }  
      }
      else{
        while((this.getX()+10)%30 != 0)  //50,80,110,140,170,200
        {
            this.setLocation(this.getX() + 1, this.getY());
        }      
        while((this.getY()-430)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        }  
        } 
      /*while((this.getY()-505)%30 != 0)
        {
            this.setLocation(this.getX(), this.getY() + 1);
        } */        
      if(this.getRotation() == 0)
            {
                while(this.getX() < 65)
                {
                    this.setLocation(this.getX()+1, this.getY());
                }
                while(this.getX() > 305)
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
                while(this.getY() > 310)
                {
                    this.setLocation(this.getX(), this.getY()-1);
                }
                while(this.getY() < 50)
                {
                    this.setLocation(this.getX(), this.getY()+1);
                }
            }  
      /* while(this.getIntersectingObjects(null).size() > 2 ){
          this.setLocation(this.getX()+(int)(Math.random()*10)-10, this.getY()-(int)(Math.random()*10)-10);
          
        } */           
    }    
    public static void notOnTop(AIPatrol pat){
        while(pat.getIntersectingObjects(null).size() > 4 ){
          pat.setLocation(pat.getX()+(int)(Math.random()*10)-10, pat.getY()-(int)(Math.random()*10)-10);
          
        }  
    }
    public static int[] placePatrol(){
       String[][] PatrolOnBoard = new String[10][10];
       for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    PatrolOnBoard[x][y] = "Empty";                    
                }               
        }         
       int x = (int)(Math.random()*10);
       int y = (int)(Math.random()*10);
       int UpDownOrLeftRight = (int)(Math.random()*11);
       int[] choices = new int[3];
       choices[0] = x;
       choices[1] = y;
       choices[2] = UpDownOrLeftRight;
       PatrolOnBoard[x][y] = "P1";
    
        if(x-5 <= 0 && choices[2] <= 5){
           PatrolOnBoard[x+1][y] = "P2";
           PatrolOnBoard[x+2][y] = "P3";
            //place P2 at x+1 on the gameboard array
        }
        else if (x-5 > 0 && choices[2] <= 5){
           PatrolOnBoard[x-1][y] = "P2";
           PatrolOnBoard[x-2][y] = "P3";
            //place P2 at x-1 on the gameboard array
        }
        else if(y-5 <= 0 && choices[2] > 5){
            //System.out.println("HI!!!");
           PatrolOnBoard[x][y+1] = "P2";
           PatrolOnBoard[x][y+2] = "P3";
            //place P2 at y+1 on the gameboard array
        }
        else if(y-5 > 0 && choices[2] > 5){
    
            PatrolOnBoard[x][y-1] = "P2";
            PatrolOnBoard[x][y-2] = "P3";
            //place P2 at y-1 on the gameboard array
        }
        /*for(int row =0;row<PatrolOnBoard.length; row++){
           for(int col = 0; col<PatrolOnBoard[0].length;col++){ 
               System.out.print(PatrolOnBoard[row][col] + " ");
            }
            System.out.println();
        } */
       int[] PatrolCoords = new int[6]  ;  
        for(int row =0;row<PatrolOnBoard.length; row++){
               for(int col = 0; col<PatrolOnBoard[0].length;col++){     
                   if(PatrolOnBoard[row][col].equals("P1")){ 
                       PatrolCoords[0] = row;
                       PatrolCoords[1] = col;
                    }
                   else if(PatrolOnBoard[row][col].equals("P2")){ 
                       PatrolCoords[2] = row;
                       PatrolCoords[3] = col;
                    }
                   else if(PatrolOnBoard[row][col].equals("P3")){ 
                       PatrolCoords[4] = row;
                       PatrolCoords[5] = col;
                    } 
                    
                }
            }
       PatrolCoords[3] = UpDownOrLeftRight;
       return PatrolCoords;
       
        }
}