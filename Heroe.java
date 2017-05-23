import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Heroe extends Actor
{
    private int x;
    private int y;
    private int vel=3;
    private String nombre;
    private int puntaje;
    private int vidas;
    
    /**
     * Act - do whatever the Mierdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    public void act() 
    {
        CheckKeys();
    }    
    
    public void CheckKeys()
    {
        x=getX();
        y=getY();
        if (Greenfoot.isKeyDown("Left"))
        {
            if(x>0)
                setLocation(x-vel,y);
        }
        else if (Greenfoot.isKeyDown("Right"))
        {
            if(x<500)
                setLocation(x+vel,y);
        }
    }
    
    public abstract void come();
   
    public String getNombre()
    {
        return nombre;
    }
    
    public int getPuntaje()
    {
        return puntaje;
    }
    
    public int getVidas()
    {
        return vidas;
    }
    
    public void setPuntaje(int puntaje) 
    {                                             
       this.puntaje = puntaje;
    }    
           
}
