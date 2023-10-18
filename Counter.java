import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    int totalCount;
    public Counter()
    {
        totalCount = 0;
        setImage(new GreenfootImage(""+totalCount, 40, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        if (totalCount == 50)
        {
            World world = getWorld();
            world.removeObjects(world.getObjects(null));
            world.setBackground("YouWin.png");
            Greenfoot.stop();            
        }
    }
    public void increaseCounter(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage(""+totalCount, 40, Color.WHITE, Color.BLACK));        
    }
}

