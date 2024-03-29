package me.rto.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetExerc {
    public void setExerc() {
        List<Integer> listNumeros = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println("\nList");

        numeros.forEach(numero -> {
            System.out.println(">> Numero: " + numero);
        });

        // Adiciona 5 números e lista e exibe itens da lista
        System.out.println("\nHashSet");

        HashSet<Integer> hashSetNumeros = new HashSet<>();
        hashSetNumeros.addAll(numeros);
        listNumeros.addAll(hashSetNumeros);
        listaNumeros(listNumeros);
        listNumeros.clear();

        // Remove o primeiro item
        System.out.println("Remove o prieiro item");

        hashSetNumeros.remove(3);
        listNumeros.addAll(hashSetNumeros);
        listaNumeros(listNumeros);

        System.out.println("Remove o prieiro item");

        System.out.println("Remove o prieiro item");

    }

    private void listaNumeros(List<Integer> numeros) {
        numeros.forEach(numero -> {
            System.out.println(">> Numero: " + numero);
        });
    }
}
