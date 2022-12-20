package OO.polimorfismo;

public abstract class TipoDeComida {

    private double peso;

    public TipoDeComida(){

    }
    public TipoDeComida(double peso) {
        setPeso(peso);
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
