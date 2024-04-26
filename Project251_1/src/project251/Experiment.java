/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

/**
 *
 * @author bxbxz
 */
class Experiment {

  private String ExperimentName;
  private String extool;
  private String exinstruction;
  private String saftyinstruction;

  public Experiment(String ExperimentName) {
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
}

    

