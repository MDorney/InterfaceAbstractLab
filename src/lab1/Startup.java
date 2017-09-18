/*
 * I prefer in this specific implementation to use an Abstract Class.
 * As is clearly demonstrated by the Course parent class, almost all methods are
 * not only shared but final as well in this project.
 * Using the Liskov Substitution here is what enables my enhanced for loop to work
 * I'm not a huge OOP fan but this aspect of polymorphism/inheritance is my favorite part
 */
package lab1;

import java.util.ArrayList;

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
