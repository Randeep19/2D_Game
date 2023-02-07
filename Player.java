import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game: Witch Hunt
 * Jess, Randeep, Randeep
 * v 1.0
 */
public class Player extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()        // by ravleen
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()      
    {
        moveAround();         // by ravleen
        fireProjectile();    //by jess
    }
    public void moveAround()   // by ravleen
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
    }
    public void fireProjectile()    //by jess
    {
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
}
