package VontadeDeFazerAlgo;

public class CarroBase {

    int freio;
    int velocidadeKm,capacidadeMax;
    boolean ligado, acelerar, freiar;
    int dano;

    CarroBase(){
      freio = -5;
      velocidadeKm= 0;
      ligado = false;
      acelerar = false;
      freiar = false;
      dano = 0;
      capacidadeMax = 0 ;
    }
    CarroBase(boolean ligado, int velocidadeKm){
        freio = -5;
        this.velocidadeKm = velocidadeKm;
        this.ligado = ligado;
        acelerar = false;
        freiar = false;
        dano = 0;
        capacidadeMax = 0 ;
    }
    CarroBase(int freio){
        this.freio = freio;
        velocidadeKm= 0;
        ligado = false;
        acelerar = false;
        freiar = false;
        dano = 0;
        capacidadeMax = 0 ;
    }
    CarroBase(int freio, int capacidadeMax){
        this.freio = freio;
        velocidadeKm= 0;
        ligado = false;
        acelerar = false;
        freiar = false;
        dano = 0;
        this.capacidadeMax = capacidadeMax ;
    }
}
