package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }
    
    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(
                    "Error: courseName cannot be null or empty string");
            
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return this.courseNumber;
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(
                    "Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }
    
    @Override
    public double getCredits() {
        return this.credits;
    }
    
    @Override
    public void setCredits(double credits) {
        if(credits <= 0 || credits >= 5.0) {
            throw new IllegalArgumentException(
                    "Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }
}
