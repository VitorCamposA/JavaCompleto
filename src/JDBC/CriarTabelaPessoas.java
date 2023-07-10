package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = CriarConexao.getConexao();
        String sql = "create table pessoas ("
                + "codigo int auto_increment primary key not null,"
                + "nome varchar(80) not null"
                +")"


                ;
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("TA OK");
        conexao.close();
    }
}
