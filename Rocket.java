
import greenfoot.*;  
public class Rocket extends Actor
{   
    public int coolDown;
    public boolean alive;
    public Rocket()
    {
       
        coolDown = 0;
        alive = true;
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth() / 5, image.getHeight() / 5); 
        setImage(image); 
    }
    public void act()
    {
        moving();
        shooting();
        colliding();
        if (coolDown > 0)
        {
            coolDown--;
        }
        if (!alive)
        {
            World world = getWorld();
            world.removeObjects(world.getObjects(null));
            world.setBackground("GameOver.png");
            Greenfoot.stop();
        }
    }
    public void moving()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
        }
    }
    public void shooting()
    {
        if (Greenfoot.isKeyDown("space") && coolDown == 0)
        {
            Shot bullet = new Shot();
            getWorld().addObject(bullet, getX(), getY()-50); 
            coolDown = 30;
        }
    }
    public void colliding()
    {
        if (isTouching(Bomb.class))
        {
            removeTouching(Bomb.class);
            alive = false;
        }
    }
}
