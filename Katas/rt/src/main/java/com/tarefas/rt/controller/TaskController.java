package com.tarefas.rt.controller;

import com.tarefas.rt.dto.TaskDTO;
import com.tarefas.rt.model.Task;
import com.tarefas.rt.repository.TaskRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@Slf4j
public class TaskController {

    @Autowired
    TaskRepository repository;

    @PostMapping
    public Task createANewTask(@RequestBody TaskDTO task){
        Task tasks = new Task();
        tasks.setName(task.getName());
        return repository.save(tasks);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateTaskById(@PathVariable("id") Long id, @RequestBody TaskDTO task){
        Task taskById = getTaskById(id);
        taskById.setName(task.getName());
        repository.save(taskById);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
