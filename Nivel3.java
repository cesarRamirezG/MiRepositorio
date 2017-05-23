import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{
    //private Trueno trueno;
    private Popu3 popu3;
    private Burbuja bur;
    private Gary malo3;
    
    private Words word;
    private int r,rand;
    private int nivel=2;
    
    private String[] Awords = {"cut", "break","catch", "come", "dress", 
                               "eat", "fall", "get", "go", "hold", "hang",
                                "speak","take"};
        
    private String[] FWords = {"off", "up", "down", "apart", "front", "in",
                                "out" , "back", "on" };

    public Lifes objlife;
        
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel3()
    {    
        super(500, 600, 1); 
     
        popu3 = new Popu3();
        addObject(popu3 ,250,480);
        
        malo3 = new Gary();
        addObject(malo3,250,50);
        
        objlife= new Lifes();
        
    
    }
   
   
    public void act()
    {
        //ask(nombre);   ask(java.lang.String prompt)    Obtener la entrada del usuario (y congelar el escenario mientras estamos esperando)
       
        //Greenfoot.playSound("sounds/Undertale Mettaton EX Theme  Death By Glamour.mp3");
       
   
        setBackground("rompecabezas-de-doki-para_501d49c4be7f7_img.jpg");
        
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
            addObject(new Burbuja(),25,50);
        }
            
        
    }
}