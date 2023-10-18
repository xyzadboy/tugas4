import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends Actor
{
    public int speed;
    public String direction;
    public Ufo()
    {
        int coin = Greenfoot.getRandomNumber(2);
        if (coin == 0)
        {
            direction = "right";
        }
        else
        {
            direction = "left";
        }
        speed = 5 + Greenfoot.getRandomNumber(5);
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth() / 5, image.getHeight() / 5); 
        setImage(image); 
    }
    public void act()
    {
        // Add your action code here.
        moving();
        dropABomb();
    }
    public void moving()
    {
        if (direction.equals("right"))
        {
            setLocation(getX() + speed, getY());
        }
        else
        {
            setLocation(getX() - speed, getY());
        }
        if (isAtEdge())
        {
            if (direction.equals("right"))
            {
                direction = "left";
            }
            else
            {
                direction = "right";
            }
        }
    }
    public void dropABomb()
    {
        int theNumber = Greenfoot.getRandomNumber(400);
        if (theNumber == 0)
        {
            Bomb theBomb = new Bomb();
            getWorld().addObject(theBomb, getX(), getY()); 
        }
    }
}


