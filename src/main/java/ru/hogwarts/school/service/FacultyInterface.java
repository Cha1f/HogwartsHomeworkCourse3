package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

public interface FacultyInterface {
    Faculty createFaculty(Faculty faculty);

    Faculty readFaculty(long id);

}
