/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ruleta;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/**
 *
 * @author Hogar
 */
public class Fondo extends JPanel{
   private BufferedImage Img;
    public Fondo(){
        this.setSize(1200,798);
        cargarImagen();
    }
    public void cargarImagen(){
        try{
            Img = ImageIO.read(getClass().getClassLoader().getResource("Fondo.jpg"));
        }catch(Exception e){
            System.out.println("No se ha encontrado la dichosa imagen");
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(Img, 0, 0, null);
    }
}
