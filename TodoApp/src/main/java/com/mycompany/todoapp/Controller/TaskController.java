package com.mycompany.todoapp.Controller;

import com.mycompany.todoapp.Model.Task;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;


public class TaskController {
    
    public void save(Task task) {
        String sql = "INSERT INTO tasks (idProject,"
                + " name,"
                + " description,"
                + " completed,"
                + " notes,"
                + " deadline,"
                + " createdAt,"
                + " updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " +
                    ex.getMessage(), ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }         
    }
    
    public void update(Task task) {
        
        String sql = "UPDATE tasks SET"
                + " idProject = ?,"
                + " name = ?,"
                + " description = ?,"
                + " notes = ?,"
                + " completed = ?,"
                + " deadline = ?,"
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
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            
            // Executando a query
            statement.execute();
        } catch(Exception ex){
            throw new RuntimeException("Erro ao atualizar a tarefa " + 
                    ex.getMessage(), ex);
        }
    }
    
    public void removeByID(int taskId){
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            // Criação da conexão com o bd
            connection = ConnectionFactory.getConnection();
            
            // Preparando a query
            statement = connection.prepareStatement(sql);
            
            // Setando os valores do statement
            statement.setInt(1, taskId);
            
            // Executando a query
            statement.execute();
        } catch(Exception ex){
            throw new RuntimeException("Erro ao deletar a tarefa" + 
                    ex.getMessage(), ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }        
    }
       
    public List<Task> getAll(int idProject){
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection connection = null; // Variável de conexão com o bd
        PreparedStatement statement = null; // Variável de statement (comando sql)
        ResultSet resultSet = null; // Variável que recebe a resposta da query (SELECT)
        
        // Lista de tarefas que será retornada pela função
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            connection = ConnectionFactory.getConnection(); // Inicia conexão com bd
            statement = connection.prepareStatement(sql); // Cria o statement e passa o comando sql
            statement.setInt(1, idProject); // Passa o parâmetro (idProject) para o comando sql
            resultSet = statement.executeQuery(); // Executa o statement e passa a resposta para o resultSet
            
            while(resultSet.next()){ // Percorrendo as tasks da resposta da query (resultSet)
                // Criando uma task
                Task task = new Task();
                
                // Passando os valores da task que veio do bd para a task criada
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));                
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                // Adicioanndo task à lista
                tasks.add(task);
            }
        } catch(Exception ex){
            throw new RuntimeException("Erro ao inserir a tarefa" + 
                    ex.getMessage(), ex);
        } finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }   
        // Lista de tarefas carregadas do BD
        return tasks;
    }
}
