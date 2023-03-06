package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @Test
    void studentsAreEqual() {

        // GIVEN
         student newStudent = new student(342, "Tai", "Tai");
        student newStudent2 = new student(342, "Tai", "Tai");
        //WHEN

        //THEN
        assertEquals(newStudent2, newStudent);



    }

    @Test
    void studentsAreNotEqual() {

        // GIVEN
        student newStudent = new student(342, "T3ai", "Tai");
        student newStudent2 = new student(342, "Tai", "Tai");
        //WHEN

        //THEN
        assertNotEquals(newStudent2, newStudent);



    }
}