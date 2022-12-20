package OO.heranca.teste;

import OO.heranca.Heroi;
import OO.heranca.Monstro;

import javax.management.monitor.MonitorSettingException;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi(10,11);


        Monstro j2 = new Monstro();

        j2.x = 10;
        j2.y = 10;

        System.out.println(j1.vida + " " + j2.vida);

        j1.atacar(j2);

        System.out.println(j1.vida + " " + j2.vida );






    }



}
