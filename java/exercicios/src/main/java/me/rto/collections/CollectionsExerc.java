package me.rto.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExerc {
    public void collections() {
        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        // Listar os nomes
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        listaNomes("Adicionar 5 nomes", nomes);

        // Substitua o nome Carlos por Roberto
        String[] nomesSubstituir = {"Carlos", "Roberto"};
        nomes = substituiNome(nomesSubstituir, nomes);
        listaNomes("Substitua o nome Carlos por Roberto", nomes);

        // Retorne o nome da posição 1
        System.out.println(">> Retorne o nome da posição 1");
        System.out.println("    Nome: " + nomes.get(1));

        // Remova o nome da posição 4
        nomes.remove(3);
        listaNomes("Remova o nome da posição 4", nomes);

        // Remova o nome João
        nomes.remove("João");
        listaNomes("Remova o nome João", nomes);

        // Retorne a quantidade de itens da lista
        System.out.println(">> Retorne a quantidade de itens da lista");
        System.out.println("    Quantidade de itens: " + nomes.size());

        // Verifique se o nome Juliana existe na lista
        System.out.println(">> Verifique se o nome Juliana existe na lista");
        String nome = "Juliana";
        nomes.contains(nome);

        System.out.println(verificaNomeExiste(nome, nomes));

        // Crie uma lista nova com os nomes: Ismael e Rodrigo
        // Adicione os itens da lista nova na lista antiga
        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        listaNomes("Crie uma lista nova com os nomes: Ismael e Rodrigo", novaLista);
        nomes.addAll(novaLista);
        novaLista.clear();

        listaNomes("Adicione os itens da lista nova na lista antiga", nomes);

        // Ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        listaNomes("Ordene os itens da lista por ordem alfabética", nomes);

        // Verifique se as listas estão vazias
        System.out.println(">> Verifique se as listas estão vazias");
        System.out.println(verificaListaVazia("nomes", nomes));
        System.out.println(verificaListaVazia("novaLista", novaLista));
    }

    private void listaNomes(String atividade, List<String> listaNomes) {
        System.out.println(">> " + atividade);
        listaNomes.forEach(nome -> {
            System.out.println("    Nome: " + nome);
        });
    }

    private List<String> substituiNome(String[] nomeSubstituir, List<String> nomes) {
        int index = nomes.indexOf(nomeSubstituir[0]);
        nomes.set(index, nomeSubstituir[1]);

        return nomes;
    }

    private String verificaNomeExiste(String nome, List<String> nomes) {
        boolean existe = nomes.contains(nome);
        String mensagem = existe
                ? "O nome " + nome + " existe na lista."
                : "O nome " + nome + " NÃO existe na lista.";

        return mensagem;
    }

    private String verificaListaVazia(String nome, List<String> lista) {
        boolean vazia = lista.isEmpty();
        String mensagem = vazia
                ? "A lista " + nome + " está vazia!"
                : "A lista " + nome + " NÃO está vazia!";

        return mensagem;
    }
}
