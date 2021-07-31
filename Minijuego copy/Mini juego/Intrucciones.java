import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intrucciones extends MyWorld
{

    /**
     * Constructor for objects of class Intrucciones.
     * 
     */
    public Intrucciones()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Boton boton = new Boton();
        addObject(boton,526,629);
    }
}
