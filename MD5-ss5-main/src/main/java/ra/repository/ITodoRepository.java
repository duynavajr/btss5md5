package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.entity.Todo;
@Repository
public interface ITodoRepository extends JpaRepository<Todo,Long> {
}
