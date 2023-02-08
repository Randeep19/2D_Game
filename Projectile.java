import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Ravleen
 * v 1.0
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile()      //by ravleen
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()             //by jess
    {
        projectileMove();        
        removeFromWorld();
    }
    public void projectileMove()    //by jess
    {
        setLocation(getX(), getY()-5);
    }
    public void removeFromWorld()       //by jess
    {
    if(getY() == 0)
        {
            getWorld().removeObject(this);
            
        }
    }
}
