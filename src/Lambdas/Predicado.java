package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1 - prod.getDesconto()))>= 750.0;

        Produto produto = new Produto("Notebook", 3200.0, 0.15);

        System.out.println(isCaro.test(produto));
    }
}
