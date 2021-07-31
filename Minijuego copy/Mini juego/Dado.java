import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado extends Actor
{
    /**
     * Act - do whatever the Dado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // generar un número aleatorio.
        if (Greenfoot.mousePressed(this))
        {
            int randomNumber= Greenfoot.getRandomNumber(6);
            setImage(new GreenfootImage(Integer.toString(randomNumber+1), 15, Color.WHITE,Color.BLACK));
        }
    }

}
