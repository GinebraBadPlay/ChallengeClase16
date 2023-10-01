package Clase16 ;
import java.util.Scanner;

public class ConvertidorFraseMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Convertir la frase a mayúsculas
        String mayusculas = frase.toUpperCase();
        System.out.println("Frase en mayúsculas: " + mayusculas);

        // Convertir la frase a minúsculas
        String minusculas = frase.toLowerCase();
        System.out.println("Frase en minúsculas: " + minusculas);

        scanner.close();
    }
}

