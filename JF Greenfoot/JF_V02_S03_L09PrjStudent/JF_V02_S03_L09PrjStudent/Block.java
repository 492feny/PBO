import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    private int turnspeed;
    public void act()
    {
        // Add your action code here.
        int x = getRotation()+2;
        if(x == 360){
            x=0;
        }
        setRotation(x);
        turn(this.turnspeed);
    }
    public void Block(int maxturnspeed)
    {
        this.turnspeed = Greenfoot.getRandomNumber(2* maxturnspeed) - (maxturnspeed);  
    }
}
