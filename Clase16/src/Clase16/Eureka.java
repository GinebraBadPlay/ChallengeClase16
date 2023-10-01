package Clase16;

import java.util.Scanner;

public class Eureka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (frase.equals("Eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        scanner.close();
    }
}

//En este programa, utilizamos el método equals() para comparar la cadena ingresada por el usuario (frase) con la cadena "eureka". Si son iguales, se muestra "Correcto", de lo contrario, se muestra "Incorrecto".
// Diferencia mayusculas y miniscula, por lo tanto, debe ser igual a "Eureka" para dar correcto. 



