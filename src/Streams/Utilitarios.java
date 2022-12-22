package Streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios(){}

    public final static Function<String ,Integer> binarioParaInt = s -> Integer.parseInt(s,2);

    public final static UnaryOperator <String> inverterTexto = n -> new StringBuilder(n).reverse().toString();
    public final static Consumer<Object > print = System.out::print;
    public final static Consumer<Object > println = System.out::println;
    public final static UnaryOperator<String> maisucula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public final static String grito(String n) {
        return  n + "!!!";
    }

}
