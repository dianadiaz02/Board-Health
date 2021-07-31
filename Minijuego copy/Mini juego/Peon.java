import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class Peon extends Actor
{
    /*
     * metodo para que el peón pueda esperar
     */
    public void wait (int time)
    {
        Greenfoot.delay(time);
    }
    
    
    public int answer;
    
    /**
     * Act - do whatever the Peon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        /* para que el peon se mueva a la derecha*/
       if (Greenfoot.isKeyDown("right"))
        {
            move(15);
        }
        
        /* para que el peon se mueva a la izquierda*/
        if (Greenfoot.isKeyDown("left"))
        {
            move(-15);
        }
        
        /* para que el peon se mueva para arriba*/
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            wait(20);
            move(120);
            wait(20);
            turn(90);
        }
        
        /* para que se pueda ingresar la casilla en la que se encuentra*/
        if(Greenfoot.isKeyDown("space"))
        {
            String input=Greenfoot.ask("Ingrese la casilla en la que se encuentra");
            answer=Integer.valueOf(input);
        }
        
        /*cambiar de imagen para el auto*/
        if (answer==0)
            {
                setImage("autos_01.png");
            }
        
        /* para sacar la tarjeta 1 */
        if (answer==1)
            {
                setImage("Tarjeta-1.1.png");
                
                
            }
        
        /* para sacar la tarjeta 2 */
        if (answer==2)
            {
                setImage("tarjeta-2.png");
                
            }
        
        /* para sacar la tarjeta 3 */
        if (answer==3)
            {
                setImage("tarjeta-3.png");
                
            }
        
        /* para sacar la tarjeta 4 */
        if (answer==4)
            {
                setImage("tarjeta-4.png");
                
            }
        
        /* para sacar la tarjeta 5 */
        if (answer==5)
            {
                 setImage("tarjeta--5.png");
                
            }
        
        /* para sacar la tarjeta 6 */
        if (answer==6)
            {
                setImage("tarjeta-6.png");
                
            }
         
        /* para sacar la tarjeta 7 */
        if (answer==7)
            {
                setImage("tarjeta-7.png");
                
            }
        
        /* para sacar la tarjeta 8 */
        if (answer==8)
            {
                setImage("tarjeta-8.png");
                
            }
        
        /* para sacar la tarjeta 9 */
        if (answer==9)
            {
                setImage("tarjeta-9.png");
                
            }
        
        /* para sacar la tarjeta 10 */
        if (answer==10)
            {
                setImage("tarjeta-10.png");
                
            }
         
        /* para sacar la tarjeta 11 */
        if (answer==11)
            {
                setImage("tarjeta-11.png");
                
            }
         
        /* para sacar la tarjeta 12 */
        if (answer==12)
            {
                setImage("tarjeta-12.png");
                
            }
        
        /* para sacar la tarjeta 13 */
        if (answer==13)
            {
                setImage("tarjeta-13.png");
                
            }
        
        /* para sacar la tarjeta 14 */
        if (answer==14)
            {
                setImage("tarjeta-14.png");
                
            }
        
            /* para sacar la tarjeta 15 */
        if (answer==15)
            {
                setImage("tarjeta-15.png");
                
            }
            
            /* para sacar la tarjeta 16 */
        if (answer==16)
            {
                setImage("tarjeta-16.png");
                
            }
        
            /* para sacar la tarjeta 17 */
        if (answer==17)
            {
                setImage("tarjeta-17.png");
                
            }
        
            /* para sacar la tarjeta 18 */
        if (answer==18)
            {
                setImage("tarjeta-18.png");
                
            }
            
            /* para sacar la tarjeta 19 */
        if (answer==19)
            {
                setImage("tarjeta-19.png");
                
            }
        
            /*Terminar el juego*/
        if (answer==20)
            {
                Greenfoot.setWorld(new gameover());
                
            }

    }
    
    
        }
    
    
        
    
    
    
    
    

