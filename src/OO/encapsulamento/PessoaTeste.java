package OO.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(30,"Vitor");
        p1.setIdade(-30);

        System.out.println(p1.getIdade());
    }
}
