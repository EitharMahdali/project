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

  
    public void testSelectExperiment_ValidInput_SimpleSubstitutionReactions() {
        String[] experiments = {"Simple Substitution Reactions", "Molar Ratios", "Reaction Heat", "Polymerization Reactions", "Covalent Bonds in Medicines"};
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

        String actualResult = instance.selectexperiment(experiments);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSelectExperiment_ValidInput_MolarRatios() {
        String[] experiments = {"Simple Substitution Reactions", "Molar Ratios", "Reaction Heat", "Polymerization Reactions", "Covalent Bonds in Medicines"};
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

        String actualResult = instance.selectexperiment(experiments);

        assertEquals(expectedResult, actualResult);
    }

    

    
    
}
