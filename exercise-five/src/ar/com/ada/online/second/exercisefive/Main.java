package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int primerValor;
        int segundoValor;
        int tercerValor;
        int valorMayor;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer número");
        primerValor = keyboard.nextInt();

        System.out.println("Ingrese el valor del segundo número");
        segundoValor = keyboard.nextInt();

        System.out.println("Ingrese el valor del tercer número");
        tercerValor = keyboard.nextInt();

        if (primerValor > segundoValor) {
            if (primerValor > tercerValor) {
                valorMayor = primerValor;
            } else {
                valorMayor = tercerValor;
            }
        } else {

            if (segundoValor > tercerValor) {
                valorMayor = segundoValor;
            }
            else {
                valorMayor = tercerValor;
        }

        }

        System.out.println("El número mayor es: "+ valorMayor);
    }
}
