package me.rto.desafios;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int km = scanner.nextInt();
        double litros = scanner.nextDouble();
        scanner.close();

        double media = km / litros;

        System.out.println(String.format("%.3f km/l", media));
    }
}
