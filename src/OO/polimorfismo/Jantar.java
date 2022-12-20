package OO.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(70);
        PratoDeJantar pratoDeJantar= new PratoDeJantar(0.3,0.4,0.2);

        System.out.println(convidado.getPeso());

        convidado.comer(pratoDeJantar);

        System.out.println(convidado.getPeso());

    }
}
