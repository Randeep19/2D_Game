import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * JESS, Randeep & Ravleen
 * The Witch-Hunt 
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
    }
}
