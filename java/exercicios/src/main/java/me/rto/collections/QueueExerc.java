package me.rto.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExerc {
    public void queue() {
        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        // Listar os nomes
        Queue<String> nomes = new ArrayDeque<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        listaNomes("Adicionar 5 nomes", nomes);

        // Retorne o primeiro item da fila, sem remove-lo
        System.out.println(">> Retorne o primeiro item da fila, sem remove-lo");
        System.out.println("    Primeiro: " + nomes.peek());

        // Retorne o primeiro item da fila, removendo
        String nomeRemover = nomes.peek();
        nomes.poll();
        listaNomes("Retorne o primeiro item da fila, removendo", nomes);
        System.out.println("    Removido --> " + nomeRemover);

        // Adicione un novo nome: Daniel.
        // Verificar a posição
        nomes.add("Daniel");
        listaNomes("Adicione un novo nome: Daniel.", nomes);

        // Retorne o tamanho da lista
        System.out.println(">> Retorne o tamanho da lista");
        System.out.println("    Existem " + nomes.size() + " elementos na fila.");

        // Verifique se a lista está vazia
        System.out.println(">> Verifique se a lista está vazia");
        boolean vazia = nomes.isEmpty();
        String mensagem = vazia
                ? "    A fila está vazia!!"
                : "    A fila não está vazia!!";

        System.out.println(mensagem);

        // Verifique se o nome Carlos está na lista
        System.out.println(">> Verifique se o nome Carlos está na lista");
        String nome = "Carlos";
        boolean existe = nomes.contains(nome);
        mensagem = existe
                ? ">> O nome " + nome + " existe na fila."
                : ">> O nome " + nome + " existe na fila.";
        System.out.println(mensagem);
    }

    private void listaNomes(String atividade, Queue<String> listaNomes) {
        System.out.println(">> " + atividade);
        listaNomes.forEach(nome -> {
            System.out.println("    Nome: " + nome);
        });
    }
}
