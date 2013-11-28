/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruleta;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/*La clase siguiente contiene el código a ejecutar, utiliza las ventajas
 de un Runnable así que no se debe modificar el nombre del método run()*/
class Temporizador extends TimerTask {

    //Las veces que se debe repetir el código
    private int veces = 10;
    private int opc;
    private int contadorVeces = 0;
    JLabel n0, n26, n3, n35;

    public Temporizador(int n, JLabel n1, JLabel n2, JLabel n03, JLabel n4) {
        opc = n;
        n0 = n1;
        n26 = n2; 
        n3 = n03;
        n35 = n4;
    }

    public void run() {

        contadorVeces++;
        if (contadorVeces <= veces) {
            if (opc <= 4) {
                switch (opc) {
                    case 1:
                        n0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ruleta/Imagenes/bola1.png")));
                        n35.setIcon(null);
                        break;
                    case 2:
                        n26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ruleta/Imagenes/bola1.png")));
                        n0.setIcon(null);
                        break;
                    case 3:
                        n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ruleta/Imagenes/bola1.png")));
                        n26.setIcon(null);
                        break;
                    case 4:
                        n35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ruleta/Imagenes/bola1.png")));
                        n3.setIcon(null);
                        break;
                }
                opc++;
            } else {
                opc = 1;

            }
        } else {
            System.out.println(n0.getName());
            //Si ya se cumplió el número de veces, se cancela todo            
            this.cancel();

        }
    }
    
    public int getOpc() {
        return opc;
    }
}
