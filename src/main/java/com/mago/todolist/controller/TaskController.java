package com.mago.todolist.controller;

import com.mago.todolist.model.Task;
import com.mago.todolist.service.TaskService;
import org.apache.coyote.Response;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    // GET
    @GetMapping
    public List<Task> findAll() {
        return taskService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id) {
        Optional<Task> task = taskService.findById(id);
        return task
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    // POST
    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody Task taskDetails, @PathVariable Long id) {
        return taskService.updateTask(taskDetails, id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
