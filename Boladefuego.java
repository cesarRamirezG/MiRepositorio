import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boladefuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boladefuego extends Villano1
{   
    private int ran;
    private int n=2;
    private Popu c;
    private int x;
    private int y;
    private int rota;
    private Nivel1  mundo; 
    

    /**
     * Act - do whatever the Boladefuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Boladefuego(int rot)
    {
        rota=rot;
        setRotation(rota);
    }
    
    public void act() 
    {
        // Add your action code here.
       x=getX();
       y=getY();
        
       mundo = (Nivel1)getWorld();
       choque();
       move(n);
       
    }    
    
    public void choque()
    {
        if(x<10)
           {
            rota=rota*-1;
            setRotation(rota);
            n=n*-1;
           }
          else if(x>490)
           {
            rota=rota*-1;
            setRotation(rota);
            n=n*-1;
           }

        if(y>590)
        { 
            mundo.removeObject(this);
        }
    }
}
