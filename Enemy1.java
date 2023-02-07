import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Randeep
 * v 1.0
 */
public class Enemy1 extends Enemy
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1()           // by ravleen
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        moveEnemy();             //by randeep
        hitByProjectile();
    }
    public void hitByProjectile()      // officially by jess restructured and changed by ravleen.
    {
         Actor projectile =  getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.addScore();
            getWorld().removeObject(this);
        } 
           
        else if(getY() == 599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = (HealthBar) getWorld().getObjects(HealthBar.class).get(0);
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
