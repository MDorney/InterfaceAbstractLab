/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Doern
 */
public class Startup {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new IntroToProgrammingCourse("152-107-001", "10127", 2.0);
        courses[1] = new IntroJavaCourse("152-134-001", "10137", 4.0, "One Programming and Math class");   
        courses[2] = new AdvancedJavaCourse("152-135-002", "10140", 4.0, "Java and Database");        
                
        for(Course c : courses) {
            System.out.println("Course Name: " + c.getCourseName());
            System.out.println("Course Number: " + c.getCourseNumber());
            System.out.println("Credits: " + c.getCredits());
        }
    }
}
