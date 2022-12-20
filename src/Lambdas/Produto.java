package Lambdas;

public class Produto {

    public final String nome;
    public double preco;
   private double desconto;

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;

    }

    public String toString(){
        return "Nome: " + nome + "\nPreco: " + preco + "\n Desconto: " + desconto;


    }

    public double get1(){
        return 1.0;

    }

}
