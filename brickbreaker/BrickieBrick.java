import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickieBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrickieBrick extends Brick
{
    int direction = 2;
    /**
     * Act - do whatever the BrickieBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (atWorldEdge()) {
            direction = direction * -1;
        }
        super.act();
        move(direction);
    }  

    public boolean atWorldEdge()
    {
        if (getX() < 10) {
            return true;
        }
        if ( getX() > getWorld().getWidth() - 10) {
            return true;
        }  
        return false;
    }  
}