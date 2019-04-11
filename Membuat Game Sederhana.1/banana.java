import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    {setRotation((90));
}
    public void act() 
    {
        move(3);
      if(getY()<=3 || getY() >= getWorld().getHeight() -3)
      turn(180);
    }    
}
