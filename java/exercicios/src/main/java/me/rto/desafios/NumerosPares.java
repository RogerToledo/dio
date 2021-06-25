package me.rto.desafios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int numero = scanner.nextInt();
        scanner.close();

        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                if (i > 0 && i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Apenas inteiros positivos.");
        }
    }
}
