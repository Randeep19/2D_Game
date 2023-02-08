import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Ravleen
 * v 1.0
 */
public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 15;
    int healthBarWidth = 60;
    int healthBarHeight = 10;
    int pixelsPerhealthBarPoint = (int)healthBarWidth/health;
    
    public HealthBar()            // by ravleen
    {
        update();
    }
    public void act()            // by ravleen
    {
       update(); 
       youLose();
    }
    public void update()          // by ravleen
    {
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1); 
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1,1,health*pixelsPerhealthBarPoint, healthBarHeight);
    }
    public void loseHealth()     // by ravleen
    {
        health--;
    }
    public void youLose()        //by ravleen
    {
        if (health == 0)
        {
            getWorld().addObject(new YouLose(), 450, 300);
            Greenfoot.stop();
            Greenfoot.playSound("youlose.wav");
        }
    }
}
