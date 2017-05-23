import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private Start start;
    private help ayuda;
    private Rec cred;
    private Autors autor;
    private int nivel=1;
    
    private String nombre;
    private Heroe jug;
    
    
    GreenfootSound sonido2 = new GreenfootSound("CrystalBell.aiff");
    GreenfootSound sonido3 = new GreenfootSound("menu.mp3");

    //private Credito cred;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1);   
        start=new Start();
        addObject(start,250,300);
        ayuda=new help();
        addObject(ayuda,330,300);
        cred=new Rec();
        addObject(cred,250,380); 
        autor=new Autors();
        addObject(autor,330,380);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void act()
    {    
        if(!sonido3.isPlaying()) sonido3.play();
        if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == start)
            {
                        // press.play();
                    
                    Greenfoot.delay(3);
                    if(!sonido2.isPlaying()) sonido2.play();
                    //Greenfoot.ask(nombre);
                    
                    //Greenfoot.setWorld( new Nivel3());
                    Greenfoot.setWorld( new Nivel1());
                    
        
             }
                
         }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda)
            {
               // press.play();
               
               if(!sonido2.isPlaying()) sonido2.play();
                Greenfoot.delay(5);
               // fondo.stop();
                Greenfoot.setWorld( new Ayuda());
            }
        }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == cred)
            {
               // press.play();
               
               if(!sonido2.isPlaying()) sonido2.play();
                Greenfoot.delay(5);
               // fondo.stop();
                Greenfoot.setWorld( new Records());
            }
        }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==autor)
            {
                //press.play();
            
                if(!sonido2.isPlaying()) sonido2.play();
                Greenfoot.delay(5);
                //fondo.stop();
                Greenfoot.setWorld(new Credito());
            }
        }
    }
}
