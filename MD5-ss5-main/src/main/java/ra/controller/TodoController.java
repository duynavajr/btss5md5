package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.entity.Todo;
import ra.service.ITodoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
@CrossOrigin("*")
public class TodoController {
    @Autowired
    private ITodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> findAll(){
        return new ResponseEntity<>(todoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(todoService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.save(todo), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo,@PathVariable("id") Long id){
        System.out.println(id);
        todo.setId(id);
        return new ResponseEntity<>(todoService.save( todo ),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id){
        return new ResponseEntity<>(todoService.delete( id ),HttpStatus.OK);
    }

}
