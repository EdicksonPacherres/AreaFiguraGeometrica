/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Marco
 */
public class Circulo {
    // propiedades
    private double radio;
    // metodo statico que no cambia en el tiempo
    public static double PI = 3.141516;
    // metodos.
    
    public void set_Radio(double value){
        this.radio = value;
    }
    
    public double get_Radio(){
           return this.radio;
    }
    
}
