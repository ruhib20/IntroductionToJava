import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toby extends Actor
{
    boolean facingLeft = false;
    /**
     * Act - do whatever the Toby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        checkKeys();
        checkFireKey();
    }

    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("a")) {
            if (facingLeft) {
                setLocation(getX() - 5, getY());
            }
            else { 
                getImage().mirrorHorizontally();
                facingLeft = true;
            }
        }
        if (Greenfoot.isKeyDown("d")) {
            if (facingLeft) {
                getImage().mirrorHorizontally();
                facingLeft = false;
            }
            else {
                setLocation(getX() + 5, getY());
            }
        }
    }

    public void checkFireKey()
    {
        if ("q".equals(Greenfoot.getKey()))
        {
            fireSmileyMissiles();
        }
    }

    public void fireSmileyMissiles()
    {
        SmileyMissiles bullet = new SmileyMissiles();
        getWorld().addObject(bullet, getX(), getY());
        if (facingLeft) {
            bullet.turn(180);
            bullet.getImage().mirrorVertically();
        }

    }
}
