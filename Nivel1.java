import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    //private Trueno trueno;
    private Popu popu;
    private Boladefuego bola;
    private Villano1 malo1;
    private Villano2 malo2;
 
    private Words word;
    private int r,rand;
    private int nivel=1;
    private String[] Awords = {"ask", "borrow", "brush", 
        "call", "check", "clean", "climb", "cook", "cover", 
        "cross","cross","dream","dress","earn","end","enter","enjoy",
        "explain","fail"};
        
    private String[] FWords = {"asq", "borou", "bush", 
        "calli", "chek", "cleen", "claimb", "coc", "cober", 
        "ros","cros","druim","dres","irn","ennd","inter","enyoi",
        "explanada","faill"};
    private Menu menu;
        
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel1()
    {    
        super(500, 600, 1); 
     
        popu = new Popu();
        addObject(popu ,250,580);
        
        malo1 = new Villano1();
        addObject(malo1,450,50);
        
        showText("puntaje:",50,40);
        showText("nombre:",50,60);
        //showText(menu.getNombre(),50,80);
       
     
    }
   
    public Popu getPopu()
    {
        return popu;
    }
    public Villano1 getVillano1()
    {
        return malo1;
    }
    public void act()
    {
        //ask(nombre);   ask(java.lang.String prompt)    Obtener la entrada del usuario (y congelar el escenario mientras estamos esperando)
       
        //Greenfoot.playSound("sounds/Undertale Mettaton EX Theme  Death By Glamour.mp3");
        
        
        if(nivel==1)
        nivel1();
        
        if(popu.getPuntaje()>30)
          {
             Greenfoot.setWorld( new Nivel2());
          } 
                
        /*
        if(popu.getPuntos()>30)
        {
            //removeObject(malo1);
            showText("segundo nivel" ,255, 333);
    
            nivel= 2;
            nivel2();
        } 
        
        
        if(popu.getPuntos()>100)
        nivel = 3;
        
        //if(nivel==3)
        //nivel3();
        
        
        /*
        if(validatiempo()>5000)
        {
            nivel2();
        }
        /*else if(nivel==2)
        {

        }*/
    }

    public void nivel1()
    { 
        setBackground("tumblr_mqgwoj3lU71spluqvo3_1280.png");
        if(Greenfoot.getRandomNumber(1000)<=20)
            {
                rand = Greenfoot.getRandomNumber(90);
                rand = rand+45;    
                if(Greenfoot.getRandomNumber(2)==0) //When Real
                {
                    r=Greenfoot.getRandomNumber(Awords.length);
                    word=new Real(Awords[r],rand);
                    addObject(word,(Greenfoot.getRandomNumber(400))+20,10); 
                } 
                else  //When fake
                {
                    r=Greenfoot.getRandomNumber(FWords.length);
                    word=new Fake(FWords[r],rand);
                    addObject(word,(Greenfoot.getRandomNumber(400))+20,10); 
                }
            }
            
        if(Greenfoot.getRandomNumber(1000)<=3)
        {
            bola = new Boladefuego(15); 
            addObject(bola,450,40);

        }
 
    }

    
    
}
