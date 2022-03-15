import java.util.Scanner;

public class GradebookMain{
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      Gradebook student = new Gradebook();
      
      /* Get and set the average score for projects. */
      System.out.print("Enter average score for projects: ");
      double studentAvgProjectsScore = scan.nextDouble();
      student.setAvgProjectsScore(studentAvgProjectsScore);
      
      /* Get and set the average score for labs. */
      System.out.print("Enter average score for labs: ");
      double studentAvgLabsScore = scan.nextDouble();
      student.setAvgLabsScore(studentAvgLabsScore);
      
      /* Get and set the average score for Assignments. */ 
      System.out.print("Enter average score for Assignments: ");
      double studentAvgAssignmentsScore = scan.nextDouble();
      student.setAvgAssignmentsScore(studentAvgAssignmentsScore);
      
      System.out.print("\n");
      
      
      /* Ask the user if they want to drop the final exam score or not. 
       * Get and set the exam scores and compute the average for exam scores. */
      System.out.print("Do you want to drop the final exam score? (y/n): ");
      String dropAns = scan.next();
      System.out.print("\n");
      
      //If the user does NOT want to drop the final exam score. 
      //Computes the average of 4 exam scores. 
      if (dropAns.equals("n")){
         System.out.println("Enter exam scores");
         
         System.out.print("Exam Score 1: ");
         int examScore1 = scan.nextInt();
         
         System.out.print("Exam Score 2: ");
         int examScore2 = scan.nextInt();
         
         System.out.print("Exam Score 3: ");
         int examScore3 = scan.nextInt();
         
         System.out.print("Final Exam Score: ");
         int examScore4 = scan.nextInt();
         
         student.setExamsScores(examScore1, examScore2, examScore3, examScore4);
         System.out.println("Average score for exams is: " + student.getAvgExamsScore());
      }
      
      //If the user wants to drop the final exam score.
      //Computes the average of 3 exam scores.  
      if (dropAns.equals("y")) {
         System.out.println("Enter exam scores");
         
         System.out.print("Exam Score 1: ");
         int examScore1 = scan.nextInt();
         
         System.out.print("Exam Score 2: ");
         int examScore2 = scan.nextInt();
         
         System.out.print("Exam Score 3: ");
         int examScore3 = scan.nextInt();
                  
         student.setExamsScores(examScore1, examScore2, examScore3);
         System.out.println("Average score for exams is: " + student.getAvgExamsScore());   
      }
      System.out.print("\n");
      
      
      /* Determine if the average score for exams is above the threshold of 50.0 */
      if (student.getAvgExamsScore() > 50) {
         System.out.println("This student's average score for exams is above the threshold of 50.0!");
      }
      
      else {
         System.out.println("This student's average score for exams is below the threshold of 50.0");
      }
      System.out.print("\n");
      
      
      /* Computing the final numeric grade.*/
      System.out.println("Enter the weight of each part as percentages");
      
      System.out.print("Weight of projects in percentage(%): ");
      double percOfProjects = scan.nextDouble();
         
      System.out.print("Weight of labs in percentage(%): ");
      double percOfLabs = scan.nextDouble();
         
      System.out.print("Weight of Assignments in percentage(%): ");
      double percOfAssignments = scan.nextDouble();
       
      System.out.print("Weight of exams in percentage(%): ");
      double percOfExams = scan.nextDouble();
         
      System.out.print("\n");
      
      double finalNumericGrade = student.computeFinalNumericGrade(percOfProjects, percOfLabs, percOfAssignments, percOfExams);
      System.out.println("This student's final numeric grade is: " + finalNumericGrade);
                  
      
      /*Computing the final letter grade.*/
      if (student.getFinalNumericGrade() == -1.0) {
         System.out.println("Weights input for the parts do not equal to 100.");
      }
      
      else {
         String finalLetterGrade = student.computeFinalLetterGrade();
         System.out.println("This student's final letter grade is: " + finalLetterGrade);
      } 
        
   
   }


}
