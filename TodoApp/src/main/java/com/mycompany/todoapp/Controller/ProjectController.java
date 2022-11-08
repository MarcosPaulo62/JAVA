package com.mycompany.todoapp.Controller;

import com.mycompany.todoapp.Model.Project;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;

public class ProjectController {
    public void save(Project project) {
        // Query que será usada para inserir o projeto no bd
        String sql = "INSERT INTO projects (name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Criando conexão com o banco
            connection = ConnectionFactory.getConnection();
        
            // Criando PreparedStatement, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            
            // Setando os valores do objeto passado como parâmetro para a query
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            
            // Executando a query sql para inserção dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto ", ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }             
    }
    
    public void update(Project project) {
        
        String sql = "UPDATE projects SET"
                + " name = ?,"
                + " description = ?,"
                + " createdAt = ?,"
                + " updatedAt = ?"
                + " WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Estabelecendo conexão com o bd
            connection = ConnectionFactory.getConnection(); 
            
            // Preparando a query
            statement = connection.prepareStatement(sql);
            
            // Setando os valores do statement
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            
            // Executando a query
            statement.execute();
        } catch(SQLException ex){
            throw new RuntimeException("Erro ao atualizar o projeto ", ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        } 
    }
    
    public void removeByID(int id){
        
        String sql = "DELETE FROM projects WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            // Criação da conexão com o bd
            connection = ConnectionFactory.getConnection();
            
            // Preparando a query
            statement = connection.prepareStatement(sql);
            
            // Setando os valores do statement
            statement.setInt(1, id);
            
            // Executando a query
            statement.execute();
        } catch(Exception ex){
            throw new RuntimeException("Erro ao deletar o projeto", ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }        
    }
       
    public List<Project> getAll(){
        String sql = "SELECT * FROM projects";
        
        Connection connection = null; // Variável de conexão com o bd
        PreparedStatement statement = null; // Variável de statement (comando sql)
        ResultSet resultSet = null; // Variável que recebe a resposta da query (SELECT)
        
        // Lista de projetos que será retornada pela função
        List<Project> projects = new ArrayList<Project>();
        
        try {
            // Inicia conexão com bd
            connection = ConnectionFactory.getConnection(); 
            
            // Cria o statement e passa o comando sql
            statement = connection.prepareStatement(sql); 
            
            // Executa o statement e passa a resposta para o resultSet
            resultSet = statement.executeQuery(); 
            
            // Percorrendo os projetos da resposta da query (resultSet)
            while(resultSet.next()){ 
                // Criando um projeto
                Project project = new Project();
                
                // Passando os valores do projeto que veio do bd para o projeto criado
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                // Adicioanndo projeto à lista
                projects.add(project);
            }
        } catch(SQLException ex){
            throw new RuntimeException("Erro ao buscar os projetos", ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }   
        // Lista de projetos carregados do BD
        return projects;
    }
}
