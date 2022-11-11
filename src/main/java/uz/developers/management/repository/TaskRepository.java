package uz.developers.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.management.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Integer> {



}
