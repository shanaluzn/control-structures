package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int numberOne;
int numberTwo;
int mayor;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer número:");
        numberOne = keyboard.nextInt();

        System.out.print("Ingrese el valor del segundo número:");
        numberTwo = keyboard.nextInt();

if (numberOne > numberTwo) {
    mayor = numberOne;
}
    else {
        mayor = numberTwo;
    }

        System.out.println("El número mayor es. "+ mayor);
    }
}
