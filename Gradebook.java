public class Gradebook {
   
   /* INSTANCE VARIABLE DECLARATIONS */
   private double avgProjectsScore;
   private double avgLabsScore;
   private double avgAssignmentsScore;
   
   private int examScore1;
   private int examScore2;
   private int examScore3;
   private int examScore4;
  
   //Declared as a instance variables because they're used in multiple methods like setExamsScore(), computeFinalLetterGrade(), computeFinalNumericGrade(). 
   private double avgExamsScore;        
   private double finalNumericGrade;
   
   
   /* CONSTRUCTOR: INITIALISES THE INSTANCE VARIABLES TO THEIR DEFAULT VALUES */
   public Gradebook() {
      avgProjectsScore = 0.0;
      avgLabsScore = 0.0;
      avgAssignmentsScore = 0.0;
   
      examScore1 = 0;
      examScore2 = 0;
      examScore3 = 0;
      examScore4 = 0;
   }
   
   
   /* METHODS TO GET AND SET VALUES */
   
   //Get and set the average score for projects. 
   public void setAvgProjectsScore(double studentAvgProjectsScore) {
      avgProjectsScore = studentAvgProjectsScore;
   }
   
   //Get and set the average score for labs. 
   public void setAvgLabsScore(double studentAvgLabsScore) {
      avgLabsScore = studentAvgLabsScore;
   }
   
   //Get and set the average score for Assignments. 
   public void setAvgAssignmentsScore(double studentAvgAssignmentsScore) {
      avgAssignmentsScore = studentAvgAssignmentsScore;
   }
   
   
   /* COMPUTING THE AVERAGE SCORE FOR EXAMS */
   
   //If the user does NOT want to drop the final exam score. 
   //Computes the average of 4 exam scores.
   public void setExamsScores(int examScore1, int examScore2, int examScore3, int examScore4) { 
      this.examScore1 = examScore1;
      this.examScore2 = examScore2;
      this.examScore3 = examScore3;
      this.examScore4 = examScore4;
      
      avgExamsScore = (examScore1 + examScore2 + examScore3 + examScore4) / 4.0; 
   }
   
   //If the user wants to drop the final exam score.
   //Computes the average of 3 exam scores.
   public void setExamsScores(int examScore1, int examScore2, int examScore3) { 
      this.examScore1 = examScore1;
      this.examScore2 = examScore2;
      this.examScore3 = examScore3;
            
      avgExamsScore = (examScore1 + examScore2 + examScore3) / 3.0; 
   }
   
   
   /* METHODS TO RETURN VALUES */
   
   //Returns average score for projects. 
   public double getAvgProjectsScore() {
      return avgProjectsScore;
   }
   
   //Returns average score for labs.
   public double getAvgLabsScore() {
      return avgLabsScore;
   }
   
   //Returns average score for Assignments.
   public double getAvgAssignmentsScore() {
      return avgAssignmentsScore;
   }
   
   //Returns average score for exams.
   public double getAvgExamsScore() {
      return avgExamsScore;
   }
   
   //Returns final numeric grade.
   public double getFinalNumericGrade() {
      return finalNumericGrade;
   }
   
   /* COMPUTING FINAL NUMERIC GRADE */ 
   public double computeFinalNumericGrade(double percOfProjects, double percOfLabs, double percOfAssignments, double percOfExams) {
        
      if (percOfProjects + percOfLabs + percOfAssignments + percOfExams == 100) {
         finalNumericGrade = (avgProjectsScore * (percOfProjects/100)) + (avgLabsScore * (percOfLabs/100)) + (avgAssignmentsScore * (percOfAssignments/100)) + (avgExamsScore * (percOfExams/100));
         return finalNumericGrade;  
      }
      
      else {
         finalNumericGrade = -1.0;
         return finalNumericGrade;
      }
   }
   
   /* COMPUTING FINAL LETTER GRADE */
   public String computeFinalLetterGrade() {
      String letterGrade = "";
       
      if (avgExamsScore < 50.0) {
         letterGrade = "F";
      }
         
      else {
         if (finalNumericGrade >= 90) {
            letterGrade = "A";   
         }
            
         else if ((finalNumericGrade >= 80) && (finalNumericGrade < 90)) {
            letterGrade = "B";
         }
            
         else if ((finalNumericGrade >= 70) && (finalNumericGrade < 80)) {
            letterGrade = "C";
         }
            
         else if ((finalNumericGrade >= 60) && (finalNumericGrade < 70)) {
            letterGrade = "D";
         }
            
         else if (finalNumericGrade < 60) {
            letterGrade = "F";
         }
      } 
      return letterGrade;
   }
      
}
