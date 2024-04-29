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
  
  public void selectexperiment(){
     
     
      for (int i = 0; i < ExperimentName.length; i++) {
          System.out.println(ExperimentName[i]);
        }
        Scanner n = new Scanner(System.in);
        System.out.println("select experiment");
        String experiment = n.nextLine();
        switch (experiment.toLowerCase()) {
            case "simple substitution reactions":
                System.out.println("Steps:\n"
                        + "Choose suitable reactants for substitution (e.g., metal and salt solution).\n"
                        + "Prepare reactants and equipment.\n"
                        + "Mix reactants in proper molar ratios.\n"
                        + "Observe color changes or precipitate formation, indicating the reaction.\n"
                        + "Filter and wash the product if necessary.\n"
                        + "Safety Information:\n"
                        + "Wear lab coat, gloves, and safety goggles.\n"
                        + "Handle chemicals with care to avoid spills.\n"
                        + "Work in a well-ventilated area.\n"
                        + "Dispose of waste properly.");
                break;
            case "molar ratios":
                System.out.println("Steps:\n"
                        + "Determine the balanced chemical equation for the reaction.\n"
                        + "Weigh the reactants accurately.\n"
                        + "Convert reactant masses to moles.\n"
                        + "Determine molar ratios based on the balanced equation.\n"
                        + "Combine reactants in proper ratios and perform the reaction.\n"
                        + "Safety Information:\n"
                        + "Follow general lab safety protocols.\n"
                        + "Use proper PPE including gloves and goggles.\n"
                        + "Handle chemicals according to safety data sheets (SDS).");
                break;
            case "reaction heat":
                System.out.println("Steps:\n"
                        + "Set up a calorimeter with a reaction vessel, thermometer, and insulation.\n"
                        + "Prepare reactants and measure initial temperature.\n"
                        + "Mix reactants in the calorimeter and record temperature changes.\n"
                        + "Calculate heat change (∆H) using calorimeter's heat capacity.\n"
                        + "Safety Information:\n"
                        + "Use caution with hot materials and heating devices.\n"
                        + "Avoid direct skin contact with hot surfaces.\n"
                        + "Work in a controlled environment to prevent accidents.");
                break;
            case "polymerization reactions":
                System.out.println("Steps:\n"
                        + "Choose monomers and catalysts for polymerization.\n"
                        + "Prepare monomers and reaction setup.\n"
                        + "Initiate polymerization using heat, light, or catalysts.\n"
                        + "Monitor reaction progress (e.g., viscosity changes).\n"
                        + "Purify and characterize the polymer product.\n"
                        + "Safety Information:\n"
                        + "Handle monomers and catalysts according to safety guidelines.\n"
                        + "Use appropriate PPE such as gloves and lab coat.\n"
                        + "Ensure proper ventilation during the reaction.");
                break;
            case "covalent bonds in medicines":
                System.out.println("Steps:\n"
                        + "Select drugs or compounds with covalent bonds for analysis.\n"
                        + "Prepare samples and equipment for analysis.\n"
                        + "Use analytical techniques (e.g., mass spectrometry) to study covalent bonds.\n"
                        + "Interpret data to understand drug structure and interactions.\n"
                        + "Safety Information:\n"
                        + "Follow lab safety protocols for handling chemicals and equipment.\n"
                        + "Use analytical instruments under supervision if necessary.\n"
                        + "Dispose of samples and waste properly.");
                break;
        default:
                System.out.println("Invalid Please try again.");
                
        }

    }

  

}

