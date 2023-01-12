package Generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.setCoisa(2.3);

        Double coisa = (Double) caixaA.getCoisa();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.setCoisa("ola");

        String coisa2 = (String) caixaA.getCoisa();
        System.out.println(coisa2);

    }
}
