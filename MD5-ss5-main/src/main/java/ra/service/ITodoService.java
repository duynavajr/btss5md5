package ra.service;

import ra.entity.Todo;

import java.util.List;
public interface ITodoService<T,E> {
    List<Todo> findAll();

    Todo findById(Long id);

    Todo save(Todo todo);

    Todo delete(Long id);


}
