/**
 COMP1006/1406 - Summer 2014
 Assignment 2, Problem 1

 name:Muhammad Mustafa
   id:100823576
 date:14/07/2014
 
 Creating a function longestStreak of class Problem1, that can be called upon by a main method to compute the length of the longest 
 streak of trues in an input boolean argument. 
 
 eg: boolean[] test_case = new boolean[]{false, true, true, false};
     Problem1.longestStreak( test_case ) returns ????? 2.
     test case = new boolean[]{false};
     Problem1.longestStreak( test_case ) returns ????? 0.
     test case = new boolean[]{true, false, true};
     Problem1.longestStreak( test_case ) returns ????? 1.
 */

public class Problem1 {
  
 public static int longestStreak(boolean[] test_case){  
   
/* 
* Purpose: computes the length of a longest streak of consecutive *
*           true occurrences in the input argument values *
* Input : values is a non-null array of booleans with length at least 1 *
* output : outputs the maximal number of consecutive trues found in *
*          the input array .
*/
   
    //declaring variables.
     boolean boolean_to_check = true;
     
     //counters
     int max_counter = 0; 
     int temp_counter = 0;
    
     if(test_case.length == 1) //if only 1 argument present then the following happens.
     {
      if(test_case[0] == boolean_to_check)
       return 1;
      else
       return 0;
     }
     
     for ( int i =  0; i<test_case.length; i++) //for arguments> 1 checking false and trues in test_case and counting trues
     {
      boolean current_boolean = false;

      if(i == 0)
      {
       current_boolean = test_case[i];
       if(boolean_to_check == current_boolean)
       temp_counter++;     
      }
      else
      {
       current_boolean = test_case[i];
       if(current_boolean == boolean_to_check)
        temp_counter++;
       else
       {
        if(max_counter < temp_counter) //comparing counts for highest value
         max_counter = temp_counter;
        
        temp_counter = 0;
       }
      }
      
      
     }
     
     if(max_counter < temp_counter) //when the loop breaks, checks highest count again.
     { 
         max_counter = temp_counter; 
     }
     
     return max_counter;
 }
}