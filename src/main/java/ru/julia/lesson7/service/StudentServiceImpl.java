package ru.julia.lesson7.service;

import org.springframework.stereotype.Service;
import ru.julia.lesson7.entity.Student;
import ru.julia.lesson7.exception.StudentNotFoundException;
import ru.julia.lesson7.repository.StudentRepository;

import java.util.Collection;
@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> {
                    return new StudentNotFoundException();
                });
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        boolean studentExists = studentRepository.existsById(studentId);
        if (!studentExists) {
            throw new StudentNotFoundException();
        }
        studentRepository.deleteById(studentId);
    }
}
