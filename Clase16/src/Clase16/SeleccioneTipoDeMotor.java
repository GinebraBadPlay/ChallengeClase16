package Clase16;

import java.util.Scanner;

public class SeleccioneTipoDeMotor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de motor (1-4): ");
        int tipoMotor = scanner.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }

        scanner.close();
    }
}

//En este programa, se utiliza un switch para verificar el valor de tipoMotor ingresado por el usuario y mostrar el mensaje correspondiente según el caso. Si el valor ingresado no coincide con ninguno de los casos (1-4), se muestra el mensaje "No existe un valor válido para tipo de bomba".