package Clase16;

import java.util.Scanner;

public class SumaDeElementosEnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo como numero: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        // Solicitar al usuario que ingrese los valores del arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento #" + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int suma = calcularSuma(arreglo);

        System.out.println("La suma de los elementos del arreglo es: " + suma);

        scanner.close();
    }

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}

// En este programa, primero solicitamos al usuario el tamaño del arreglo y luego pedimos que ingrese los valores del arreglo uno por uno. Luego, utilizamos la función calcularSuma para calcular la suma de todos los elementos del arreglo.

//La función calcularSuma recorre cada elemento del arreglo y acumula la suma. Al final, se muestra el resultado en pantalla. Este código permite calcular la suma de los elementos de un arreglo con valores ingresados por el usuario.

