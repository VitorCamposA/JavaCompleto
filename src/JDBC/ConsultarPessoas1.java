package JDBC;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = CriarConexao.getConexao();
        String sql = "select * from pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()){
            pessoas.add
            (new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
        }
        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + ">>>" + p.getNome());
        }
        stmt.close();
        conexao.close();
    }
}
