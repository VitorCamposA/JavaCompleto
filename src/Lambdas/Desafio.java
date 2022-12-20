package Lambdas;



import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad",3235.89, 0.13);

        Function<Produto, Double> precoDesconto =
                pr -> pr.getPreco() * (1 - pr.getDesconto());
        UnaryOperator<Double> imposto =
                pr -> pr >= 2500 ? pr + (pr * 0.085) : pr;
        UnaryOperator<Double> frete =
                pr -> pr >= 3000 ? pr + 100 : pr + 50 ;
        UnaryOperator<Double> arrendondar =
                pr -> Double.parseDouble(String.format("%.2f",pr).replace(",", "."));
        Function<Double,String > formatar =
                pr -> ("O valor é R$" + pr).replace(".", ",");

        System.out.println(precoDesconto
                .andThen(imposto)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(p));


    }
}
