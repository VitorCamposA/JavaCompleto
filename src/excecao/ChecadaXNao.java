package excecao;

import java.security.spec.ECField;

public class ChecadaXNao {

    public static void main(String[] args) {
         try {
            geraErro1();
        } catch (Exception e) {
             System.out.println(e.getMessage());
         }


        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Fim :)");
    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal#01");

    }

    static void geraErro2() throws Exception{
       throw new  Exception("Ocorreu um erro bem legal#02");
    }


}
