package OO.heranca;

 public class Jogador {
    public double vida = 100;
    public int x;
    public int y;

    protected Jogador (int x, int y){
        this.x = x;
        this.y = x;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if (deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 1 ){
            oponente.vida -= 10;
            return true;
        }
        return false;
    }
    public boolean anda(Direcao direcao){

        if (direcao == Direcao.Norte){
            y++;
        }
        if (direcao == Direcao.Sul){
            y--;
        }
        if (direcao == Direcao.Leste){
            x++;
        }
        if (direcao == Direcao.Oeste){
            x--;
        }
        return true;
    }
}
