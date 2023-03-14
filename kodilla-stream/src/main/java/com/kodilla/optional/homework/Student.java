package com.kodilla.optional.homework;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getTeacherName() {
        if (teacher == null) {
            return "<undefined>";
        } else {
            return teacher.getName();
        }
    }


}
