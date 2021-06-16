package me.rto.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //CollectionsExerc collections = new CollectionsExerc();
        //collections.collections();

        //QueueExerc queue = new QueueExerc();
        //queue.queue();

        //SetExerc setExerc = new SetExerc();
        //setExerc.setExerc();

        //ExercicioOptional exercicioOptional = new ExercicioOptional();
        //exercicioOptional.exercicioOptional();

        Scanner scanner = new Scanner(System.in);

        List<Float> numeros = new ArrayList<>();

        for (int i = 0; i <= 6; i++) {
            numeros.add(Float.parseFloat(scanner.next()));
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
