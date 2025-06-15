package com.mago.todolist.service;

import com.mago.todolist.model.Task;
import com.mago.todolist.repository.TaskRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> listAll() {
        return taskRepository.findAll();
    }

    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public Optional<Task> findByName(String taskName) {
        return taskRepository.findByTitle(taskName);
    }

    public Optional<Task> updateTask(@RequestBody Task taskDetails, @PathVariable Long id) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setStatus(taskDetails.getStatus());
            return taskRepository.save(task);
        });

//        Abordagem imperativa
//        Optional<Task> optionalTask = taskRepository.findById(taskDetails.getId());
//
//        if (optionalTask.isPresent()) {
//            Task task = optionalTask.get();
//            task.setTitle(taskDetails.getTitle());
//            task.setDescription(taskDetails.getDescription());
//            task.setStatus(taskDetails.getStatus());
//            return Optional.of(taskRepository.save(task));
//        } else {
//            return Optional.empty();
//        }
    }

    public Optional<Task> deleteTask(@PathVariable Long id) {
        return taskRepository.findById(id).map(task -> {
            taskRepository.delete(task);
            return task;
        });
    }

}
