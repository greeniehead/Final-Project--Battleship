import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIBattle extends Actor
{
    
    public void act() 
    {
      GreenfootImage AIbat;
      AIbat = new GreenfootImage("batt2.fw.png");
      setImage(AIbat);       
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
                while(this.getX() < 95)
                {
                    this.setLocation(this.getX()+1, this.getY());
                }
                while(this.getX() > 275)
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
      
    }    
    public static void notOnTop(AIBattle bat){
        while(bat.getIntersectingObjects(null).size() > 8 ){
          bat.setLocation(bat.getX()+(int)(Math.random()*10)-10, bat.getY()-(int)(Math.random()*10)-10);
          
        }  
    }
    public static int[] placeBattle(){
       String[][] BattleOnBoard = new String[10][10];
       for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    BattleOnBoard[x][y] = "Empty";                    
                }               
        }         
       int x = (int)(Math.random()*10);
       int y = (int)(Math.random()*10);
       int UpDownOrLeftRight = (int)(Math.random()*11);
       int[] choices = new int[3];
       choices[0] = x;
       choices[1] = y;
       choices[2] = UpDownOrLeftRight;
       BattleOnBoard[x][y] = "P1";
    
        if(x-5 <= 0 && choices[2] <= 5){
           BattleOnBoard[x+1][y] = "P2";
           BattleOnBoard[x+2][y] = "P3";
            //place P2 at x+1 on the gameboard array
        }
        else if (x-5 > 0 && choices[2] <= 5){
           BattleOnBoard[x-1][y] = "P2";
           BattleOnBoard[x-2][y] = "P3";
            //place P2 at x-1 on the gameboard array
        }
        else if(y-5 <= 0 && choices[2] > 5){
            //System.out.println("HI!!!");
           BattleOnBoard[x][y+1] = "P2";
           BattleOnBoard[x][y+2] = "P3";
            //place P2 at y+1 on the gameboard array
        }
        else if(y-5 > 0 && choices[2] > 5){
    
            BattleOnBoard[x][y-1] = "P2";
            BattleOnBoard[x][y-2] = "P3";
            //place P2 at y-1 on the gameboard array
        }
        /*for(int row =0;row<BattleOnBoard.length; row++){
           for(int col = 0; col<BattleOnBoard[0].length;col++){ 
               System.out.print(BattleOnBoard[row][col] + " ");
            }
            System.out.println();
        } */
       int[] BattleCoords = new int[6]  ;  
        for(int row =0;row<BattleOnBoard.length; row++){
               for(int col = 0; col<BattleOnBoard[0].length;col++){     
                   if(BattleOnBoard[row][col].equals("P1")){ 
                       BattleCoords[0] = row;
                       BattleCoords[1] = col;
                    }
                   else if(BattleOnBoard[row][col].equals("P2")){ 
                       BattleCoords[2] = row;
                       BattleCoords[3] = col;
                    }
                   else if(BattleOnBoard[row][col].equals("P3")){ 
                       BattleCoords[4] = row;
                       BattleCoords[5] = col;
                    } 
                    
                }
            }
       BattleCoords[3] = UpDownOrLeftRight;
       return BattleCoords;
       
        }
}