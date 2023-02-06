import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * JESS, Randeep & Ravleen
 * witch hunt 
 * V 1.0
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Player added! (BY RAVLEEN)
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,203,549);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,117,50);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,748,21);
        player.setLocation(178,444);
        Projectile projectile = new Projectile();
        addObject(projectile,178,444);
    }
}
