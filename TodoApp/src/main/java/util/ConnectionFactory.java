package util;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp2";
    public static final String USER = "root";
    public static final String PASS = "";
    
    // Inicia conexão com o bd
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex){
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
    
    // Finaliza conexão com o bd
    public static void closeConnection(Connection connection){
        try{
            if (connection != null){
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao ferchar a conexão com o banco de dados", ex);
        }
    }
    
    // Finaliza conexão com o bd e finaliza statement (comando sql)
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try{
            if (connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao ferchar a conexão com o banco de dados", ex);
        }
    }
    
    // Finaliza conexão com o bd, finaliza statement (comando sql) e finaliza o ResultSet
    public static void closeConnection(Connection connection, 
            PreparedStatement statement, ResultSet resultSet){
        try{
            if (connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
            
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao ferchar a conexão com o banco de dados", ex);
        }
    }
}
