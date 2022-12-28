package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Gabi", 10);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Luna", 3.1);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Maria", 10);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Pedro", 3.1);

        List<Aluno> alunos = Arrays
                .asList(a1, a2, a3, a4, a5, a6, a7, a8);


        System.out.println("Distinct...");

        alunos.stream().distinct().forEach(Utilitarios.println);

        System.out.println("\nSkip/Limit");

        alunos.stream().distinct()
                .skip(2)
                .limit(2)
                .forEach(Utilitarios.println);

        System.out.println("\nTake While");

        alunos.stream().distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(Utilitarios.println);





    }
}
