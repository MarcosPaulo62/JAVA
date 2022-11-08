package main;

import com.mycompany.todoapp.Controller.ProjectController;
import com.mycompany.todoapp.Controller.TaskController;
import com.mycompany.todoapp.Model.Project;
import com.mycompany.todoapp.Model.Task;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        task.setIdProject(3);
        task.setName("Tarefa do projeto 3");
        task.setDescription("descrição detalhada");
        task.setIsCompleted(true);
        task.setNotes("notas bla");
        task.setDeadline(new Date());
        
        taskController.save(task);
        
    }
    
}
