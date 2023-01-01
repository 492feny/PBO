import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
    }
    void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(50,50);
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(50,50);
        }
    }
    public void detectHome()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Home.class))
        {
            Greenfoot.playSound("yipee.wav");
            setLocation(50,50);
        }
    }
    public void eatPizza()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
        }
    }
}