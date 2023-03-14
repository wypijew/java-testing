package com.kodilla;

import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    @Test
    void testGetTeacherNameWhenTeacherIsPresent() {
        // given
        Teacher teacher = new Teacher("Donald Harris");
        Student student = new Student("Mike", teacher);

        // when
        String teacherName = student.getTeacherName();

        // then
        assertEquals("Donald Harris", teacherName);
    }

    @Test
    void testGetUndefinedWhenTeacherIsNull() {
        // given
        Student student = new Student("Toby", null);

        // when
        String teacherName = student.getTeacherName();

        // then
        assertEquals("<undefined>", teacherName);
    }

    @Test
    void testGetTeacherNameWhenTeacherNameIsEmpty() {
        // given
        Teacher teacher = new Teacher("undefined");
        Student student = new Student("John", teacher);

        // when
        String teacherName = student.getTeacherName();

        // then
        assertEquals( teacherName, "undefined");
    }

    @Test
    void testGetTeacherNameWhenTeacherNameIsNotEmpty() {
        // given
        Teacher teacher1 = new Teacher("Donald Harris");
        Student student = new Student("Bradley", teacher1);

        // when
        String teacherName = student.getTeacherName();

        // then
        assertEquals( teacherName, "Donald Harris");
    }

}
