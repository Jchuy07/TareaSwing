/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorass.java;

import java.util.Random;


public class CalculadoraEspecial extends Calculadora {

    
    
       public CalculadoraEspecial (String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario){
        super(tipoCalculadora,color,dimensionPantalla,numeroDeSerie,nombrePropietario);
       
    }
         public void mostrarDatos(){
        System.out.println("Tipo de Calculadora: "+tipoCalculadora+"\nColor: "+color+"\nDimension: "+dimensionPantalla+"x"+dimensionPantalla+"\nNumero de Serie: "+numeroDeSerie+"\nNombre del Propietario: "+nombrePropietario);
    }
 
 public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
 
 public double logaritmo(double numero) {
        return Math.log(numero);
    }
 
    public double seno(double angulo) {
        return Math.sin(angulo);
    }
  
    public double coseno(double angulo) {
        return Math.cos(angulo);
    }
  
    public int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
     public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
    

 
