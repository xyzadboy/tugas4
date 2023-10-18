import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShooter extends World
{
    private Counter counter = new Counter();
    /**
     * Constructor for objects of class SpaceShooter.
     * 
     */
    public SpaceShooter()
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
        Rocket rocket = new Rocket();
        addObject(rocket,66,387);
        rocket.setLocation(49,375);
        Ufo rock = new Ufo();
        addObject(rock,82,38);
        Ufo rock2 = new Ufo();
        addObject(rock2,164,47);
        Ufo rock3 = new Ufo();
        addObject(rock3,546,128);
        Ufo rock4 = new Ufo();
        addObject(rock4,357,95);
        Ufo rock5 = new Ufo();
        addObject(rock5,463,34);
        Ufo rock6 = new Ufo();
        addObject(rock6,260,104);
        Ufo rock7 = new Ufo();
        addObject(rock7,42,107);
        Ufo rock8 = new Ufo();
        addObject(rock8,464,104);
        Ufo rock9 = new Ufo();
        addObject(rock9,317,32);
        Ufo rock10 = new Ufo();
        addObject(rock10,148,122);
        
        addObject(counter,31,30);
    }
    public Counter getCounter()
    {
        return counter;
    }
}
