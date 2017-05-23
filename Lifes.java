import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    int c=3;
    /**
     * Act - do whatever the Lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Lifes() 
    {
        // Add your action code here.
    }    
    
    public void Disminuye()
    {
      c--;
       if(c==0)
       {
           Greenfoot.stop();
        }
    }
}
