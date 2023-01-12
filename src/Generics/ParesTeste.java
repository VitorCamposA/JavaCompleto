package Generics;

import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;
public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String > resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Vitor");
        resultadoConcurso.adicionar(4, "Joao");
        resultadoConcurso.adicionar(3, "Edu");
        resultadoConcurso.adicionar(2, "Leo");
        resultadoConcurso.adicionar(5, "Fer");
        resultadoConcurso.adicionar(3, "Alex");

        System.out.println(resultadoConcurso.getValue(1));
        System.out.println(resultadoConcurso.getValue(4));
        System.out.println(resultadoConcurso.getValue(3));
    }
}
