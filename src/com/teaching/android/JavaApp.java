package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        for (int i = 0; i < 40; i = i + 2) {
            System.out.println(new Random().nextInt(40));
        }
GuessTheNumber();
    }


    public static void GuessTheNumber() {
        // Create a random number between 1 and 10
        Random generator = new Random();
        int random = generator.nextInt(10) + 1;

        System.out.print("Estoy pensando en un número del 1 al 10. Puedes adivinarlo?");

        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        if (valor == random) {
            System.out.print("Correcto!");
            System.exit(0);
        } else if (valor > random) {
            System.out.println("Más pequeño! Prueba otra vez:");
        } else {
            System.out.println("Más alto! Prueba otra vez:");
        }

        valor = keyboard.nextInt();
        if (valor == random) {
            System.out.println("Correcto!");
            System.exit(0);
        } else if (valor > random) {
            System.out.println("Más pequeño! Prueba otra vez:");
        } else {
            System.out.println("Más alto! Prueba otra vez:");
        }

        valor = keyboard.nextInt();
        if (valor == random) {
            System.out.println("Correcto!");
            System.exit(0);
        }

        System.out.println("Has perdido, el número correcto es " + random);
    }


}




