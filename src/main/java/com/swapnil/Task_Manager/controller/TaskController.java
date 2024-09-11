package com.swapnil.Task_Manager.controller;


import com.swapnil.Task_Manager.dto.TaskDto;
import com.swapnil.Task_Manager.entity.TaskEntity;
import com.swapnil.Task_Manager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    public final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/addTask")
    public ResponseEntity<TaskEntity> addTask(@RequestBody TaskDto taskDto){
        var task=taskService.addTask(taskDto.getTitle(), taskDto.getDescription(), taskDto.getDeadline());
        return ResponseEntity.ok(task);
    }

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<TaskEntity>> getTasks(){
        return new ResponseEntity<>(taskService.getTasks(), HttpStatus.OK);
    }

    @GetMapping("/getTask/{id}")
    public ResponseEntity<TaskEntity> getTaskById(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
    }
}
