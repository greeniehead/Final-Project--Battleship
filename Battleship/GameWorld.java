import greenfoot.*;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.util.*;
=======
import java.util.List;
>>>>>>> origin/master
>>>>>>> origin/master

public class GameWorld extends World
{
    public static boolean firing = false;
    public boolean game = true;
    
    public Patrol pt = new Patrol();
    public Submarine sub = new Submarine();
    public Cruiser crui = new Cruiser();
    public Battle batt = new Battle();
    public Carrier carr = new Carrier();
    public GameWorld()
    {    
        super(600, 700, 1);
        End en = new End();
        addObject(en, 550, 550);
        Restart re = new Restart();
        addObject(re, 550, 475);
        WIN wi = new WIN();
        addObject(wi, 550, 400);
        LOSE los = new LOSE();
        addObject(los, 550, 325);
        
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 325; y += 30)
            {
                Miss mis2 = new Miss();
                addObject(mis2, x, y);
            }
        }
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 375; y < 651; y += 30)
            {
                Miss mis3 = new Miss();
                addObject(mis3, x, y);
            }
        }
        
        
        /*
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 325; y += 30)
            {
                Tile til2 = new Tile();
                addObject(til2, x, y);
            }
        }
        */
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 375; y < 651; y += 30)
            {
                Tile til3 = new Tile();
                addObject(til3, x, y);
            }
        }
        
        
        //Patrol pt = new Patrol();
        addObject(pt, 65, 645);
        
        //Submarine sub = new Submarine();
        addObject(sub, 80, 615);
        
        //Cruiser crui = new Cruiser();
        addObject(crui, 80, 585);
        
        //Battle batt = new Battle();
        addObject(batt, 95, 555);
        
        //Carrier carr = new Carrier();
        addObject(carr, 110, 525);
        
        Message place = new Message("Please place your ships");
        addObject(place, 475, 200);
        
        
        
        String[][] AIBoardArray = new String[10][10];
        for(int x = 0; x < 10; x++){                
                for(int y = 0; y < 10; y++){
                    AIBoardArray[x][y] = "Empty";
                }
                    }
                   
        AICruiser AIcrui = new AICruiser();   
        addObject(AIcrui, AICruiser.placeCruiser()[0]*60, AICruiser.placeCruiser()[1]*30);
        if(AICruiser.placeCruiser()[3] > 5) AIcrui.setRotation(90);
        
        AISub AIsub = new AISub();   
        addObject(AIsub, AISub.placeSub()[0]*60, AISub.placeSub()[1]*30);
        if(AISub.placeSub()[3] > 5) AIsub.setRotation(90);
       
        
        AIPatrol AIpat = new AIPatrol();
        addObject(AIpat, AIPatrol.placePatrol()[0]*60, AIPatrol.placePatrol()[1]*30);
        if(AIPatrol.placePatrol()[3] > 5) AIpat.setRotation(90);
<<<<<<< HEAD
        
=======
<<<<<<< HEAD
        
        
=======
             
>>>>>>> origin/master
>>>>>>> origin/master
        AIBattle AIbat = new AIBattle();
        addObject(AIbat, AIBattle.placeBattle()[0]*60, AIBattle.placeBattle()[1]*30);
        if(AIBattle.placeBattle()[3] > 5) AIbat.setRotation(90);
<<<<<<< HEAD
        
=======
<<<<<<< HEAD
        /*
        System.out.println(getObjectsAt(80, 25, null).size());
        System.out.println(getObjectsAt(95, 25, null).size());
        AIBattle AIbat = new AIBattle();
        addObject(AIbat, 95, 25);
        //if(AIBattle.placeBattle()[3] > 5) AIbat.setRotation(90);
        System.out.println(getObjectsAt(80, 25, null).size());
        System.out.println(getObjectsAt(80, 25, null).get(0).toString());
        System.out.println(getObjectsAt(95, 25, null).size());
        System.out.println(getObjectsAt(95, 25, null).get(0).toString());
        */
=======
                
>>>>>>> origin/master
>>>>>>> origin/master
        AICarrier AIcarr = new AICarrier();
        addObject(AIcarr, AICarrier.placeCarrier()[0]*60, AICarrier.placeCarrier()[1]*30);
        if(AICarrier.placeCarrier()[3] > 5) AIcarr.setRotation(90);
        
        int count = 0;
        int arrLength;
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 325; y += 30)
            {
                
                arrLength = getObjectsAt(x, y, null).size();
                Hit hitt = new Hit();
                //System.out.println(arrLength);
                /*
                for(int i = 0; i < arrLength; i++)
                {
                    System.out.println(getObjectsAt(x, y, null).get(i).toString());
                }
                */
                if((arrLength != 1)&&(arrLength != 0))
                {
                    addObject(hitt, x, y);
                    count++;
                }
                
            }
        }
        System.out.println(count);
        
        
        
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 325; y += 30)
            {
                Tile til2 = new Tile();
                addObject(til2, x, y);
            }
        }
        
        /*
        System.out.println("test");
        int length = getObjectsAt(50, 25, null).size();
        System.out.println(length);
        for(int i = 0; i < length; i++)
        {
            System.out.println((getObjectsAt(50, 25, null).get(i)).toString());
        }
        */
        /*
        //the game will be played within this while loop
        while(game)
        {
            
            
            
            
            
            
            
            if(this.checkEnd())
            {
                if(this.checkWinner())//human win
                {
                    WinScreen win = new WinScreen();
                    Greenfoot.setWorld(win);
                }
                else//computer win
                {
                    LossScreen loss = new LossScreen();
                    Greenfoot.setWorld(loss);
                }
            }
        }
        */
        Coord cord = new Coord("temp");
        addObject(cord, 500, 300);
        
        Fire firee = new Fire();
        addObject(firee, 425, 450);
    }
    
    public void human()
    {
        
    }
    
    public void computer()//computer decision code goes here
    {
        
    }
    
    public boolean checkEnd()
    {
        return false;
    }
    
    public boolean checkWinner()//returns true if human won and false if computer won
    {
        if((pt!=null)||(sub!=null)||(crui!=null)||(batt!=null)||(carr!=null))
        {
            /*
            Message test = new Message("Test");
            addObject(test, 475, 300);
            */
            return true;
        }
        else
        {
            /*
            Message test2 = new Message("Test2");
            addObject(test2, 475, 350);
            */
            
            return false;
        }
    }
    /*
    public void sunk(Actor ship)//not working
    {
        if(ship == pt)
        {
            pt.setImage("ptSunk.png");
        }
    }
    */
    
    public void fire(boolean human, int x, int y)
    {
        
        int x2 = x - 35;
        if(human)
        {
            int y2 = y - 10;
        }
        else
        {
            int y2 = y - 360;
        }
        
        removeObjects(getObjectsAt(x, y, null));
    }
    
    public static void setFiring(boolean fir)
    {
        if(fir)
        {
            firing = true;
        }
        else
        {
            firing = false;
        }
    }
    
    public static boolean getFiring()
    {
        return firing;
    }
    
}
