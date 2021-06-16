package Desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        List<Float> numeros = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            try {
                numeros.add(scanner.nextFloat());
            } catch (Exception e) {
                System.out.println("Ops... Algum valor diferente de float foi inserido.");
            }

        }

        List<Float> numerosPositivos = new ArrayList<>();

        numeros.forEach(numero -> {
            if (numero > 0) {
                numerosPositivos.add(numero);
            }
        });

        System.out.println(numerosPositivos.size() + " valores positivos");
    }
}
