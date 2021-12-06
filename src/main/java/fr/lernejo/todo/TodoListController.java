package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class TodoListController
{
    TodoRepository todoRepository ;

    public TodoListController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping(value = "/api/todo")
    public TodoEntity AddTodo(@RequestBody TodoEntity todo)
    {
        return todoRepository.save(todo);
    }
    @GetMapping(value = "/api/todo")
    public Iterable<TodoEntity> ShowTodo()
    {
        return todoRepository.findAll();

    }
}
