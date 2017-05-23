import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    //private Trueno trueno;
    private Popu2 popu2;
    private Trueno rayo;
    private Villano2 malo1;
    private Words word;
    private int r,rand;
    private int nivel=2;
    
    private String[] Awords = {"ask", "borrow", "brush", 
        "call", "check", "clean", "climb", "cook", "cover", 
        "cross","cross","dream","dress","earn","end","enter","enjoy",
        "explain","fail",
        
        "be","become","begin","break","choose", "come",
        "feel", "forget", "sleep", "send",
        "sing", "sell", "speak", "meet", "ride","tell", "win","steal",
        "swim", "think", "wake", "wear", "find", "fly", "grow", "hear",
        "hurt", "have", "make", "teach", "see", "let", "write"};
        
    private String[] FWords = {"asq", "borou", "bush", 
        "calli", "chek", "cleen", "claimb", "cocacola", "cober", 
        "ros","rop","druim","dres","irn","ennd","inter","enyoi",
        "explan","faill",
    
        "bi","becom","begn","breaq","chose", "comer",
        "fel", "forgt", "slep", "senf",
        "sng", "sel", "speaq", "meed", "rid","tll", "wln","stel",
        "swi", "thinq", "waqe", "weae", "fynd", "fli", "grw", "her",
        "hur", "hae", "maw", "teah", "se", "lut", "writee"};

        
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel2()
    {    
        super(500, 600, 1); 
     
        popu2 = new Popu2();
        addObject(popu2 ,250,280);
        
        malo1 = new Villano2();
        addObject(malo1,0,40);
        
        addObject(new Nube(),0,60);
        addObject(new Nube(),50,60);
        addObject(new Nube(),130,60);
        addObject(new Nube(),230,60);
        addObject(new Nube(),330,60);
        addObject(new Nube(),430,60);
        addObject(new Nube(),490,60);
        addObject(new Nube(),80,60);
        addObject(new Nube(),180,60);
        addObject(new Nube(),280,60);
        addObject(new Nube(),360,60);
    }
   
    public void act()
    {
        //ask(nombre);   ask(java.lang.String prompt)    Obtener la entrada del usuario (y congelar el escenario mientras estamos esperando)
       
        
        //Greenfoot.playSound("sounds/Undertale Mettaton EX Theme  Death By Glamour.mp3");
        
        if(nivel==2)
        nivel2();
        
        if(popu2.getPuntaje()>30)
          {
             Greenfoot.setWorld( new Nivel3());
          } 
          
    }
    
    public void nivel2()
    {
       
        showText("puntaje:",50,40);
        showText("nombre:",50,60);
   
        setBackground("castle.png");
        
        //Greenfoot.setSpeed(100);
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
            addObject(new Trueno(),10,20);
        }
        if(Greenfoot.getRandomNumber(1000)<=3)
        { 
            addObject(new Trueno(),200,20);
        }
          if(Greenfoot.getRandomNumber(1000)<=3)
        { 
            addObject(new Trueno(),400,20);
        }
       
    }
}