/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean valorA = true;
        boolean valorB = false;

        System.out.printf("Negacion: !%s = %s\n", valorA, !valorA);
        System.out.printf("Negacion: !%s = %s\n", valorB, !valorB);
        System.out.printf("And: %s & %s = %s\n", valorA, valorB, 
                valorA & valorB); // con el AND necesito que los dos valores
                                  // sean V para que sea V los demas son F.
                                  // con el OR necesito que al menos un valor
                                  // sea V para que sea V si los dos son F es F.
        System.out.printf("And: %s | %s = %s\n", valorA, valorB, 
                valorA | valorB);
       
        
    }

}
