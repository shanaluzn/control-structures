package ar.com.ada.online.second.exercisefourteen;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // calificación dada del 0-10, letras de calificación por:
        // 10=A, 9=B, 8=C, 7 y 6=D, de 5 a 0=F

        int numberCalification;
        String letterCalification;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el número de calificación dado: ");
        numberCalification = keyboard.nextInt();

        switch (numberCalification) {
            case 10:
                System.out.println("la nota es A");
                break;
            case 9:
                System.out.println("la nota es B");
                break;
            case 8:
                System.out.println("la nota es C");
                break;
            case 7:
            case 6:
                System.out.println("la nota es D");
                break;
            default:
                System.out.println("La nota es F");

        }

    }

}







