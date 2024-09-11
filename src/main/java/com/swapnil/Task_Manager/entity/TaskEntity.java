package com.swapnil.Task_Manager.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TaskEntity {

    private int id;
    private String title;
    private String description;
    private Date deadLine;
    private boolean completed;
}
