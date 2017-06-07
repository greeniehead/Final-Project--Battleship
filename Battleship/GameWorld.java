import greenfoot.*;
import java.util.*;
import java.util.List;

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
        for(int x = 0; x < 10; x++)
        {                
            for(int y = 0; y < 10; y++)
            {
                    AIBoardArray[x][y] = "Empty";
            }
        }
        
        /*
        AICruiser AIcrui = new AICruiser();   
        addObject(AIcrui, AICruiser.placeCruiser()[0]*30, AICruiser.placeCruiser()[1]*30);
        if(AICruiser.placeCruiser()[3] > 5) AIcrui.setRotation(90);
        AIcrui.stayInGrid(AIcrui);
        if(AIcrui.getRotation() == 0)
        {
            Hit hitt = new Hit();
            addObject(hitt, AIcrui.getX(), AIcrui.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIcrui.getX() -30, AIcrui.getY());
            Hit hitttt = new Hit();
            addObject(hitttt, AIcrui.getX() +30, AIcrui.getY());
        }
        else
        {
            Hit hitt = new Hit();
            addObject(hitt, AIcrui.getX(), AIcrui.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIcrui.getX(), AIcrui.getY() -30);
            Hit hitttt = new Hit();
            addObject(hitttt, AIcrui.getX(), AIcrui.getY() +30);
        }
        
        
        
        AISub AIsub = new AISub();   
        addObject(AIsub, AISub.placeSub()[0]*30, AISub.placeSub()[1]*30);
        if(AISub.placeSub()[3] > 5) AIsub.setRotation(90);
        AIsub.stayInGrid(AIsub);
        if(AIsub.getRotation() == 0)
        {
            Hit hitt = new Hit();
            addObject(hitt, AIsub.getX(), AIsub.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIsub.getX() -30, AIsub.getY());
            Hit hitttt = new Hit();
            addObject(hitttt, AIsub.getX() +30, AIsub.getY());
        }
        else
        {
            Hit hitt = new Hit();
            addObject(hitt, AIsub.getX(), AIsub.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIsub.getX(), AIsub.getY() -30);
            Hit hitttt = new Hit();
            addObject(hitttt, AIsub.getX(), AIsub.getY() +30);
        }
        
        
        AIPatrol AIpat = new AIPatrol();
        addObject(AIpat, AIPatrol.placePatrol()[0]*30, AIPatrol.placePatrol()[1]*30);
        if(AIPatrol.placePatrol()[3] > 5) AIpat.setRotation(90);
        AIpat.stayInGrid(AIpat);
        if(AIpat.getRotation() == 0)
        {
            Hit hittt = new Hit();
            addObject(hittt, AIpat.getX() -15, AIpat.getY());
            Hit hitttt = new Hit();
            addObject(hitttt, AIpat.getX() +15, AIpat.getY());
        }
        else
        {
            Hit hitt = new Hit();
            addObject(hitt, AIpat.getX(), AIpat.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIpat.getX(), AIpat.getY() -15);
            Hit hitttt = new Hit();
            addObject(hitttt, AIpat.getX(), AIpat.getY() +15);
        }
        */
        
        for(int i = 0; i < 10; i++)
        {
        AIBattle AIbat = new AIBattle();
        addObject(AIbat, AIBattle.placeBattle()[0]*30, AIBattle.placeBattle()[1]*30);
        if(AIBattle.placeBattle()[3] > 5) AIbat.setRotation(90);
        AIbat.stayInGrid(AIbat);
        if(AIbat.getRotation() == 0)
        {
            Hit hitt = new Hit();
            addObject(hitt, AIbat.getX() +15, AIbat.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIbat.getX() -15, AIbat.getY());
            Hit hitttt = new Hit();
            addObject(hitttt, AIbat.getX() +45, AIbat.getY());
            Hit hittttt = new Hit();
            addObject(hittttt, AIbat.getX() -45, AIbat.getY());
        }
        else
        {
            Hit hitt = new Hit();
            addObject(hitt, AIbat.getX(), AIbat.getY() +15);
            Hit hittt = new Hit();
            addObject(hittt, AIbat.getX(), AIbat.getY() -15);
            Hit hitttt = new Hit();
            addObject(hitttt, AIbat.getX(), AIbat.getY() +45);
            Hit hittttt = new Hit();
            addObject(hitttt, AIbat.getX(), AIbat.getY() -45);
        }
        }
        /*
        AICarrier AIcarr = new AICarrier();
        addObject(AIcarr, AICarrier.placeCarrier()[0]*30, AICarrier.placeCarrier()[1]*30);
        if(AICarrier.placeCarrier()[3] > 5) AIcarr.setRotation(90);
        AIcarr.stayInGrid(AIcarr);
        if(AIcarr.getRotation() == 0)
        {
            Hit hitt = new Hit();
            addObject(hitt, AIcarr.getX(), AIcarr.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIcarr.getX() -30, AIcarr.getY());
            Hit hitttt = new Hit();
            addObject(hitttt, AIcarr.getX() +30, AIcarr.getY());
            Hit hittttt = new Hit();
            addObject(hittttt, AIcarr.getX() -60, AIcarr.getY());
            Hit hitttttt = new Hit();
            addObject(hitttttt, AIcarr.getX() +60, AIcarr.getY());
        }
        else
        {
            Hit hitt = new Hit();
            addObject(hitt, AIcarr.getX(), AIcarr.getY());
            Hit hittt = new Hit();
            addObject(hittt, AIcarr.getX(), AIcarr.getY() -30);
            Hit hitttt = new Hit();
            addObject(hitttt, AIcarr.getX(), AIcarr.getY() +30);
            Hit hittttt = new Hit();
            addObject(hittttt, AIcarr.getX(), AIcarr.getY() -60);
            Hit hitttttt = new Hit();
            addObject(hitttttt, AIcarr.getX(), AIcarr.getY() +60);
        }
        */
        
        
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
        
        
        Coord cord = new Coord("temp");
        addObject(cord, 500, 300);
        
        Fire fireee = new Fire();
        addObject(fireee, 375, 150);
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
