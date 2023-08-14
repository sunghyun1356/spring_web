package org.zerock.w2.todo.service;

import org.zerock.w2.todo.dto.TodoDTO;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

import java.util.stream.IntStream;

public enum  TodoService {
    INSTANCE;
    //TdoDTO에 있는 todoDTO 클래스를 사용하겠다
    public void register(TodoDTO todoDTO)
    {
        System.out.println(("DEBUG..................." + todoDTO));
    }
    public List<TodoDTO> getList()
    {
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
                TodoDTO dto = new TodoDTO();
                dto.setTno((long)i);
                dto.setTitle("Todo.." + i);
                dto.setDueDate(LocalDate.now());
                return dto;
        }).collect(Collectors.toList());
        return todoDTOS;
    }
    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);
        return dto;
    }
}
