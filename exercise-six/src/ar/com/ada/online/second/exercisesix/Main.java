package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ejercicio 2.6 “La langosta ahumada”

        int numberOfpeople;
        double totalPayment;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el número de personas para el banquete: ");
        numberOfpeople = keyboard.nextInt();

        if (numberOfpeople > 300) {
            totalPayment = numberOfpeople * 75;
        } else {
            if (numberOfpeople > 200) {
                totalPayment = numberOfpeople * 85;
            } else {
                totalPayment = numberOfpeople * 95;
            }
        }
        System.out.println("El total a pagar es de: "+ totalPayment);

    }
}

