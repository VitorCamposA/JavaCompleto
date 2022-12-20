package classe;

import java.util.Arrays;

public class ProdutoTeste {
    public static void main(String[] args) {

        double[] precos = new double[5];
        for (int i = 0; i < precos.length; i++ ){
            precos[i] = i ;
        }
        System.out.println(Arrays.toString(precos));






        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        p2.problema();
        System.out.println(Produto.paco(1,2));





    }
}
