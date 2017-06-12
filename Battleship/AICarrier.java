import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AICarrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AICarrier extends Actor
{
    private String[] c1 = new String[2];
    private String[] c2 = new String[2];
    private String[] c3 = new String[2];
    private String[] c4 = new String[2];
    private String[] c5 = new String[2];
    private String[][] coords = {c1, c2, c3, c4, c5};
    
    public void act() 
    {
        GreenfootImage AICarr;
        AICarr = new GreenfootImage("carrier2.fw.png");
        setImage(AICarr);       
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
            while(this.getX() < 95)
            {
                this.setLocation(this.getX()+1, this.getY());
            }
            while(this.getX() > 260)
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
            while(this.getY() > 235)
            {
                this.setLocation(this.getX(), this.getY()-1);
            }
            while(this.getY() < 70)
            {
                this.setLocation(this.getX(), this.getY()+1);
            }
        }
        /*
        this.stayInGrid(this);
        this.setCoords(this);
        /* for(String[] arrElement : coords)
        {
            for(String element : arrElement)
            {
                System.out.print(element);
            }
            System.out.println();
        }

        */
        

         

        /* while(this.getIntersectingObjects(null).size() > 5 ){
          this.setLocation(this.getX()+(int)(Math.random()*10)-10, this.getY()-(int)(Math.random()*10)-10);
          
        } */           
    }    
    public static void notOnTop(AICarrier carr){
        
        
        /*
        System.out.println("carrier");
        
        System.out.println("cruiser: "+carr.isTouching(AICruiser.class));
        System.out.println("sub: "+carr.isTouching(AISub.class));
        System.out.println("battle: "+carr.isTouching(AIBattle.class));
        System.out.println("patrol: "+carr.isTouching(AIPatrol.class));
        
        for(Object element : carr.getIntersectingObjects(null))
        {
            System.out.println(element.toString());
        }
        while(carr.getIntersectingObjects(null).size() > 10 ){
          carr.setLocation(carr.getX()+(int)(Math.random()*10)-10, carr.getY()-(int)(Math.random()*10)-10);
          
        }
        */
    }
    public static int[] placeCarrier(){
       String[][] CarrierOnBoard = new String[10][10];
       for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    CarrierOnBoard[x][y] = "Empty";                    
                }               
        }         
       int x = (int)(Math.random()*10);
       int y = (int)(Math.random()*10);
       int UpDownOrLeftRight = (int)(Math.random()*11);
       int[] choices = new int[3];
       choices[0] = x;
       choices[1] = y;
       choices[2] = UpDownOrLeftRight;
       CarrierOnBoard[x][y] = "C1";
    
        if(x-5 <= 0 && choices[2] <= 5){
           CarrierOnBoard[x+1][y] = "C2";
           CarrierOnBoard[x+2][y] = "C3";
            //place C2 at x+1 on the gameboard array
        }
        else if (x-5 > 0 && choices[2] <= 5){
           CarrierOnBoard[x-1][y] = "C2";
           CarrierOnBoard[x-2][y] = "C3";
            //place C2 at x-1 on the gameboard array
        }
        else if(y-5 <= 0 && choices[2] > 5){
            //System.out.println("HI!!!");
           CarrierOnBoard[x][y+1] = "C2";
           CarrierOnBoard[x][y+2] = "C3";
            //place C2 at y+1 on the gameboard array
        }
        else if(y-5 > 0 && choices[2] > 5){
    
            CarrierOnBoard[x][y-1] = "C2";
            CarrierOnBoard[x][y-2] = "C3";
            //place C2 at y-1 on the gameboard array
        }
        /*for(int row =0;row<CarrierOnBoard.length; row++){
           for(int col = 0; col<CarrierOnBoard[0].length;col++){ 
               System.out.print(CarrierOnBoard[row][col] + " ");
            }
            System.out.println();
        } */
       int[] CarrierCoords = new int[6]  ;  
        for(int row =0;row<CarrierOnBoard.length; row++){
               for(int col = 0; col<CarrierOnBoard[0].length;col++){     
                   if(CarrierOnBoard[row][col].equals("C1")){ 
                       CarrierCoords[0] = row;
                       CarrierCoords[1] = col;
                    }
                   else if(CarrierOnBoard[row][col].equals("C2")){ 
                       CarrierCoords[2] = row;
                       CarrierCoords[3] = col;
                    }
                   else if(CarrierOnBoard[row][col].equals("C3")){ 
                       CarrierCoords[4] = row;
                       CarrierCoords[5] = col;
                    } 
                    
                }
            }
       CarrierCoords[3] = UpDownOrLeftRight;
       return CarrierCoords;
       
        }
    public static void stayInGrid(AICarrier carr)
    {
        if(carr.getRotation() == 0)
            {
                while(carr.getX() < 95)
                {
                    carr.setLocation(carr.getX()+1, carr.getY());
                }
                while(carr.getX() > 260)
                {
                    carr.setLocation(carr.getX()-1, carr.getY());
                }
                while(carr.getY() > 294)
                {
                    carr.setLocation(carr.getX(), carr.getY()-1);
                }
                while(carr.getY() < 10)
                {
                    carr.setLocation(carr.getX(), carr.getY()+1);
                }
            }
            else
            {
                while(carr.getX() < 35)
                {
                    carr.setLocation(carr.getX()+1, carr.getY());
                }
                while(carr.getX() > 320)
                {
                    carr.setLocation(carr.getX()-1, carr.getY());
                }
                while(carr.getY() > 235)
                {
                    carr.setLocation(carr.getX(), carr.getY()-1);
                }
                while(carr.getY() < 70)
                {
                    carr.setLocation(carr.getX(), carr.getY()+1);
                }
            } 
    }
    
    public void setCoords(AICarrier carr)
    {
        c1[0] = "1x" +(carr.getX());
        c1[1] = " 1y" +(carr.getY());
        if(carr.getRotation() == 0)
        {
            c2[0] = "2x" +(carr.getX()+30);
            c2[1] = " 2y" +carr.getY();
            c3[0] = "3x" +(carr.getX()+60);
            c3[1] = " 3y" +carr.getY();
            c4[0] = "4x" +(carr.getX()-60);
            c4[1] = " 4y" +carr.getY();
            c5[0] = "5x" +(carr.getX()-30);
            c5[1] = " 5y" +carr.getY();
        }
        else
        {
            c2[0] = "2x" +carr.getX();
            c2[1] = " 2y" +(carr.getY()+30);
            c3[0] = "3x" +carr.getX();
            c3[1] = " 3y" +(carr.getY()+60);
            c4[0] = "4x" +carr.getX();
            c4[1] = " 4y" +(carr.getY()-60);
            c5[0] = "5x" +carr.getX();
            c5[1] = " 5y" +(carr.getY()-30);
        }
        coords[0] = c1;
        coords[1] = c2;
        coords[2] = c3;
        coords[3] = c4;
        coords[4] = c5;
    }
    
}