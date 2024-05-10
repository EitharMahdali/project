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

/**
 *
 * @author bxbxz
 */
public class ExperimentTest {
    Experiment instance;
    public ExperimentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Experiment();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSelectExperiment_ValidInput_SimpleSubstitutionReactions() {
        String input = "simple substitution reactions";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String expectedResult = "Steps:\n"
                + "Choose suitable reactants for substitution (e.g., metal and salt solution).\n"
                + "Prepare reactants and equipment.\n"
                + "Mix reactants in proper molar ratios.\n"
                + "Observe color changes or precipitate formation, indicating the reaction.\n"
                + "Filter and wash the product if necessary.\n"
                + "Safety Information:\n"
                + "Wear lab coat, gloves, and safety goggles.\n"
                + "Handle chemicals with care to avoid spills.\n"
                + "Work in a well-ventilated area.\n"
                + "Dispose of waste properly.";

        String actualResult = instance.selectexperiment();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSelectExperiment_ValidInput_MolarRatios() {
        
        String input = "molar ratios";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String expectedResult = "Steps:\n"
                + "Determine the balanced chemical equation for the reaction.\n"
                + "Weigh the reactants accurately.\n"
                + "Convert reactant masses to moles.\n"
                + "Determine molar ratios based on the balanced equation.\n"
                + "Combine reactants in proper ratios and perform the reaction.\n"
                + "Safety Information:\n"
                + "Follow general lab safety protocols.\n"
                + "Use proper PPE including gloves and goggles.\n"
                + "Handle chemicals according to safety data sheets (SDS).";

        String actualResult = instance.selectexperiment();

        assertEquals(expectedResult, actualResult);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////


    /**
     * Test of getExperimentSteps method, of class Experiment.
     */
     @Test
    public void testGetExperimentSteps_validIndex() {
        // Call the method to test
        String[] steps = Experiment.getExperimentSteps(0, 5);

        assertEquals(5, steps.length);
        assertEquals("Choose suitable reactants for substitution (e.g., metal and salt solution).", steps[0]);
        assertEquals("Prepare reactants and equipment.", steps[1]);
        assertEquals("Mix reactants in proper molar ratios.", steps[2]);
        assertEquals("Observe color changes or precipitate formation, indicating the reaction.", steps[3]);
        assertEquals("Filter and wash the product if necessary.", steps[4]);
    }

    @Test
    public void testGetExperimentSteps_invalidIndex() {
        // Call the method to test with invalid index
        String[] steps = Experiment.getExperimentSteps(10, 5);


        assertEquals(5, steps.length);
        assertNull(steps[0]);
        assertNull(steps[1]);
        assertNull(steps[2]);
        assertNull(steps[3]);
        assertNull(steps[4]);
    }
    @Test
    public void testGetGrades() {
        // Call the method to test
        int[] grades = Experiment.getGrades();

        // Assertions
        assertNotNull(grades);
        assertEquals(5, grades.length);
        for (int grade : grades) {
            assertEquals(0, grade); // By default, all grades should be initialized to 0
        }
    }
    @Test
    public void testEvaluateAndGrade_validInput() {
        // Prepare input data for the test
        String[] correctSteps = {"Choose suitable reactants for substitution",
                                 "Prepare reactants and equipment",
                                 "Mix reactants in proper molar ratios",
                                 "Observe color changes or precipitate formation",
                                 "Filter and wash the product if necessary"};
        int numSteps = correctSteps.length;
        int index = 0; // Index for "simple substitution reactions"

        // Simulate user input
        ByteArrayInputStream in = new ByteArrayInputStream("Choose suitable reactants for substitution\nPrepare reactants and equipment\nMix reactants in proper molar ratios\nObserve color changes or precipitate formation\nFilter and wash the product if necessary\n".getBytes());
        System.setIn(in);

        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to test
        Experiment.evaluateAndGrade(correctSteps, numSteps, index);


        System.setOut(System.out);

        String output = outContent.toString().trim();

       
        assertTrue(output.contains("Grade for simple substitution reactions: "));
    }
     @Test
    public void testGradeExperiment_validInput() {

        String experimentName = "simple substitution reactions";

        // Simulate user input
        ByteArrayInputStream in = new ByteArrayInputStream("Choose suitable reactants for substitution\nPrepare reactants and equipment\nMix reactants in proper molar ratios\nObserve color changes or precipitate formation\nFilter and wash the product if necessary\n".getBytes());
        System.setIn(in);

        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Experiment.gradeExperiment(experimentName);

        System.setOut(System.out);
        String output = outContent.toString().trim();


        assertTrue(output.contains("Grade for simple substitution reactions: "));
    }

    @Test
    public void testGradeExperiment_invalidInput() {
        String experimentName = "invalid experiment";

        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Experiment.gradeExperiment(experimentName);

        System.setOut(System.out);
        String output = outContent.toString().trim();

        // Assertions
        assertTrue(output.contains("Invalid selection. Please try again."));
    }
}
    
    


    

    
    

