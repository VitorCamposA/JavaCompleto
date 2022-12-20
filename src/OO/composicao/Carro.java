package OO.composicao;

public class Carro {

    Motor motor = new Motor();

    void acelerar(){
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.onOff = true;
    }

    void desligar(){
        motor.onOff = false;
    }

    boolean estaLigado() {
        return motor.onOff;
    }
}
