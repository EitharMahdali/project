/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

public class Student  {
    static String studentName;
    private int StudentGrade;
    private Experiment ConductsExperiment;

    public Student(String studentName, int StudentGrade) {
        this.studentName = studentName;
        this.StudentGrade = StudentGrade;
    }

    public static String getStudentName() {
        return studentName;
    }
 
    public String SelectCourse(Course [] CourseName){
        
        return null;
        
    }
    public String SelectExperiment(Experiment [] experimentName,Course CourseName){
        return null;
        
    }

    public static int getStudentGrade() {
        return 80;
    }
    
    public String ViewListPrevExperiment( Experiment [] experimentName){
        return null;
        
    }
    
}
