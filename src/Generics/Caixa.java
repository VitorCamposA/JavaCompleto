package Generics;

public class Caixa<S> {

    private S coisa;

    public Object getCoisa() {
        return coisa;
    }

    public void setCoisa(S coisa) {
        this.coisa = coisa;
    }
}
