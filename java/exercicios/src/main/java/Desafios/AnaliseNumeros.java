package Desafios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numerosPares = 0;
        int numerosImpares = 0;
        int numeroPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            // Verifica se é positivo ou negativo
            if (numero > 0) {
                numeroPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            }

            // Verifica se é par ou impar
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println(numerosPares + " valor(es) par(es)");
        System.out.println(numerosImpares + " valor(es) impar(es)");
        System.out.println(numeroPositivos + " valor(es) positivo(s)");
        System.out.println(numerosNegativos + " valor(es) negativo(s)");
    }
}
