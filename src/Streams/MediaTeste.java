package Streams;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media().adicionar(9.3).adicionar(5.7);
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);


        System.out.println(m1.getValor());
        System.out.println(m2.getValor());


        System.out.println(Media.combinar(m1,m2).getValor());

    }



}
