package OO.composicao.desafio;

public class Item {

    Produto produto = new Produto();

    Item (int quantidade,double preco, String nome ){
        this.quantidade = quantidade;
        this.produto.preco = preco;
        this.produto.nome = nome;
    }
    int quantidade;


}
