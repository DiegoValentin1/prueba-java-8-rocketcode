package com.diegorogel.taskregister.controller;

import com.diegorogel.taskregister.model.Task;
import com.diegorogel.taskregister.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/task/new")
    public String showCreateForm(Model model) {
        model.addAttribute("task", new Task());
        return "create_task";
    }

    @PostMapping("/task/save")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks";
    }
    @PostMapping("/task/delete")
    public String deleteTask(@RequestParam("id") int id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "list_tasks";
    }
}
