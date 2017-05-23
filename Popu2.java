import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Popu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popu2 extends Heroe
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    private int puntos  =   0;
    GreenfootSound sonido1 = new GreenfootSound("real.wav");
    GreenfootSound sonido2 = new GreenfootSound("fake.wav");
    GreenfootSound sonido3 = new GreenfootSound("1.wav");
    
    /**
     * Act - do whatever the Popu2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       muevePou();
       come();
    }    


    public void muevePou()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
        {
         setDireccion(UP);
        }
        if(Greenfoot.isKeyDown("down"))
        {
         setDireccion(DOWN);
        }
        if(Greenfoot.isKeyDown("left"))
        {
         setDireccion(LEFT);
        }
        if(Greenfoot.isKeyDown("right"))
        {
         setDireccion(RIGHT);
        }
    }
    
    public void setDireccion(int direccion)
    {
        
        switch(direccion)
        {
              case UP:
              //setRotation(270);
              setLocation(getX(),getY() -3);
              break;
            
              case DOWN:
              //setRotation(90);
              setLocation(getX(),getY() +3);
              break;
              
              case LEFT:
              //setRotation(180);
              setLocation(getX()-3,getY());
              break;
              
              case RIGHT:
              setRotation(0);
              setLocation(getX()+3,getY());
              break;
          
        }
    
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
            setImage("pou_panda2 (2).png");
            
            if( actor instanceof Fake) 
            {
                if(puntos > 0 && puntos > 10) puntos -= 10;
                else if(puntos > 0 && puntos < 10) puntos = 0;
                if(!sonido2.isPlaying()) sonido2.play();
            } 
            else if( actor instanceof Real) 
            {
                puntos += 10;
                if(!sonido1.isPlaying()) sonido1.play();

            }
 
            System.out.println(super.getPuntaje());
        
            getWorld().removeObject(actor);
            
        } else {
           setImage("pou_panda.png");
        }
        
        if(actor2 != null) 
        {
            if( actor2 instanceof Trueno)
            {
                if(puntos > 0 && puntos > 3) puntos -= 3;
                else if(puntos > 0 && puntos < 3) puntos = 0;
                
                if(!sonido3.isPlaying()) sonido3.play();
            }


            getWorld().removeObject(actor2);
        }
        
        super.setPuntaje(puntos);
        System.out.println(super.getPuntaje());
  }
}