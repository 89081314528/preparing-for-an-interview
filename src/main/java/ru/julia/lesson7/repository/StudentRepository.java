package ru.julia.lesson7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.lesson7.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
