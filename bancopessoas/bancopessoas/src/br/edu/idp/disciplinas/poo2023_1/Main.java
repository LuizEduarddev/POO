package br.edu.idp.disciplinas.poo2023_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws SQLException {

        // 1. Habilitar o driver JDBC a partir da aplicação cliente;
        //      ok

        // 2. Estabelecer uma conexão entre a aplicação cliente e servidor do banco de dados;
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";
        Connection conexao = DriverManager.getConnection(paramsConexao, usuario, senha);

        // 3. Montar e executar a consulta SQL desejada;
        String criacaoSql = "create table pessoa (id int primary key, nome varchar(150), qtdAcesso int, naturalidade varchar(75) )";
        Statement stmtC = conexao.createStatement();
        stmtC.executeUpdate(criacaoSql);
        stmtC.close();

        String insereSql = "insert into pessoa (id, nome, qtdAcesso, naturalidade) values (1, 'Luiz Eduardo', 22, 'Patriota'), (2, 'Rafael', 22, 'Patriota'), (3 ,'Amanda', 13, 'Petista')";
        Statement stm = conexao.createStatement();

        stm.executeUpdate(insereSql);
        stm.close();

        String consulta = "select * from pessoa";
        //consulta = "select nome as nome_completo, naturalidade from pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(consulta);

        // 4. Processar no cliente o resultado da consulta.
        while (resultado.next()) {
            String nome = resultado.getString("nome");
            Integer quantidade = resultado.getInt("qtdAcesso");
            String naturalidade = resultado.getString("naturalidade");

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setQuantidadeAcesso(quantidade);
            pessoa.setNaturalidade(naturalidade);

            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Quantidade de acessos: %d\n", quantidade);
            System.out.printf("Naturalidade: %s\n", naturalidade);
        }

        System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }

}
