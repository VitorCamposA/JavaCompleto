package Streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {
        Candidato c1 = new Candidato("Vitor", true, 7);
        Candidato c2 = new Candidato("Ana", true, 4);
        Candidato c3 = new Candidato("Gui", false, 3);
        Candidato c4 = new Candidato("Henri", false, 10);
        Candidato c5 = new Candidato("Art", true, 2);

        List<Candidato> candidatos = Arrays
                .asList(c1,c2,c3,c4,c5);

        candidatos.stream().filter(c -> c.boaIndi)
                .filter(c -> c.anoExp >= 3)
                .map(c -> "Parabens " + c.nome + "!! Sua entrevista foi aprovada!")
                .forEach(Utilitarios.println);

    }
}
