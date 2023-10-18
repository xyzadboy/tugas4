import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    public boolean alive;
    public Bomb()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image); 
        setRotation(45);
        alive = true;
        
    }
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moving();
        checkAtScreenEdge();
        if (!alive)
        {
            getWorld().removeObject(this);
        }
    }
    public void moving()
    {
        setLocation(getX(), getY() + 5);
    }   
    public void checkAtScreenEdge()
    {
        if (isAtEdge())
        {
            alive = false;
        }
    }
}
