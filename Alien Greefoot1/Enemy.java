import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
     public Enemy()
    {
        setRotation(180);
    }
    
    public Enemy(int speed)//variable lokal
    { 
        setRotation(180);
        this.speed = speed;
    }
    
    private int speed = 3; //variable global
    public void act(){
        enemyMove();
    }
    protected void enemyMove()
    {
        move(speed);

        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    
   
    
    /*public void removeEnemy()
    {
        if(isAtEdge())
        {
             getWorld().removeObject(this);
        }
    }*/
    
    
    
    //VERSI LAIN
    /*
    public Enemy() {
        setRotation(180);
    }
     
    public Enemy(int speed){
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 3;
    public void act()
    {
        move(speed);

        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    atau
    
    public void enemyMove(){
      move(speed);

        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    */  
    

}
