package OO.composicao;

public class Motor {

    boolean onOff = false;
    double fatorInjecao = 1;

    int giros() {
        if (onOff == false) {
            return 0;
        } else {
            return (int)Math.round(fatorInjecao * 3000);
        }

    }
}
