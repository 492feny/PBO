import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends World
{

    /**
     * Constructor for objects of class Alien.
     * 
     */
    public Alien()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,89,232);
        
        Hero hero1 = new Hero();
        addObject(hero1, 89,132);
        
        Hero hero2 = new Hero();
        addObject(hero2, 89,313);
    }
}
