package Clase16;

import java.util.Scanner;

public class ComparaContenidoDeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del primer Array: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        // Solicitar al usuario que ingrese los valores del primer Array
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento #" + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Solicitar al usuario que ingrese los valores del segundo Array
        System.out.println("Ingrese los elementos del segundo Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento #" + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        boolean sonIguales = compararArrays(array1, array2);

        if (sonIguales) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }

        scanner.close();
    }

    public static boolean compararArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false; // Los arrays son de diferentes tamaños, no pueden ser iguales.
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Se encontró una diferencia entre los elementos.
            }
        }

        return true; // Los arrays son iguales.
    }
}

// Este programa, solicita al usuario que ingrese el tamaño de los arrays. Luego, utilizamos la función compararArreglos para comparar los arreglos.

// La función compararArreglos verifica si los arreglos son de diferentes tamaños, en cuyo caso, se consideran diferentes. Si los tamaños son iguales, compara los elementos uno por uno y se detiene en cuanto se detecta una diferencia. Si no se encuentra ninguna diferencia, se consideran iguales.
