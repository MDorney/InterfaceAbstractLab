/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Doern
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public Course(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    public final String getCourseName() {
        return this.courseName;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(
                    "Error: courseName cannot be null or empty string");
            
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return this.courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(
                    "Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }
    
    public final double getCredits() {
        return this.credits;
    }
    
    public final void setCredits(double credits) {
        if(credits <= 0 || credits >= 5.0) {
            throw new IllegalArgumentException(
                    "Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }
}
