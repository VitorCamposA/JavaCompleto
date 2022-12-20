package OO.abstrato;

public class Cachorro extends Mamifero{
    @Override
    public String mover() {
        return "Usando as Patas";
    }

    @Override
    public String mamar() {
        return "Usando a boca";
    }
}
