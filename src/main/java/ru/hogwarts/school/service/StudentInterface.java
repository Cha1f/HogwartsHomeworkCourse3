package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.Collection;

public interface StudentInterface {
    Student createStudent(Student student);

    Student readStudentById(long id);

    Student updateStudent(long id, Student student);

    void deleteStudent(long id);

    Collection<Student> getAllStudents();

}
