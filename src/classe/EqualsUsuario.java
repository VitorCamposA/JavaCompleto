package classe;

public class EqualsUsuario {
    String nome;
    String eMail;


    public boolean equals(Object objeto) {

           if(objeto instanceof EqualsUsuario) { //testa se oque foi recebido é uma classe do tipo Usuario
               EqualsUsuario outro = (EqualsUsuario) objeto;

               boolean nomeIgual = outro.nome.equals(this.nome);
               boolean eMailIgual = outro.eMail.equals(this.eMail);

               return nomeIgual && eMailIgual;
           } else {
               return false;

           }


    }
}
