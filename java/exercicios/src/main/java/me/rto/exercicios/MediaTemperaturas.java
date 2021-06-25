package me.rto.exercicios;

import java.util.ArrayList;
import java.util.List;
// import java.util.Locale;
// import java.util.Scanner;

public class MediaTemperaturas {
    public static void main(String[] args) {
        //System.out.println("Digite uma temperatura: ");
        //Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.ENGLISH);
        List<String> meses = new ArrayList<>();
        List<Double> temperaturas = new ArrayList<>();
        boolean sair = false;
        Double media;

        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        temperaturas.add(35.0);
        temperaturas.add(21.5);
        temperaturas.add(25.5);
        temperaturas.add(23.0);
        temperaturas.add(22.5);
        temperaturas.add(35.0);
/*
        while (!sair) {
            Double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            if (temperaturas.size() == meses.size()){
                sair = true;
            }
        }
*/
        System.out.println("------------------------------------------------\n");

        exibeTemperaturas("Temperaturas: ", meses, temperaturas);

        System.out.println("------------------------------------------------\n");

        media = calculaMedia(temperaturas);
        System.out.println(String.format("Média das temperaturas: %.2f", media));

        System.out.println("------------------------------------------------\n");

        exibeTemperaturasAcimaMedia(temperaturas, meses, media);
    }

    private static void exibeTemperaturas(String mensagem, List<String> meses, List<Double> temperaturas) {
        System.out.println(mensagem);
        for (int i = 0; i < meses.size(); i++) {
            System.out.println("Mês: " + meses.get(i) + " | Temperatura: " + temperaturas.get(i));

        }
    }

    private static Double calculaMedia(List<Double> temperaturas) {
        Double soma = 0d;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }

        return soma / temperaturas.size();
    }

    private static void exibeTemperaturasAcimaMedia(List<Double> temperaturas, List<String> meses, Double media) {
        List<Double> acima = new ArrayList<>();
        List<String> mesesAcima = new ArrayList<>();

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                acima.add(temperaturas.get(i));
                mesesAcima.add(meses.get(i));
            }
        }



        if (acima.isEmpty()) {
            exibeTemperaturas("Temperaturas acima da média", mesesAcima, acima);
        } else {
            System.out.println("Nenhuma temperatura excedeu a média");
        }

    }
}
