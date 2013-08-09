import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EphemeralBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EphemeralBrick extends Brick
{
    int delay = Greenfoot.getRandomNumber(100) + 50;
    /**
     * Act - do whatever the EphemeralBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (delay == 0) 
        {
            getImage().setTransparency(0);
        }
        if (Greenfoot.getRandomNumber(100) == 0) 
            {
                delay = 100;
            }
        
        else { 
            delay = delay - 1;
            super.act();

        }    
    }
}
