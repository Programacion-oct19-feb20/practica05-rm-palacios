/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos; //si da error tiene que tener el mismo nombre del proyecto.

/**
 *
 * @author reroes
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 10;

        System.out.printf("Igualdad: %d == %d = %s\n", valorA, valorB,
                valorA == valorB); //== para representar si dos valores son iguales
        System.out.printf("Desigualdad: %d != %d = %s\n", valorA, valorB,
                valorA != valorB); // ! diferente
        System.out.printf("Mayor: %d > %d = %s\n", valorA, valorB,
                valorA > valorB);
        System.out.printf("Menor: %d < %d = %s\n", valorA, valorB,
                valorA < valorB);
        System.out.printf("Mayor Igual: %d >= %d = %s\n", valorA, valorB,
                valorA >= valorB);
        System.out.printf("Menor Igual: %d <= %d = %s\n", valorA, valorB,
                valorA <= valorB);
    }

}
