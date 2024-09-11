package com.swapnil.Task_Manager.service;

import com.swapnil.Task_Manager.entity.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {

    private ArrayList<TaskEntity> task=new ArrayList<>();
    private int taskId=1;
    public TaskEntity addTask(String title, String description, Date deadline){

        TaskEntity taskEntity=new TaskEntity();
        taskEntity.setId(taskId);
        taskEntity.setTitle(title);
        taskEntity.setDescription(description);
        taskEntity.setDeadLine(deadline);
        taskEntity.setCompleted(false);
        task.add(taskEntity);
        taskId++;
        return taskEntity;


    }

    public ArrayList<TaskEntity> getTasks(){
        return task;
    }

    public TaskEntity getTaskById(int id){
        for(TaskEntity taskEntity:task){
            if(taskEntity.getId()==id){
                return taskEntity;
            }
        }
        return null;
    }

}
