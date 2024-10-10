package com.diegorogel.taskregister.mapper;

import com.diegorogel.taskregister.model.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskMapper {
    List<Task> findAll();
    void insertTask(Task task);
    void deleteTask(int id);
}
