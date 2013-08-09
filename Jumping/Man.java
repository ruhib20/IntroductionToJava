import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int speed = 0
        boolean jumping = false;

        if (getY() < 374)
        {
            applyGravity();
        }
        else {
            stickToGround();
            checkKeys();
        }
    }  

    public void checkKeys() 
    {
        if (greenfoot.isKeyDown("up")) {
            if (! jumping) {

                speed = - 15;
                applyGravity();
            }
        }
        public void applyGravity()
        {
            speed = speed +1;
            setLocation(getX(), getY() + speed);
        }

        public void stickToGround()
        {
            setLocation(getX(), 374);
        }    
    }
