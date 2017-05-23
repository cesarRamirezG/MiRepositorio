import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
   
    int speedShoot=6;
    int posicion;
    
    public Shoot(int direccion)
    {
        posicion=direccion;
    }
    
    /**
     * Act - do whatever the Shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        switch(posicion)
        {
           case 0:
                setLocation(getX(),getY()-speedShoot);
                break;
           case 1:
                setLocation(getX(),getY()+speedShoot);
                break;
           case 2:
                setLocation(getX()+speedShoot,getY());
                break;
           case 3:
                setLocation(getX()-speedShoot,getY());
                break;
         
        }
        if(getX()>getWorld().getWidth()-5||(getX()<=5))
        {
            getWorld().removeObject(this);
        }else{
        if(getY()>getWorld().getHeight()-5||(getY()<=5))
        {
            getWorld().removeObject(this);
        }
        }
    }
    
}