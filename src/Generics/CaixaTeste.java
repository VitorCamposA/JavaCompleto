package Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa();
        caixaA.setCoisa("Olá");
        System.out.println(caixaA.getCoisa());

        Caixa<Double> caixaB = new Caixa();
        caixaB.setCoisa(2.2);
        System.out.println(caixaB.getCoisa());
    }
}
