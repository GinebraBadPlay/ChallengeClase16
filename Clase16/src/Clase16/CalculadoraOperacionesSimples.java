package Clase16;

import java.util.Scanner;

public class CalculadoraOperacionesSimples {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int num1, num2;

			do {
			    System.out.println("MENU");
			    System.out.println("1. Sumar");
			    System.out.println("2. Restar");
			    System.out.println("3. Multiplicar");
			    System.out.println("4. Dividir");
			    System.out.println("5. Salir");
			    System.out.print("Elija una opción (1-5): ");
			    int opcion = scanner.nextInt();

			    switch (opcion) {
			        case 1:
			            System.out.print("Ingrese el primer número: ");
			            num1 = scanner.nextInt();
			            System.out.print("Ingrese el segundo número: ");
			            num2 = scanner.nextInt();
			            int suma = sumar(num1, num2);
			            System.out.println("Resultado: " + suma);
			            break;
			        case 2:
			            System.out.print("Ingrese el primer número: ");
			            num1 = scanner.nextInt();
			            System.out.print("Ingrese el segundo número: ");
			            num2 = scanner.nextInt();
			            int resta = restar(num1, num2);
			            System.out.println("Resultado: " + resta);
			            break;
			        case 3:
			            System.out.print("Ingrese el primer número: ");
			            num1 = scanner.nextInt();
			            System.out.print("Ingrese el segundo número: ");
			            num2 = scanner.nextInt();
			            int multiplicacion = multiplicar(num1, num2);
			            System.out.println("Resultado: " + multiplicacion);
			            break;
			        case 4:
			            System.out.print("Ingrese el primer número: ");
			            num1 = scanner.nextInt();
			            System.out.print("Ingrese el segundo número: ");
			            num2 = scanner.nextInt();
			            double division = dividir(num1, num2);
			            System.out.println("Resultado: " + division);
			            break;
			        case 5:
			            char confirmacion;
			            do {
			                System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
			                confirmacion = scanner.next().charAt(0);
			            } while (confirmacion != 'S' && confirmacion != 'N');
			            if (confirmacion == 'S') {
			                System.out.println("Saliendo del programa...");
			                System.exit(0);
			            }
			            break;
			        default:
			            System.out.println("Opción no válida. Intente de nuevo.");
			    }
			} while (true); // Ciclo infinito hasta que el usuario elija salir
		}
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}

// El programa pide dos números enteros positivos por teclado, y luego, muestra por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir. El usuario deberá elegir una opción y el programa mostrara el resultado por pantalla. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se mostrara el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.  El programa se ejecuta en un bucle infinito (do-while) hasta que el usuario elija salir.