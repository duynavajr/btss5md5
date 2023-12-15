package ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.entity.Todo;
import ra.repository.ITodoRepository;

import java.util.List;
@Service
public class TodoService implements ITodoService<Todo,Long>{
   @Autowired
   private ITodoRepository todoRepository;


    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findById(Long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo delete(Long id) {
        Todo todo = todoRepository.findById(id).get();
       todoRepository.delete(todo);
        return todo;
    }
}
