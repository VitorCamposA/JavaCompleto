package excecao.personalizadaA;


public class NumeroNegativoException extends Exception{


    private String nomeDoAtributo;
    public NumeroNegativoException (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getmessage(){
        return String.format
                ("O atributo $s está negativo", nomeDoAtributo);
    }
}
