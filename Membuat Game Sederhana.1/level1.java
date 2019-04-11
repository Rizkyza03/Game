import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new turtle(),50,200);
        addObject(new banana(),400,30);
        addObject(new banana(),550,200);
        addObject(new banana(),350,370);
        addObject(new banana(),300,200);
        addObject(new score(),130,15);
        addObject(new bola(),470,90);
        addObject(new bola(),470,310);
        addObject(new bola(),180,130);
        addObject(new bola(),180,270);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
