import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound.*;
/**
 * Write a description of class Mierdin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popu extends Heroe

{
    private int puntos  =   0;
    GreenfootSound sonido1 = new GreenfootSound("real.wav");
    GreenfootSound sonido2 = new GreenfootSound("fake.wav");
    GreenfootSound sonido3 = new GreenfootSound("1.wav");
    
    /**
     * Act - do whatever the Mierdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    public void act() 
    {
        super.CheckKeys();
        come();
   }
   
   public int getPuntos()
   {
    return puntos;
   }
   
   public void come()
   {
       Actor actor = getOneObjectAtOffset(2, 1, Words.class);
       Actor actor2 = getOneObjectAtOffset(2, 1, Villano.class);
      
      
        if(actor != null) 
        {
            setImage("images/pou_comiendo.png");
            
            if( actor instanceof Fake) 
            {
                if(puntos > 0 && puntos > 10) puntos -= 10;
                else if(puntos > 0 && puntos < 10) puntos = 0;
                if(!sonido2.isPlaying()) sonido2.play();
            } 
            else if( actor instanceof Real) 
            {
                puntos += 10;
                System.out.println(super.getPuntaje());
                if(!sonido1.isPlaying()) sonido1.play();
             

            }
 
           
            getWorld().removeObject(actor);
            
        } else {
           setImage("images/pue_c.png");
        }
        
        if(actor2 != null) 
        {
            if( actor2 instanceof Boladefuego)
            {
                if(puntos > 0 && puntos > 3) puntos -= 3;
                else if(puntos > 0 && puntos < 3) puntos = 0;
                
                if(!sonido3.isPlaying()) sonido3.play();
            }


            getWorld().removeObject(actor2);
        }
        
        super.setPuntaje(puntos);
        //System.out.println(super.getPuntaje());
  }
}
