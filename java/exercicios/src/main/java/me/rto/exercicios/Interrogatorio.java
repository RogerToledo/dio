package me.rto.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Interrogatorio {
    public static void main(String[] args) {
        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para vitima?");
        perguntas.add("Já trabalhou com a vítima?");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int sim = 0;

        System.out.println("Responda as perguntas com S para Sim e N para Não");
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.next();
            if ("S".equalsIgnoreCase(resposta)) {
                sim++;
            }
        }

        scanner.close();

        if (sim == 5) {
            System.out.println("Assassino(a)");
        } else if (sim == 3 || sim == 4) {
            System.out.println("Cumplice");
        } else if (sim == 2) {
            System.out.println("Suspeito(a)");
        } else {
            System.out.println("Inocente");
        }
    }
}
