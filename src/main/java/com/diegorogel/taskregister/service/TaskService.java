package com.diegorogel.taskregister.service;

import com.diegorogel.taskregister.mapper.TaskMapper;
import com.diegorogel.taskregister.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskMapper taskMapper;

    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public List<Task> getAllTasks() {
        return taskMapper.findAll();
    }

    public void saveTask(Task task) {
        taskMapper.insertTask(task);
    }

    public void deleteTask(int id) {
        System.out.println("Deleting task: " + id);
        taskMapper.deleteTask(id);
    }
}
