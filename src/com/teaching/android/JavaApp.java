package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {
/*  EJERCICIO PRIMERO CON PERSONA
    public static void main(String[] args) {
        // new personal ("messi", "100")
        persona p1 = new persona("Messi", 100f);
        persona p2 = new persona("Cristiano", 500f);
        p1.pagar(p2, 400f);
        String nombre1 = p1.getNombre();
        System.out.println(nombre1 + "tiene" + p1.getDinero() + "€");
*/
//ejercicio segundo con punto
        public static void main(String[] args) {
        punto p1 = new punto(2, 4);
        punto p2 = new punto(3, 5);
        double distancia = p1.distancia(3, 5);
        System.out.println(distancia);
        double distancia2 = p1.distancia(p2);
        System.out.println(distancia2);

        System.out.println(p1);

    }


    public static void GuessTheNumber() {
        // Create a random number between 1 and 10
        Random generator = new Random();
        int random = generator.nextInt(10) + 1;

        System.out.print("Estoy pensando en un número del 1 al 10. Puedes adivinarlo?");

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int valor = keyboard.nextInt();

            if (valor == random) {
                System.out.print("Correcto!");
                System.exit(0);
            }

            // Ask user to try again
            if (i < 2) {
                if (valor > random) {
                    System.out.println("Más pequeño! Prueba otra vez:");
                } else {
                    System.out.println("Más alto! Prueba otra vez:");
                }
            }
        }

        System.out.println("Has perdido, el número correcto es " + random);
    }

}






