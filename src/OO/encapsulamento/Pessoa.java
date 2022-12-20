package OO.encapsulamento;



public class Pessoa {


    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa (int idade, String nome){
        setIdade(idade);
        setNome(nome);
    }
    public Pessoa (){

    }
    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }

    }
}
