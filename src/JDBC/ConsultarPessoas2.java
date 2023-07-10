package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = CriarConexao.getConexao();
        String sql = "select * from  where nome like ?";
        String valor = "nome";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%" + valor + "%");
        ResultSet resultado = stmt.executeQuery();

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

