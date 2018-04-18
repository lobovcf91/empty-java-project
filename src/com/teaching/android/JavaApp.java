package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        for (int i=0; i<40; i=i+2)
        {
            System.out.println(new Random().nextInt(40));
        }

        }
    }

