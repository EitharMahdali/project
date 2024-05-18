/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.util.Scanner;
public class Project251 {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Menu");
            System.out.println("1. Select Course");
            System.out.println("2. Select Experiment");
            System.out.println("3. Conduct the Experiment");
            System.out.println("4. View Student Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    String selectedCourse = Course.SelectCoures();
                    if (selectedCourse != null) {
                        System.out.println("You selected: " + selectedCourse);
                    }
                    break;
                case 2:
                    String selectedExperiment = Experiment.selectexperiment();
                    if (selectedExperiment != null) {
                        System.out.println("Experiment selected:\n" + selectedExperiment);
                    }
                    break;
                case 3:
                    System.out.print("Enter the selected Experiment: ");
                    String selectedEx = scanner.nextLine();
                    Experiment.gradeExperiment(selectedEx);
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    Teacher.viewStudentReport(studentName);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }


 
    
    
}
