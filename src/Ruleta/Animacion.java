/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ruleta;

import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

/**
 *
 * @author Sebastián
 */
public class Animacion extends javax.swing.JLabel{
    
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 50;//velocidad de la animacion
    private int frame=1;
    boolean run = false;    
    
  public Animacion(){
        //el tamaño de la imagen el mismo del jlabel
        this.setSize(17,17);
        setimage(frame);
    }
  
  //coloca una imagen en el objeto jlabel
  public void setimage(){        
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ruleta.Imagenes/bola1.png"))); 
  }
    
  //para la animacion  
  public void startAnimation() {    
           run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               public void run() {
                   //se obtiene un numero aleatorio
                   frame = numero_aleatorio(5,1);
                   //se cambia la imagen
                   setimage(frame);                   
               }
           };
           //se inicia la animacion
           System.out.println("Se inicia la animacion");                                             
           tiempo.schedule(task,0,speed); 
    }
    //detiene la animacion
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;
        System.out.println("La animacion fue detenida");                                             
    }
     
     //retorna un nuemro aleatorio entre un rango dado
     private int numero_aleatorio(int max, int min){     
         return min + (int)(Math.random() * ((max - min) + 1));         
     }
}
