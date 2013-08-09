import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BathroomBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathroomBrick extends Brick
{
    /**
     * Act - do whatever the BathroomBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BathroomBrick() 
    {
        getImage().scale(50, 30);
    }    
    
    public int getScoreValue()
    {
      return 100;
    }
}

