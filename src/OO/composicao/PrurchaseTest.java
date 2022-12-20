package OO.composicao;

import java.awt.*;

public class PrurchaseTest {

    public static void main(String[] args) {
        Purchase compra1 = new Purchase();

        compra1.cliente = "Vitor";
        compra1.addi(new Item("Caneta", 25, 1.15));
        compra1.addi(new Item("Borracha", 3, 3.45));
        compra1.addi(new Item("Caderno", 9, 15.79));

        System.out.println(compra1.itens.size());
        System.out.printf("O valor da sua compra é: %.2f%n",compra1.getTotalValue());
        System.out.println("Voce esta comprando " +compra1.getTotalItens() + " itens");



    }
}
