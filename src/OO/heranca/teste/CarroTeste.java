package OO.heranca.teste;

import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Civic car1 = new Civic();
        Ferrari car2 = new Ferrari();

        car2.acelerar();
        car1.aso();

        System.out.println("Ferrari ->" + car2);
        System.out.println("Civic ->" + car1);

        car2.acelerar();
        car1.aso();

        System.out.println("Ferrari ->" + car2);
        System.out.println("Civic ->" + car1);

        car2.acelerar();
        car1.aso();

        System.out.println("Ferrari ->" + car2);
        System.out.println("Civic ->" + car1);

        car2.acelerar();
        car1.aso();

        System.out.println("Ferrari ->" + car2);
        System.out.println("Civic ->" + car1);



    }
}
