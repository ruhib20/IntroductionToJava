import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkPoopKey();

    }   

    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("up")) {
            move (4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move (-4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn (-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn (3);
        }

    }

    public void checkPoopKey()
    {
        if ("space".equals(Greenfoot.getKey())) {
            firePoop();
        }
    }
    
    public void firePoop()
    {
        getWorld().addObject(new Poop(), getX(), getY());
    }
}
