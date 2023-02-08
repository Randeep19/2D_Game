import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Ravleen
 * v 1.0
 */
public class Counter extends Actor
{
    int score = 0;          //by randeep
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter()                //by randeep
    {
        setImage(new GreenfootImage("Score: " + score, 30, Color.GREEN, Color.BLACK));
    }
    
    public void act()              //by randeep
    {
        setImage(new GreenfootImage("Score: " + score, 25, Color.GREEN, Color.BLACK));
        YouWin();
    }
    
    public void addScore()        //by randeep
    {
        score++;
    }
    
    public void YouWin()          // by ravleen
    {
        if (score >= 25)
        {
            getWorld().addObject(new YouWin(), 450, 300);
            Greenfoot.stop();
            Greenfoot.playSound("youwin.wav");
        }
    }
}
