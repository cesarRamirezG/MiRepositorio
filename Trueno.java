import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trueno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trueno extends Villano2
{
    /**
     * Act - do whatever the Trueno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        caen();
        chocaPou();
    }    
    
    public void caen()
    {
      setLocation(getX(),getY()+2);
        //Greenfoot.delay(3);
        if(isAtEdge())
           getWorld().removeObject(this);
    }
    
    public void   chocaPou()
    {
    }
}
