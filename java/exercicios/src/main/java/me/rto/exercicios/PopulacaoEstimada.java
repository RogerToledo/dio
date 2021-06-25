package me.rto.exercicios;

import javax.swing.text.html.HTMLDocument;
import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.*;

public class PopulacaoEstimada {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        Map<String, Integer> estadoPopulacao = new HashMap<>();
        estadoPopulacao.put("PE", 9616621);
        estadoPopulacao.put("AL", 3351543);
        estadoPopulacao.put("CE", 9187103);
        estadoPopulacao.put("RN", 3534265);
        exibeDicionaro(estadoPopulacao);

        System.out.println("\nSubstitua a população do estado RN por 3.534.165");
        estadoPopulacao.put("RN", 3534165);
        System.out.println(estadoPopulacao.toString());

        System.out.println("\nVericar se o estado PB existe no dicionário, se não, incluir");
        String estado = "PB";
        if (!estadoPopulacao.containsKey(estado)) {
            estadoPopulacao.put(estado, 4039277);
            exibeDicionaro(estadoPopulacao);
        } else {
            System.out.println(String.format("O estado %s já existe!", estado));
        }

        System.out.println("\nExibir estados nas ordem de inserção");
        Map<String, Integer> estadosOrdemInclusao = new LinkedHashMap<>();
        estadosOrdemInclusao.put("PE", 9616621);
        estadosOrdemInclusao.put("AL", 3351543);
        estadosOrdemInclusao.put("CE", 9187103);
        estadosOrdemInclusao.put("RN", 3534265);
        estadosOrdemInclusao.put("PB", 4039277);
        exibeDicionaro(estadosOrdemInclusao);

        System.out.println("\nExibir estados em ordem alfabetica");
        Map<String, Integer> estadosOrdemAlfabetica = new TreeMap<>(estadoPopulacao);
        exibeDicionaro(estadosOrdemAlfabetica);

        System.out.println("\nExibir o estado com a menor população, exibir chave e valor");
        int menorPopulacao = Collections.min(estadosOrdemAlfabetica.values());
        Set<Map.Entry<String, Integer>> entries = estadosOrdemAlfabetica.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                System.out.println("O Estado " + entry.getKey() + " tem a Menor população --> " + numberFormat.format(menorPopulacao));
            }
        }


        System.out.println("\nExibir o estado com a maior população, exibir chave e valor");
        int maiorPopulacao = Collections.max(estadosOrdemAlfabetica.values());
        Set<Map.Entry<String, Integer>> entriesMaior = estadosOrdemAlfabetica.entrySet();
        for (Map.Entry<String, Integer> entry : entriesMaior) {
            if (entry.getValue().equals(maiorPopulacao)){
                System.out.println("O Estado " + entry.getKey() + " tem a Maior população --> " + numberFormat.format(maiorPopulacao));
            }
        }

        System.out.println("\nExibir a soma das populações");
        int soma = 0;
        Set<Map.Entry<String, Integer>> entriesSoma = estadosOrdemAlfabetica.entrySet();
        for (Map.Entry<String, Integer> entry : entriesSoma) {
            soma += entry.getValue();
        }
        System.out.println("A Soma da papulação dos Estados é: " + numberFormat.format(soma));

        System.out.println("\nExibir média da população");
        int media = soma / estadosOrdemAlfabetica.size();
        System.out.println("A média da população é " + numberFormat.format(media));

        System.out.println("\nRemova os estados com a população menor que 4.000.000");
        Iterator<Map.Entry<String, Integer>> iterator = estadosOrdemAlfabetica.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 4000000) {
                iterator.remove();
            }
        }
        exibeDicionaro(estadosOrdemAlfabetica);

        System.out.println("\nApague o dicionário de estado");
        estadosOrdemAlfabetica.clear();
        System.out.println("Apagando...");

        System.out.println("\nVerifica se realmente foi apagado");
        if (estadosOrdemAlfabetica.isEmpty()) {
            System.out.println("Dicionário está vázio!!");
        } else {
            System.out.println("Oops... Ainda existem itens na lista.");
        }

    }

    private static void exibeDicionaro(Map<String, Integer> estados) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println("Estado: " + estado.getKey() + " --> População: " + numberFormat.format(estado.getValue()));
        }
    }
}
