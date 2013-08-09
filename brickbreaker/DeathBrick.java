import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class DeathBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathBrick extends Brick
{
    /**
     * Act - do whatever the DeathBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DeathBrick() 
    {
        GreenfootImage image = new GreenfootImage(40, 20);
        image.setColor(Color.black);
        image.fillRect(0, 0, 40, 20);
        image.setColor(Color.blue);
        image.fillOval(10, 2, 20, 8);
        image.fillRect(15, 9, 10, 8);
        image.setColor(Color.white);
        image.fillOval(12, 4, 4, 4);
        image.fillOval(22, 4, 4, 4);
        setImage(image);
    }   
    
    public int getScoreValue()
    {
       return -200;
    }
    
    
}
