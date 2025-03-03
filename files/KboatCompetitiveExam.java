/*In a competitive examination, there were 150 questions. One candidate got 80% 
correct and the other candidate 72% correct. Write a program to calculate and 
display the correct answers each candidate got.*/

public class KboatCompetitiveExam
{
 public static void main(String args[]) 
 {
 int totalQuestions = 150;
 double c1 = 80 / 100.0 * totalQuestions;
 double c2 = (72 / 100.0 * totalQuestions);
 System.out.println("Correct Answers of Candidate 1 = " + c1);
 System.out.println("Correct Answers of Candidate 2 = " + c2);
 }
}
