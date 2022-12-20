package classe;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data primeiraData = new Data();

        System.out.print("Digite a o dia:");
        primeiraData.dia = sc.nextInt();

        System.out.print("Digite a o mes:");
        primeiraData.mes = sc.next();

        System.out.print("Digite a o ano:");
        primeiraData.ano = sc.nextInt();


        Data segundaData = new Data();

        System.out.print("Digite a o dia:");
        segundaData.dia = sc.nextInt();

        System.out.print("Digite a o mes:");
        segundaData.mes = sc.next();

        System.out.print("Digite a o ano:");
        segundaData.ano = sc.nextInt();


        System.out.printf(" %d,  %s,  %d%n",primeiraData.dia, primeiraData.mes, primeiraData.ano);
        System.out.printf(" %d,  %s,  %d%n",segundaData.dia, segundaData.mes, segundaData.ano);
        sc.close();
    }

}
