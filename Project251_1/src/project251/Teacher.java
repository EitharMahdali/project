/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;
import java.util.*;
public class Teacher {
    
    
    
    public static String viewStudentReport(String studentName) {
    
        if (studentName != null) {
            System.out.println("Student Name: "+studentName+"\nExperiment Grade: "+Student.getStudentGrade());
            return "Student Name: "+studentName+"\nExperiment Grade: "+Student.getStudentGrade();
            // Print other relevant student information here
        } else {
            System.out.println("Student with name " + studentName + " not found.");
            return "Student with name " + studentName + " not found.";
        }
    }

    
}
