/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;
import java.io.*;
import java.util.Scanner;
/**
 * @author Morales Pacherres José Edickson
 * Fecha de Creación : 19.09.2018
 * Curso : EStructura de Datos - Grupo A
 * Tema : ED
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        Scanner teclado = new Scanner(System.in);
        double area = 0;
        // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)
        
        // instancia de la clase figura
        Figura ofigura = new Figura();
        
        //  Instanciando la Clase Circulo
        System.out.println("Ingrese el RADIO del Círculo");
        double r = teclado.nextInt();
        
        Circulo ocirculo = new Circulo();
        ocirculo.set_Radio(r);
        
        area = ofigura.CalculoArea(ocirculo);
        
        System.out.println(" El Area del Circulo es : " + area);
        
        // Instancias la Clase Triangulo
        System.out.println("\nIngrese la BASE del Triángulo");
        double b1 = teclado.nextInt();
        
        System.out.println("Ingrese la ALTURA del Triángulo");
        double h1 = teclado.nextInt();
        
        Triangulo oTriangulo = new Triangulo(b1,h1);
            
        area = ofigura.CalculoArea(oTriangulo);
        
        System.out.println(" El Area del Triangulo es : " + area);
        
        
        //Instancias para la clase Rectangulo
        
        System.out.println("\nIngrese la BASE del Triángulo");
        double b2 = teclado.nextInt();
        System.out.println("Ingrese la ALTURA del Triángulo");
        double h2 = teclado.nextInt();
        Rectangulo oRectangulo = new Rectangulo(b2,h2);
        
        area = ofigura.CalculoArea(oRectangulo);
        
        System.out.println("El Área del Rectangulo es : " + area);
        // Los Datos de Entrada que se ingresen desde teclado.
        // Completar para el area del rectangulo.
        
    }
    
    // 
    public double CalculoArea(Object obj) {
        double area = 0;
            
        //System.out.println(obj.getClass().getSimpleName());
        
        switch (obj.getClass().getSimpleName())
        {
            case "Circulo":
               // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
               Circulo oCirculo = (Circulo) obj;
                
                area =  Circulo.PI*Math.pow(oCirculo.get_Radio(), 2); 
               
               break;
            
            case "Triangulo":
                 
                Triangulo oTriangulo = (Triangulo) obj;
                 
                area = oTriangulo.GetBase()*oTriangulo.GetAltura()/2;
                
                break;
            
            case "Rectangulo":
                
                Rectangulo oRectangulo = (Rectangulo) obj;
                
                area = oRectangulo.GetBase()*oRectangulo.GetAltura();
               
            default: 
                
                break;
        }
        
        
        return area;
    }
    
}
