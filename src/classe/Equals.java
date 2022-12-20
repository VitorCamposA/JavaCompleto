package classe;

public class Equals {
    public static void main(String[] args) {
        EqualsUsuario u1 = new EqualsUsuario();
        u1.nome = "Vitor Gabriel";
        u1.eMail = "vcampos@gmail.com";

        EqualsUsuario u2 = new EqualsUsuario();
        u2.nome = "Vitor Gabriel";
        u2.eMail = "vcampos@gmail.com";

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
