package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class novaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o nome:");
        String nome = sc.nextLine();


        Connection conexao = CriarConexao.getConexao();


        String sql = "insert into pessoas (nome) values (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();


        conexao.close();
        sc.close();


    }
}
