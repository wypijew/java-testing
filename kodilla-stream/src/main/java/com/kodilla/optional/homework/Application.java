package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Donald Harris");
        Teacher teacher2 = new Teacher("Thomas Moore");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", teacher1));
        students.add(new Student("Toby", null));
        students.add(new Student("Laura", teacher2));
        students.add(new Student("Michelle", teacher2));
        students.add(new Student("Bill", null));
        students.add(new Student("Bradley", teacher1));


        for (Student student : students) {
            printStudentTeacherInfo(student);
        }
    }

        public static void printStudentTeacherInfo(Student student) {
        String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("student: " + student.getName() + ", teacher: " + teacherName);
        }
}
