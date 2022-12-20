package OO.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {


    public Ferrari(){
        super(10);
    }
    @Override
    public boolean acelerar() {
        return super.acelerar();
    }

    @Override
    public void ligarTurbo() {
        this.forca = 12;

    }

    @Override
    public void desligarTurbo() {
        this.forca = 10;

    }
}
