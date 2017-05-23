import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burbuja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burbuja extends Gary
{
    /**
     * Act - do whatever the Burbuja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
        revotaBurbuja();
        explotaBurbuja();
        
          
    }
    
    public void explotaBurbuja()
    {
      World m = getWorld();
      Actor act = getOneIntersectingObject(Shoot.class);
      if(act!=null)
      {
        getWorld().removeObject(this);
      }
    }
    
    public void revotaBurbuja()
    {
         move(2);
            World m = getWorld();
            if(getX()>m.getWidth() -5|| getX()<=5)
            {
              turn(180);
              if(Greenfoot.getRandomNumber(100)<90)
              {
                 turn(Greenfoot.getRandomNumber(90-45));
              }
            }
            
            if(getY()>m.getHeight() -5|| getY()<=5)
            {
              turn(180);
              if(Greenfoot.getRandomNumber(100)<90)
              {
                 turn(Greenfoot.getRandomNumber(90-45));
              }
            }
    }
}
