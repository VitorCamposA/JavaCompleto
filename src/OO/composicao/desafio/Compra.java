package OO.composicao.desafio;


import lombok.Data;

import java.util.ArrayList;

@Data
public class Compra {

    String loja;
    ArrayList<Item> itens = new ArrayList<>();

    void addItem(Item iten){
        itens.add(iten);
    }

    double getTotalValue(){
        double total = 0;
        for (Item item :itens) {
            total += item.quantidade * item.produto.preco;
        }


        return total;
    }

    Compra(String loja){
        this.loja = loja;
    }

    public String toString(){
        return this.loja;
    }




}
