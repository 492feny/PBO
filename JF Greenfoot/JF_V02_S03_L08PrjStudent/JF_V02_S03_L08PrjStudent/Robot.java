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
    int score = 0;
    int lives = 3;
    int pizzaEaten = 0;
    private GreenfootImage gameOver = new GreenfootImage("gameover.png");
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
    }
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
            animate();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
            animate();
        }
    }
    void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(50,50);
            removeLife();
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(50,50);
            removeLife();
        }
    }
    public void detectHome()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Home.class))
        {
            Greenfoot.playSound("yipee.wav");
            setLocation(50,50);
            if (pizzaEaten==5)
            {
                pizzaEaten=0;
            }
        }
    }
    public void eatPizza()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten++;
        }
    }
    private GreenfootImage robotimage1 = new GreenfootImage("man01.png");
    private GreenfootImage robotimage2 = new GreenfootImage("man02.png");
    public void animate()
    {
        if (getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
    }
    public void removeLife()
    {
        lives--;
        testEndGame();
    }
    public void testEndGame()
    {
        if (lives < 0 || pizzaEaten==5)
        {
            GreenfootImage image = new GreenfootImage(gameOver);
            setImage(image);
            Greenfoot.stop(); 
        }
    }
    public void increaseScore()
    {
        if (pizzaEaten==5)
        {
            score++;
        }
    }
    public void showStatus()
    {
        getWorld().showText("Score      : "+score,60,530);
        getWorld().showText("Live       : "+lives,55,550);
        getWorld().showText("pizzaEaten : "+pizzaEaten,70,570);
    }
  
}