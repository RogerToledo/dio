package me.rto.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExerc {
    public static void main(String[] args) {
        List<String> numeroAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        numeroAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegar 5 primeiros números e colocar dentro de um Set");
        numeroAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforma String em Integer");
        List<Integer> collectList = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Transforma String em Integer,  pegar os números pares maiores que 2 e colocar em uma lista");
        collectList.stream()
                .filter(i -> i % 2 == 0 && i > 2 )
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Mostrar a média dos números");
        numeroAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remover valores impares");
        List<Integer> integerList = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        integerList.removeIf(numero -> numero % 2 != 0 );
        System.out.println(integerList);

        System.out.println("Ignorar os 3 primeiros e imprimir o restante");
        System.out.println("Retirar os números repetidos e exibir quantos ficaram");
        System.out.println("Mostre o menor valor da lista");
        System.out.println("Mostre o maior valor da lista");
        System.out.println("Pegar apenas os números impares e somar");
        System.out.println("Mostre a lista na ordem numérica");
        System.out.println("Agrupar os valores impares múltiplos de 3 e de 5"); // dica: collect(Collectors.groupingBy(new Function())
    }
}
