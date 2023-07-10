package JDBC;


import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        Connection conexao = CriarConexao.getConexao();

        Statement stmt = conexao.createStatement();
        stmt.execute("create database if not exists curso_java2");
        System.out.println("banco criado");
        conexao.close();
    }
}

