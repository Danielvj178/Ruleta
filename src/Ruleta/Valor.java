/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruleta;

import javax.swing.JLabel;

public class Valor {

    Integer valor = 0;

    public void setLabel(int valor, JLabel l) {
        this.valor += valor;
        l.setText(this.valor.toString());
    }
    
    public void setVal(int valor){
        this.valor += valor;
    }
    
    public Integer getVal(){
        return valor;
    }
}
