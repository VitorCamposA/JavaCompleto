package excecao;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString(){
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(aluno.nota, nota) != 0) return false;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome != null ? nome.hashCode() : 0;
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
