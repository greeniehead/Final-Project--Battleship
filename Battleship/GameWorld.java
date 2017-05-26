import greenfoot.*;

public class GameWorld extends World
{
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
        
        Miss mis = new Miss();
        addObject(mis, 80, 260);
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 25; y < 325; y += 30)
            {
                Tile til2 = new Tile();
                addObject(til2, x, y);
            }
        }
        
        for(int x = 50; x < 350; x += 30)
        {
            for(int y = 375; y < 651; y += 30)
            {
                Tile til3 = new Tile();
                addObject(til3, x, y);
            }
        }//THIS WILL GO IN AFTER THE POINT WHERE THE COMPUTER PLACES ITS SHIPS WHICH WILL BE
         //IMMEDIATE IN THE FINAL CODE.  DO NOT FORGET TO FIX!!!!!
        
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
       
      
        AIPatrol AIpat = new AIPatrol();
        addObject(AIpat, AIPatrol.placePatrol()[0]*60, AIPatrol.placePatrol()[1]*30);
    
        if(AIPatrol.placePatrol()[3] > 5) AIpat.setRotation(90);
    
       
        for(int i = 0; i < AIPatrol.placePatrol().length; i++){
        System.out.println(AIPatrol.placePatrol()[i]);
        }
        
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
        sunk(pt);
        
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
    
    public void sunk(Actor ship)//not working
    {
        if(ship == pt)
        {
            pt.setImage("ptSunk.png");
        }
    }
    
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
}
