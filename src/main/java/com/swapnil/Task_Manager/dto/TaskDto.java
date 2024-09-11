package com.swapnil.Task_Manager.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TaskDto {

    String title;
    String description;
    Date deadline;
}
