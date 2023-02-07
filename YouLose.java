import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Game: Witch Hunt 
 * Jess, Randeep, Randeep
 * v 1.0
 */
public class YouLose extends Actor
{
    /**
     * Act - do whatever the YouLose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public YouLose()         // by ravleen
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
