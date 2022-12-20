package OO.heranca.desafio;

public class Carro {

    boolean onOff;
    protected  int forca;
    protected int velAtual;
    protected Carro(){
        forca = 5;
    }
    protected Carro (int forca){
        this.forca = forca;
    }
    boolean acelerar(){


        if(velAtual + forca < forca * 32){
            onOff = true;
            this.velAtual += forca;
            return true;
        }
        else{
            return false;
        }



    }
    public boolean frear() {
        if (this.velAtual > 5){
            this.velAtual -= 5;
            return true;
         } else {
            this.velAtual = 0;
            onOff = false;
            return false;
        }

    }



    public String toString() {
        return "Nossa velocidade atual é "+ velAtual + "Km/h.";
    }

}
