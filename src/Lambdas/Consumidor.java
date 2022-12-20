package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto product1 = new Produto("Caneta", 10.0, 0.10);

        imprimir.accept(product1);
        Produto p2 = new Produto("Cano", 10.0, 0.10);
        Produto p3 = new Produto("Caderno", 10.0, 0.10);
        Produto p4 = new Produto("Borracha", 10.0, 0.10);
        Produto p5 = new Produto("Lapis", 10.0, 0.10);
        Produto p6 = new Produto("Lapiseira", 10.0, 0.10);

        List<Produto> produtos = Arrays .asList(p2, p3, p4, p5, p6);

        produtos.forEach(imprimir);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}

