import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Randeep
 * v 1.0
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy2()         // by ravleen
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }

    public void act()
    {
       moveEnemy();          //by jess
       hitByProjectile();
    }
    public void hitByProjectile()     // officially by jess restructured and changed by ravleen.
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
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
