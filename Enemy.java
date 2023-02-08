import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Ravleen
 * v 1.0
 */
public class Enemy extends Actor
{
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void moveEnemy()      // by randeep
    {
        setLocation(getX(),getY()+3);
    }
    public void removeEnemy()
    {
        
    }
}
