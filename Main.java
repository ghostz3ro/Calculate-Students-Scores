import java.util.*;
/** Add Class comment and @ tags
* @author Zaid Ansar
* @version 1.0
* date 11/21/2021 
//The purpose of this program is to take a number of //students and their grades and output the highest //scoring student and their grades.
*/
public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //Prompt the user to enter the number of students and store
    System.out.print("Enter the number of students: ");
    int numofStudents = in.nextInt();


    //Validate input using while loop.
    while(numofStudents < 1)
    {
      System.out.print("Please renter number of students: ");
      numofStudents = in.nextInt();
    }


    System.out.println();

    //Fill array of students by calling method
    String studentNames[] = getStudents(numofStudents);

    System.out.println();

    //Fill array of scores by calling method
    double scores[] = getScores(numofStudents);

    //Get index of highest score by calling method
    int highestIndex = getHighestIndex(scores);

    //Print highest student by calling method
    printHighestStudent(studentNames, scores, highestIndex);
  }

  /** Add comment and @ tags - BE DESCRIPTIVE!
  * The purpose of this method
  * @param num
  * @return Student names.
  */
  public static String[] getStudents(int num)
  {
    String[] studentNames = new String[num];
    Scanner stu = new Scanner(System.in);

    for(int i = 0; i < num; i++)
      {
        System.out.print("Please enter a student: ");
        studentNames[i] = stu.nextLine();
      }
      return studentNames;
  }

  /** Add comment and @ tags
  // The following method attains the students scores and validates them.
  *@param num
  *@return returns the student's scores
  */
  public static double[] getScores(int num)
  {
    double[] studentScores = new double[num];
    Scanner stsc = new Scanner(System.in);

    for(int i = 0; i < num; i++)
    {
      System.out.print("Please enter a student score: ");
      studentScores[i] = stsc.nextDouble();
      while(studentScores[i] < 0 || studentScores[i] > 100)
      {
        System.out.print("Invalid. Enter a score >> ");
        studentScores[i] = stsc.nextDouble();
      }
    }
    return studentScores;
  }
  /** Add comment and @ tags
  // The following method attains the highest score and highest index.
  *@param scores
  *@return the highest index.
  */
  public static int getHighestIndex(double[] scores)
  {
    int highestIndex = 0;
    double highestScore = scores[0];
    for(int i = 0; i < scores.length; i++)
    {
      if(highestScore < scores[i])
      {
        highestScore = scores[i];
        highestIndex = i;
      }
    }
    return highestIndex;
  }
  /** Add comment and @ tags and write method
  //The following method prints out the highest scoring student and their highest score.
  *@param studentNames
  *@param studentScores
  *@param scores
  *@param highestIndex
  */
  public static void printHighestStudent(String[] studentNames, double[] studentScores, int highestIndex)
  {
    System.out.println();
    System.out.println("Top Student");
    System.out.println(studentNames[highestIndex] + "'s score is: " + studentScores[highestIndex]);
  }  
}
