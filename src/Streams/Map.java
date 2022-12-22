package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String > print = System.out::print;
        List<String> marcas = Arrays.asList("Bmw ", "Audi ","Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);


        System.out.println("\nUsando Composição");

        marcas.stream().map(Utilitarios.maisucula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);


    }
}
