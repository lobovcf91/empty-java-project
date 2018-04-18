package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        System.out.println(2 + 5 - 3 * 2);
        System.out.println(2 * 4 * 2 / 2);
        System.out.println(1 / 2);
        System.out.println(5 * (1 / 2));
        System.out.println(5f * 1 / 2);

        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();
        int a = valor % 2;
        if (a == 0) {
            System.out.println("par");
        } else {

            System.out.println("impar");

        }
    }
}
