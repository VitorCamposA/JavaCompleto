package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> isTresNum =
                num -> num>= 100 && num<= 999;
        System.out.println(isPar.and(isTresNum).test(104));
        System.out.println(isPar.and(isTresNum).negate().test(104));
    }
}
