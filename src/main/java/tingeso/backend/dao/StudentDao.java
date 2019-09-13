package tingeso.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tingeso.backend.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
    Student findStudentById(Integer id);
}