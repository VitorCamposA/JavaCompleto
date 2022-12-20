package OO.composicao.desafio;

import lombok.Data;

@Data
public class CompraTeste {

    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Vitor");

        cliente1.addCompra(new Compra("Farmacia"));
        cliente1.addCompra(new Compra("Restaurante"));


        for (Compra compra : cliente1.compras) {

            if(compra.loja.equalsIgnoreCase("Farmacia")) {
                compra.addItem(new Item(10, 12.75,"Neosaldina"));
                compra.addItem(new Item(3, 120.10,"Respirador"));
            }
            if (compra.loja.equalsIgnoreCase("restaurante"));{
                compra.addItem(new Item(3, 28.12,"Frango Frito"));
                compra.addItem(new Item(2, 20.5,"Panela de Arroz"));
            }
        }

        System.out.println(cliente1.getTotalTotalValue());
        for (Compra compra: cliente1.compras) {
            System.out.println(compra);
            System.out.println(compra.getTotalValue());

        }
    }
}
