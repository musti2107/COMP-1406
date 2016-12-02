/**
 COMP1006/1406 - Summer 2014
 Assignment 1, Problem 3

 name:Muhammad Mustafa
   id:100823576
 date:08/07/2014
 
 Creating a functional program to compute the final grade with integer grades as command line arguments
 
 */

public class Grades{
  
  public static int computeGrade(int assignments, int project, int tutorials, 
                                 int quizzes, int midterm, int final_Exam){
    
    /* Checking if grades enter qualify for this criteria */
    if( midterm + final_Exam >= 25){
      
      /* Takes the min of the calculated values, if greater >100 then returns output as 100, as it cannoy exceed that value*/
      return Math.min( (assignments + project + tutorials + quizzes + midterm + final_Exam), 100);
   
    }else{
     
      /*if checks for this criteria where minimum of the 2 values are represted*/
      return Math.min( 2*( midterm + final_Exam), (assignments + project + tutorials + quizzes + midterm + final_Exam));
    }
  }

  public static void main(String[] args){
  
    int assignments, project, tutorials, quizzes, midterm, final_Exam, final_Grade; 
/*checks for 6 arguments if not it represents error mssage*/
    
    if(args.length != 6){
      System.out.println("Usage: java Grades A P T Q M F");
      System.out.println("       where all six command line arguments are integers");
    }else{
      assignments = Integer.parseInt(args[0]);
      project     = Integer.parseInt(args[1]);
      tutorials   = Integer.parseInt(args[2]);
      quizzes     = Integer.parseInt(args[3]);
      midterm     = Integer.parseInt(args[4]);
      final_Exam   = Integer.parseInt(args[5]);
      
      final_Grade = computeGrade(assignments, project, tutorials, quizzes, midterm, final_Exam);
       
      /*Prints final grades*/
      System.out.println("Your Final Grade is: "+ final_Grade);
     
    }
    String s = new String("hi");
    String t = new String("hi");
    if( s.equals(t) )
      System.out.println("same");
    else
      System.out.println("not the same");
    
  }
} 