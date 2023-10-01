package Clase16;

import java.util.Scanner;

public class ConvertidorDeGrados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double gradosCelsius = scanner.nextDouble();

        double gradosFahrenheit = convertirACelsius(gradosCelsius);

        System.out.println("La temperatura en grados Fahrenheit es: " + gradosFahrenheit);

        scanner.close();
    }

    public static double convertirACelsius(double gradosCelsius) {
        double gradosFahrenheit = 32 + (9 * gradosCelsius / 5);
        return gradosFahrenheit;
    }
}

//En este programa, hemos creado un método llamado convertirACelsius que toma un valor en grados Celsius como entrada y devuelve su equivalente en grados Fahrenheit según la fórmula que mencionaste.

//El programa principal (main) solicita al usuario ingresar una temperatura en grados Celsius, llama al método convertirACelsius para realizar la conversión y luego muestra el resultado en grados Fahrenheit en la pantalla.


