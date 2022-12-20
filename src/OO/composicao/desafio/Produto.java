package OO.composicao.desafio;

import lombok.Data;

@Data
public class Produto {

    String nome;
    double preco;

    Produto() {

    }


    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


}
