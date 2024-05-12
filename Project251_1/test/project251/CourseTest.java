/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author bxbxz
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testSelectCourse() {
    // Prepare input for scanner
    String input = "2"; // Enter the course level 2

    // Set the input stream to the prepared input
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Invoke the method
    Course courseSelector = new Course();
    String selectedCourse = Course.selectCourse();

    // Restore the standard input stream
    System.setIn(System.in);

    // Verify the selected course
    assertEquals("Chemistry2", selectedCourse);
}
    
}
