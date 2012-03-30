/*
        100040X
        Arukgoda J.S.
        Programming Challenge
*/

package sms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentManagementSystemTest {

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentRepository repo = new SimpleStudentRepository();
        StudentManagementSystem instance = new StudentManagementSystem(repo);
        instance.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = null;
        StudentRepository repo = new SimpleStudentRepository();
        StudentManagementSystem instance = new StudentManagementSystem(repo);
        instance.registerStudent(stu);
        
        
    }

}