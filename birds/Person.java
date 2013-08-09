import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    int xv = Greenfoot.getRandomNumber(6) - 3;
    int yv = Greenfoot.getRandomNumber(6) - 3;

    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveRandomly();
        checkForPoop();
    }

    public void moveRandomly() {
        setLocation(getX() + xv, getY() + yv);
        if (Greenfoot.getRandomNumber(100) == 0) {
            xv = Greenfoot.getRandomNumber(6) - 3;
            yv = Greenfoot.getRandomNumber(6) - 3;

        }
    }

    public void checkForPoop() 
    {
        Poop p = (Poop)getOneIntersectingObject(Poop.class);
        if ( p != null && p.atGroundLevel()) {
            reactToPoop();
        }
    }

    public void reactToPoop()
    {
        getWorld().removeObject(this);
    }
}
