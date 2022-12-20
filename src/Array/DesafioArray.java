package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao cadastro de notas do usuario!");
        System.out.println("Quantas notas serao cadastradas?");
        int a = sc.nextInt();

        double[] notas = new double[a];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite sua " + (i + 1) + " nota");
            notas[i] = sc.nextDouble();
        }
        double soma = 0;
        for (double nota :notas) {
            soma += nota;
        }

        System.out.println("A média do aluno e " + soma / notas.length);
        System.out.println("As notas do aluno sao: " + Arrays.toString(notas));


        sc.close();
    }
}
