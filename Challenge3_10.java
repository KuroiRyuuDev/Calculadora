package com.daw.programming;

import java.util.Scanner;

public class Challenge3_10 {

    public static void main(String[] args) {

        int respuesta = 0; // Inicializamos respuesta con un valor que no sea 5
        int correct = 5;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("¿Podrás adivinar el número del 1 al 10?");

        do {
            respuesta = keyboard.nextInt();

            if (respuesta == correct) {
                System.out.println("¡¡¡Has acertado!!!");
            } else if (respuesta > correct) {
                System.out.println("ERROR, es un número menor al que introdujiste");
            } else {
                System.out.println("ERROR, es un número mayor al que introdujiste");
            }
        } while (respuesta != correct);
    }
}