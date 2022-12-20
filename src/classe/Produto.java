package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    void problema() {
        System.out.println(nome);

    }
    static int paco(int a, int b){
        a += b;
        return a;

    }
    Produto(){
        nome = "...";
        preco = 0.0;
        desconto = 0.0;
    }
    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

}
