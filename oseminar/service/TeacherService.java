package ru.gb.oseminar.service;

package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List; 

public class TeacherService <T extends User>{

    private final List<T> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<T> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (T teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        T teacher = new T(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
}