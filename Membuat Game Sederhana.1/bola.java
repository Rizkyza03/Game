import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    {
    setRotation(Greenfoot.getRandomNumber(90));
}
    public void act() 
    {
      move(10);
      if(getY()<=10 || getY() >= getWorld().getHeight() -10)
      turn(180);
        Actor turtle = getOneObjectAtOffset(0, 0, turtle.class);
        if(turtle!= null){
           removeTouching(turtle.class);
           Greenfoot.stop();
           getWorld().addObject(new kalah(),300,200);
    }    
}
}