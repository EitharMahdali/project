/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.util.Scanner;

/**
 *
 * @author bxbxz
 */
class Experiment {

  private String [] ExperimentName={"Simple Substitution Reactions","Molar Ratios","reaction heat","Polymerization reactions","Covalent Bonds in Medicines"};
  private String extool;
  private String exinstruction;
  private String saftyinstruction;

    public Experiment() {
    }

  
    public Experiment(String[] ExperimentName) {
        this.ExperimentName = ExperimentName;
    }

 
  public String getextool(String ExperimentName) {
    // Implement logic to get extool based on ExperimentName
    return this.extool;
  }

  public String getsaftyinstruction() {
    // Implement logic to get safety instructions
    return this.saftyinstruction;
  }

  public String getexinstruction(String ExperimentName) {
    // Implement logic to get experiment instructions based on ExperimentName
    return this.exinstruction;
  }
  
  public static String selectexperiment() {
        String [] ExperimentName={"Simple Substitution Reactions","Molar Ratios","reaction heat","Polymerization reactions","Covalent Bonds in Medicines"};
        System.out.println("Available experiments:");
        for (String name : ExperimentName) {
            System.out.println(name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an experiment:");
        String selectedExperiment = scanner.nextLine();

        
        switch (selectedExperiment.toLowerCase()) {
            case "simple substitution reactions":
                return "Steps:\n"
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
            case "molar ratios":
                return "Steps:\n"
                        + "Determine the balanced chemical equation for the reaction.\n"
                        + "Weigh the reactants accurately.\n"
                        + "Convert reactant masses to moles.\n"
                        + "Determine molar ratios based on the balanced equation.\n"
                        + "Combine reactants in proper ratios and perform the reaction.\n"
                        + "Safety Information:\n"
                        + "Follow general lab safety protocols.\n"
                        + "Use proper PPE including gloves and goggles.\n"
                        + "Handle chemicals according to safety data sheets (SDS).";
            case "reaction heat":
                return "Steps:\n"
                        + "Set up a calorimeter with a reaction vessel, thermometer, and insulation.\n"
                        + "Prepare reactants and measure initial temperature.\n"
                        + "Mix reactants in the calorimeter and record temperature changes.\n"
                        + "Calculate heat change (∆H) using calorimeter's heat capacity.\n"
                        + "Safety Information:\n"
                        + "Use caution with hot materials and heating devices.\n"
                        + "Avoid direct skin contact with hot surfaces.\n"
                        + "Work in a controlled environment to prevent accidents.";
            case "polymerization reactions":
                return "Steps:\n"
                        + "Choose monomers and catalysts for polymerization.\n"
                        + "Prepare monomers and reaction setup.\n"
                        + "Initiate polymerization using heat, light, or catalysts.\n"
                        + "Monitor reaction progress (e.g., viscosity changes).\n"
                        + "Purify and characterize the polymer product.\n"
                        + "Safety Information:\n"
                        + "Handle monomers and catalysts according to safety guidelines.\n"
                        + "Use appropriate PPE such as gloves and lab coat.\n"
                        + "Ensure proper ventilation during the reaction.";
            case "covalent bonds in medicines":
                return "Steps:\n"
                        + "Select drugs or compounds with covalent bonds for analysis.\n"
                        + "Prepare samples and equipment for analysis.\n"
                        + "Use analytical techniques (e.g., mass spectrometry) to study covalent bonds.\n"
                        + "Interpret data to understand drug structure and interactions.\n"
                        + "Safety Information:\n"
                        + "Follow lab safety protocols for handling chemicals and equipment.\n"
                        + "Use analytical instruments under supervision if necessary.\n"
                        + "Dispose of samples and waste properly.";
            default:
                return "Invalid selection. Please try again.";
        }
    }
  
public static void gradeExperiment(String selectedExperiment){
      String[] experimentNames = {"simple substitution reactions", "molar ratios", "reaction heat", "polymerization reactions", "covalent bonds in medicines"};
        int[] grades = new int[experimentNames.length];
        
       switch (selectedExperiment.toLowerCase()) {
            case "simple substitution reactions":
                evaluateAndGrade(getExperimentSteps(0, 5), 5, 0);
                break;
            case "molar ratios":
                evaluateAndGrade(getExperimentSteps(1, 5), 5, 1);
                break;
            case "reaction heat":
                evaluateAndGrade(getExperimentSteps(2, 4), 4, 2);
                break;
            case "polymerization reactions":
                evaluateAndGrade(getExperimentSteps(3, 5), 5, 3);
                break;
            case "covalent bonds in medicines":
                evaluateAndGrade(getExperimentSteps(4, 4), 4, 4);
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                return;
        }
    }

public static void evaluateAndGrade(String[] correctSteps, int numSteps, int index) {
     String[] experimentNames = {"simple substitution reactions", "molar ratios", "reaction heat", "polymerization reactions", "covalent bonds in medicines"};
        int[] grades = new int[experimentNames.length];
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        
        System.out.println("Enter the experiment steps for " + experimentNames[index] + ":");
        for (int i = 0; i < numSteps; i++) {
            System.out.println("Step " + (i + 1) + ":");
            String studentStep = scanner.nextLine();
            if (studentStep.equalsIgnoreCase(correctSteps[i])) {
                correctCount++;
            }
        }
        
        // Calculate grade and store in the grades array
        grades[index] = (int) Math.round((double) correctCount / numSteps * 100);
        System.out.println("Grade for " + experimentNames[index] + ": " + grades[index] + "%");
    }
    
    // Method to get correct steps for an experiment
    public static String[] getExperimentSteps(int index, int numSteps) {
        switch (index) {
            case 0:
                return new String[]{
                        "Choose suitable reactants for substitution (e.g., metal and salt solution).",
                        "Prepare reactants and equipment.",
                        "Mix reactants in proper molar ratios.",
                        "Observe color changes or precipitate formation, indicating the reaction.",
                        "Filter and wash the product if necessary."
                };
            case 1:
                return new String[]{
                        "Determine the balanced chemical equation for the reaction.",
                        "Weigh the reactants accurately.",
                        "Convert reactant masses to moles.",
                        "Determine molar ratios based on the balanced equation.",
                        "Combine reactants in proper ratios and perform the reaction."
                };
            case 2:
                return new String[]{
                        "Set up a calorimeter with a reaction vessel, thermometer, and insulation.",
                        "Prepare reactants and measure initial temperature.",
                        "Mix reactants in the calorimeter and record temperature changes.",
                        "Calculate heat change (∆H) using calorimeter's heat capacity."
                };
            case 3:
                return new String[]{
                        "Choose monomers and catalysts for polymerization.",
                        "Prepare monomers and reaction setup.",
                        "Initiate polymerization using heat, light, or catalysts.",
                        "Monitor reaction progress (e.g., viscosity changes).",
                        "Purify and characterize the polymer product."};
            case 4:
                return new String[]{
                        "Select drugs or compounds with covalent bonds for analysis.",
                        "Prepare samples and equipment for analysis.",
                        "Use analytical techniques (e.g., mass spectrometry) to study covalent bonds.",
                        "Interpret data to understand drug structure and interactions."
                };
            default:
                return new String[numSteps];
        }
    }
    
    // Method to retrieve grades array
    public int[] getGrades() {
         String[] experimentNames = {"simple substitution reactions", "molar ratios", "reaction heat", "polymerization reactions", "covalent bonds in medicines"};
        int[] grades = new int[experimentNames.length];
        return grades;
    }
  

}

