package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import javax.validation.constraints.NotNull;
import java.util.List;

@Endpoint
@AnonymousAllowed
public class TodoEndpoint {

    private TodoRepository todoRepository;

    public TodoEndpoint(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public @NotNull List<@NotNull Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo save(Todo todo){
        return  todoRepository.save(todo);
    }
}
