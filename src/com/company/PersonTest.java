package com.company;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    Person person;
    Student student;
    Employee employee;
    Faculty faculty;
    Staff staff;

    @Before
    public void initialize() {
        person = new Person();
        student = new Student();
        employee = new Employee();
        faculty = new Faculty();
        staff = new Staff();
    }

    @Test
    public void testPerson() {
        String expected = "Class: Person, Name: Person Name";
        String actual = person.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testStudent() {
        String expected = "Class: Student, Name: Student Name";
        String actual = student.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmployee() {
        String expected = "Class: Employee, Name: Employee Name";
        String actual = employee.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testFaculty() {
        String expected = "Class: Faculty, Name: Faculty Name";
        String actual = faculty.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testStaff() {
        String expected = "Class: Staff, Name: Staff Name";
        String actual = staff.toString();
        assertEquals(expected, actual);
    }

}
