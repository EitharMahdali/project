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
class Course {
    private String name;
    private String experiment;

    public Course() {
    }
    
    

    public Course(String name, String experiment) {
        this.name = name;
        this.experiment = experiment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperiment() {
        return experiment;
    }

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    } 
    public String SelectCoures(){
        String [] Coures =  {"Chemistry1","Chemistry2","Chemistry3"};
        for (int i=0; i<3;i++){
            System.out.println(Coures[i]); 
        } 
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Coures Level");
        int choice = n.nextInt();
        switch(choice){
         case 1:
            return "Chemistry1";
        case 2:
            return "Chemistry2";
        case 3:
         return "Chemistry3";
        default:
            System.out.println("Invalid choice. Please try again.");
            return null;   
        }
                
         
    } 
}
