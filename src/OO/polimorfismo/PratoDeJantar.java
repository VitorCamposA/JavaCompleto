package OO.polimorfismo;

public class PratoDeJantar extends TipoDeComida {

    private Arroz arroz = new Arroz();
    private Feijao feijao = new Feijao();
    private Sorvete sorvete = new Sorvete();

    public PratoDeJantar(){

    }
    public PratoDeJantar(double arroz, double feijao, double sorvete){
        this.arroz.setPeso(arroz);
        this.feijao.setPeso(feijao);
        this.sorvete.setPeso(sorvete);
        setPeso(this.arroz.getPeso() + this.feijao.getPeso() + this.sorvete.getPeso());

    }

    public Sorvete getSorvetePeso() {
        return sorvete;
    }

    public void setSorvetePeso(double sorvete) {
        this.sorvete.setPeso(sorvete);
    }

    public Feijao getFeijaoPeso() {
        return feijao;
    }

    public void setFeijaoPeso(double feijao) {
        this.feijao.setPeso(feijao);
    }

    public Arroz getArrozPeso() {
        return arroz;
    }

    public void setArrozPeso(double arroz) {
        this.arroz.setPeso(arroz);
    }
}
