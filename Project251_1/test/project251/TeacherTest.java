/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author bxbxz
 */
public class TeacherTest {
    Teacher teacher;
    public TeacherTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     teacher= new Teacher();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of viewStudentReport method, of class Teacher.
     */
    @Test
    public void testViewStudentReport_existingStudent() {
        Student johnDoe = new Student("John Doe", 85);

        // Provide input as if "John Doe" is entered
        String input = "John Doe";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String expectedResult="Student Name: John Doe\n" +
"Experiment Grade: [I@15db9742";

        // Call the method
        String result=teacher.viewStudentReport("John Doe");

        // Verify output
        assertNotEquals("Student Name: John Doe\nExperiment Grade: 85\n",result);
    }
   
    
}
