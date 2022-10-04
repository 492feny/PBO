import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        setRotation(180);
    }
    
    public Enemy(int speed){ //variable lokal
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 2; //variable global
    public void act()
    {
        //setRotation(180);
        move(speed);
    }


}
