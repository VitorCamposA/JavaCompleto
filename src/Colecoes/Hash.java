package Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();


        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Vitor"));
        usuarios.add(new Usuario("Joao"));
        usuarios.add(new Usuario("Eduardo"));

        boolean resultado = usuarios.contains("Vitor");

        System.out.println(resultado);


    }
}