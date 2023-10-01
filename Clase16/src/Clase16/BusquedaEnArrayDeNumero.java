package Clase16;

import java.util.Random;
import java.util.Scanner;

public class BusquedaEnArrayDeNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        // Rellenar el arreglo con valores aleatorios
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100); // Valores aleatorios entre 0 y 99
        }

        System.out.print("Ingrese un número para buscar en el arreglo: ");
        int numeroBuscar = scanner.nextInt();

        boolean encontrado = false;
        boolean repetido = false;
        int primeraPosicion = -1;

        // Buscar el número en el arreglo y verificar si está repetido
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == numeroBuscar) {
                if (!encontrado) {
                    primeraPosicion = i;
                    encontrado = true;
                } else {
                    repetido = true;
                }
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscar + " se encuentra en la posición " + primeraPosicion + " del arreglo.");
            if (repetido) {
                System.out.println("El número también se encuentra repetido en otras posiciones del arreglo.");
            }
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}

// Este programa crea un arreglo de tamaño N con valores aleatorios y luego busca un número ingresado por el usuario en el arreglo. Si encuentra el número, muestra su posición en el arreglo y verifica si está repetido en otras posiciones. Si no encuentra el número, muestra un mensaje indicando que no está en el arreglo.
//Ten en cuenta que este programa utiliza valores aleatorios en el arreglo, por lo que los resultados pueden variar cada vez que se ejecute.
