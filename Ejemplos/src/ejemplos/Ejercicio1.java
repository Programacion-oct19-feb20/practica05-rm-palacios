/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de  familia ha pagado 3 cuotas de navidad de sus hijos, la cuota 1 
 * fue de 15$, la cuota 2 de 10$ y la cuota 3 de 16$. Generar un programa en 
 * lenguaje java que permita ingresar por teclado los valores de las cuotas 
 * luego presentar el promedio de dólares pagado entre las cuotas además
 * presentar un mensaje en pantalla (true false) dependiendo del promedio si el
 * promedio es > = 11 true ; si el promedio es < = 11 false.
 */
public class Ejercicio1 {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        int cuota1 = 15;
        int cuota2 = 10;
        int cuota3 = 16;
        
        
      
        System.out.println("Ingreso de cuota 1");
        cuota1 = entrada.nextInt();
        System.out.println("Ingreso de cuota 2");
        cuota2 = entrada.nextInt();
        System.out.println("Ingreso de cuota 3");
        cuota3 = entrada.nextInt();
        
        int suma = cuota1 + cuota2 + cuota3;
        double promedio = suma / (double)3;
        
        System.out.printf("Suma: %d + %d + %d = %d\nEl promedio es: %.2f"
                + "\n", cuota1, cuota2, cuota3, suma, promedio);
        System.out.printf("Mayor Igual: %.2f >= %d = %s\n", promedio, 11, 
                promedio >= 11);
        System.out.printf("Menor Igual: %.2f <= %d = %s\n", promedio, 11, 
                promedio <= 11);
        
                
        
        
        
        
        
        
        
        
        
        
}
}