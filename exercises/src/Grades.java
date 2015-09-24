import java.util.ArrayList;
import java.util.Scanner;

/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */

public class Grades {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
      
    ArrayList<Double> grades = new ArrayList<>();
      
      Boolean finished = true;
      
      while (finished) {
        System.out.print("Enter a grade: ");
        double lastGrade = Double.parseDouble(input.next());
        
        if (lastGrade > 100 || lastGrade < 0 && lastGrade != -1) {
            System.out.println("Grade must be between 0 and 100.");
        }
        else if (lastGrade == -1) {
            finished = false;
            
            int numGrades = grades.size();
            double sum = 0;
            
            for (double grade : grades) {
                sum += grade;
            }
            
            double average = sum / grades.size();
            
            System.out.print("You entered " + numGrades + "grades. Your average is " + average);
        }
        else {
            grades.add(lastGrade);
        }
        
        
      }
  }

}
