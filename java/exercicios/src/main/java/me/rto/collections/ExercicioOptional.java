package me.rto.collections;

import java.util.Optional;

public class ExercicioOptional {
    public void exercicioOptional() {
        // Crie com estado vazio, presente, e com null
        System.out.println(">> Opcional presente");
        Optional<String> optionalString = Optional.of("Testando Optional");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        System.out.println(">> Opcional vazio");
        Optional<String> optionalVazio = Optional.empty();
        optionalVazio.orElseThrow(IllegalThreadStateException::new);

        // Se presente, exiba o valor no console

        // Se vazio, lance uma excessão IlegalStateException

        // Se vazio, exiba "Optional vazio" no console

        // Se presente, tranforme o valor e exiba no console

        // Se presente, pegue o valor do optional e atribua em uma váriável

        // Se presente, filtre o optional com uma determinada regra de negócio


    }

}
