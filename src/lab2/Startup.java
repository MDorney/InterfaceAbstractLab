/*
 * This was a poor usage of inheritance in my opinion.  There is so much reuse of methods.
 * Because I do not expect you to get a course number differently for a different type of course,
 * I cannot see why you would possibly want to make these common methods abstract and require an override.
 * For the second question, you cannot use Liskov Substitution if you intend to get prerequisites (while also using the enhanced for loop)
 * Technically it would not throw an error if you ensured to check that each course is a member of a class that contains that method, but that is overkill.
 * You could also add the methods to the interface and simply throw a new UnsupportedOperationException (In the child classes without prerequisites),
 * although I do not know if that is best practice
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
