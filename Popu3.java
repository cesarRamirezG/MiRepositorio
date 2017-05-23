import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Popu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popu3 extends Heroe
{
    GreenfootSound sonido1 = new GreenfootSound("real.wav");
    GreenfootSound sonido2 = new GreenfootSound("fake.wav");
    GreenfootSound sonido3 = new GreenfootSound("1.wav");
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int puntos=0;
    int direccionshoot=2;
    boolean isShoot=false;
    GreenfootSound sonido = new GreenfootSound("4.wav");
    
    /**
     * Act - do whatever the Popu2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        muevePou();
        come();
    }    

    public void muevePou()
    {
        if(Greenfoot.isKeyDown("up"))
        {
         setDireccion(UP);
         direccionshoot=0;
        }
        if(Greenfoot.isKeyDown("down"))
        {
         setDireccion(DOWN);
         direccionshoot=1;
        }
        if(Greenfoot.isKeyDown("left"))
        {
         setDireccion(LEFT);
         direccionshoot=3;
        }
        if(Greenfoot.isKeyDown("right"))
        {
         setDireccion(RIGHT);
         direccionshoot=2;
        }
        
        setshoot(direccionshoot);
        
    }
    public void setshoot(int direccion)
    {
      if(isShoot&& Greenfoot.isKeyDown("space"))
      {
        Shoot s1 = new Shoot(direccion);
        getWorld().addObject(s1, getX(), getY());
        isShoot=false;
        if(!sonido.isPlaying()) sonido.play();
      }
        if(!isShoot&& !Greenfoot.isKeyDown("space"))
      {
        isShoot=true;
      }
    }
    
    
    public void setDireccion(int direccion)
    {
        
        switch(direccion)
        {
              case UP:
              //setRotation(270);
              setLocation(getX(),getY() -10);
              break;
            
              case DOWN:
              //setRotation(90);
              setLocation(getX(),getY() +10);
              break;
              
              case LEFT:
              //setRotation(0);
              setLocation(getX()-10,getY());
              break;
              
              case RIGHT:
              //setRotation(0);
              setLocation(getX()+10,getY());
              break;
          
        }
    
    }
    
   public void come()
   {
       Actor actor = getOneObjectAtOffset(2, 1, Words.class);
       Actor actor2 = getOneObjectAtOffset(2, 1, Villano.class);
      
      
        if(actor != null) 
        {
            setImage("oie_transparent (12).png");
            
            if( actor instanceof Fake) 
            {
                if(puntos > 0 && puntos > 10) puntos -= 10;
                else if(puntos > 0 && puntos < 10) puntos = 0;
                if(!sonido1.isPlaying()) sonido1.play();
            } 
            else if( actor instanceof Real) 
            {
                puntos += 10;
                System.out.println(super.getPuntaje());
                if(!sonido1.isPlaying()) sonido1.play();
             

            }
 
           
            getWorld().removeObject(actor);
            
        } else {
           setImage("oie_transparent (7).png");
        }
        
        if(actor2 != null) 
        {
            if( actor2 instanceof Burbuja)
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
    
    