import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    private Boton bot;
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        bot=new Boton();
        addObject(bot,400,400);
        
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
