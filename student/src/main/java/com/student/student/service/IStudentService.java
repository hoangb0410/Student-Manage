package com.student.student.service;

import java.util.List;

import com.student.student.model.Student;

public interface IStudentService {
    Student addStudent(Student student);

    List<Student> getStudents();

    Student updateStudent(Student student, Long id);

    Student getStudentById(Long id);

    void deleteStudent(Long id);
}
