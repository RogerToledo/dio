package me.rto.desafios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class InsereContaNumeros {
    public static void main(String[] args) {
        int count = 0;
        List<Double> numeros = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat("0,00");
        while (count <= 100) {
            Double numero = Double.parseDouble(decimalFormat.format(Math.random() * 1001));
            //numeros.add(numero);
            count++;
        }

        numeros.add(1d);
        numeros.add(1d);
        numeros.add(2d);
        numeros.add(2d);


        numeros.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------");

        List<Integer> repetidosValor = new ArrayList<>();

        for (Double numero : numeros) {
            if (repetidosValor.contains(numero)) {
                repetidosValor.set(repetidosValor.indexOf(numero), repetidosValor.get(repetidosValor.indexOf(numero) + 1));
            } else {
                repetidosValor.add(1);
            }
        }
        System.out.println("Repetidos");
        repetidosValor.forEach(System.out::println);
     }
}
