import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spencer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spencer extends Actor
{
    boolean facingLeft = false;
    
   
    /**
     * Act - do whatever the Spencer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFireKey();
    }  

    public void checkKeys()
    {
       
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("left")) {
            if (facingLeft) {
                setLocation(getX() - 5, getY());
            }
            else { 
                getImage().mirrorHorizontally();
                facingLeft = true;
            }
        }
        if (Greenfoot.isKeyDown("right")) {
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
        if ("l".equals(Greenfoot.getKey()))
        {
            fireBombMissiles();
        }
    }

    public void fireBombMissiles()
    {
        BombMissiles Bullet = new BombMissiles();
        getWorld().addObject(Bullet, getX(), getY());
        if (facingLeft) {
            Bullet.turn(180);
            Bullet.getImage().mirrorVertically();
        }
    }

}
