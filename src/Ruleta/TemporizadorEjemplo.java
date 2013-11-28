/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ruleta;

import java.util.Timer;
import java.util.TimerTask;
 
public class TemporizadorEjemplo {
 
    public static void main(String[] args) {
 
        //Milisegundos (segundos*1000) luego de los cuales ejecutar el código
        int milisegundos = 0;
 
        /*Aquí es donde se mencionó la importancia de definir un tiempo
         luego del cual se volverá a ejecutar el código, si es que no se
         desea eso, se puede dejar en 1 (no en 0) ya que en la clase Codigo 
         se realizará todo el debido control*/
        int milisegundosRepeticion = 10;
 
        //Temporizador instanciado desde la clase Timer
        Timer temporizador = new Timer("");
 
        //Instancia de la clase que contiene el código a ejecutar
        Codigo c = new Codigo();
 
        /*Se hace un llamado al temporizador para que ejecute el
         * código en X milisegundos y que repita el código luego del tiempo
         * determinado.
         */
        temporizador.schedule(c, milisegundos, milisegundosRepeticion);
 
    }
}
 
/*La clase siguiente contiene el código a ejecutar, utiliza las ventajas
 de un Runnable así que no se debe modificar el nombre del método run()*/
class Codigo extends TimerTask {
 
    //Las veces que se debe repetir el código
    private int veces = 2;
    private int contadorVeces = 0;
 
    public void run() {
 
        contadorVeces++;
 
        if (contadorVeces <= veces) {
 
            System.out.println("hola");
 
        } else {
 
            //Si ya se cumplió el número de veces, se cancela todo            
            this.cancel();
 
        }
    }
}