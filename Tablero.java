import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    //GreenfootImage imagen;
    int cont;
    String mensaje;
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tablero (int c, String msj)
    {
        cont=c;
        mensaje =msj;
        //GreenfootImage textImage = new GreenfootImage(msj, 24, new Color(38, 165, 219), new Color(0, 0, 0, 0));
        //setImage(textImage);
        //dibuja();
    
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
