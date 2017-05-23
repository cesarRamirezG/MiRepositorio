import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{
     private Boton bot;
    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        bot=new Boton();
        addObject(bot,400,300);
    }
    public void act()
    {
           if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == bot)
            {
                // press.play();
                Greenfoot.delay(30);
               // fondo.stop();
                Greenfoot.setWorld(new Menu());
            }
        }
    }
}
