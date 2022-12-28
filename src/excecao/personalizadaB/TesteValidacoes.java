package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", -7);
            Validar.aluno(null);

            Validar.aluno(aluno);
        }catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }
}
