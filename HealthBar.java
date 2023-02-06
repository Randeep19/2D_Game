import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public HealthBar()
    {
        update();
    }
    public void act()
    {
       update();  
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1); 
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1,1,health*pixelsPerhealthBarPoint, healthBarHeight);
    }
    public void loseHealth()
    {
        health--;
    }
}