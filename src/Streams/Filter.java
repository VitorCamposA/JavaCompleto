package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Vitor", 8.3);
        Aluno a2 = new Aluno("Edu", 5);
        Aluno a3 = new Aluno("Gui", 4.9);
        Aluno a4 = new Aluno("Ana", 9);
        Aluno a5 = new Aluno("Laura", 8.4);
        Aluno a6 = new Aluno("Henri", 6.2);

        List<Aluno> alunos = Arrays
                .asList(a1,a2,a3,a4,a5,a6);

        alunos.stream().filter(a -> a.nota >= 7)
                .map((a -> "Parabens " + a.nome + " voce foi aprovado!!!"))
                .forEach(Utilitarios.println);


    }
}
