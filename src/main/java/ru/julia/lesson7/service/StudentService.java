package ru.julia.lesson7.service;

import ru.julia.lesson7.entity.Student;

import java.util.Collection;

public interface StudentService {
    Student getStudentById(Long studentId);

    Collection<Student> getAllStudents();

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Long studentId);
}
