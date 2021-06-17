package me.rto.desafios;

import java.io.IOException;
import java.util.Scanner;

public class ValoresImpares {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cont = 0;

        if (x >= 0) {
            while (cont < 6 ) {
                if (x % 2 == 1) {
                    System.out.println(x);
                    cont++;
                }
                x++;
            }
        } else {
            System.out.println("Ops! Apenas números positivos.");
        }

    }
}
