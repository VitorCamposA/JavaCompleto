package Generics;

public class CaixaNumTeste {
    public static void main(String[] args) {
        CaixaNum<Double> caixaA = new CaixaNum();
        caixaA.setCoisa(2.2);
        System.out.println(caixaA.getCoisa());

        CaixaNum<Integer> caixaB = new CaixaNum();
        caixaB.setCoisa(2);
        System.out.println(caixaB.getCoisa());


    }
}
