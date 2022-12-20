package OO.composicao;

import java.util.ArrayList;

public class Purchase {


    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addi(Item item){
        itens.add(item);
    }

    double getTotalValue(){
        double total = 0;
        for (Item item :itens) {
            total += item.quantity * item.price;
        }


        return total;
    }

    int getTotalItens(){
        int total = 0;


        for(Item item : itens){
            total += item.quantity;
        }
        return total;
    }




}
