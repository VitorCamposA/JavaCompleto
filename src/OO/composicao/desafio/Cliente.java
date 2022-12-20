package OO.composicao.desafio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Cliente { //metodo q retorna o valor gastado em tal loja ou ao total

    String nomeC;

    Cliente(String nomeC){
        this.nomeC = nomeC;
    }

    List<Compra> compras = new ArrayList<>();

    double getTotalTotalValue() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getTotalValue();
        }
        return total;

    }
    void addCompra(Compra compra){
        compras.add(compra);
    }

}
