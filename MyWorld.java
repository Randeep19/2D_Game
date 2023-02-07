import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt
 * 
 * Jess, Randeep, Randeep
 * v 1.0
 */
public class MyWorld extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 600, 1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
    public void act()
    {
        
        addEnemy1();
        addEnemy2();
    } 
    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(80)<1)
        {
        addObject(new Enemy1(), Greenfoot.getRandomNumber(900), 0);
    }
    }
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(200)<1)
        {
        addObject(new Enemy2(), Greenfoot.getRandomNumber(900), 0);
    }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,134,553);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,213,109);

        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,534,136);
        enemy2.setLocation(544,145);
        Counter counter = new Counter();
        addObject(counter,70,35);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,824,30);
    }
}
