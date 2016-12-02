/**
 COMP1006/1406 - Summer 2014
 Assignment 2, Problem 2

 name:Muhammad Mustafa
   id:100823576
 date:14/07/2014
 
 Creating a function longestStreak of class Problem 2, that can be called upon by a main method to compute
 the length of the longest streak of trues in an input boolean argument and also give out the 
 starting point of the maximal true argument occurance.
 
 eg: boolean[] test case = new boolean[]{false, true, true, false};
     Problem2.longestStreak( test case ) returns ????? [2,1]
     test case = new boolean[]{false};
     Problem2.longestStreak( test case ) returns ????? [0]
     test case = new boolean[]{true, false, true};
     Problem2.longestStreak( test case ) returns ????? [1,0,2] 
*/

public class Problem2 {
  
 public static int[] longestStreak(boolean[] test_case){           

/* 
* Purpose : computes the length and locations of all the maximal *
*            sequences of consecutive true occurrences in values *
* Inputs : values is a non-null array of booleans with length at least 1 *
* Outputs : outputs an integer array with one or more elements *
*          - first element is the length of a maximal sequence of *
*           consecutive trues in the input array values *
*          - the next elements are the indexes of the starting points *
*          (in the input array values) of each of the maximal *
*          sequences of consecutive trues *
*          if there are no true values in the input array, output [0] 
*/ 
   
   //declaring new array of results and variables.
     int result[] = new int[test_case.length];
     int current_result_position = 1;
     
     boolean boolean_to_check = true;
     boolean is_consecutive = false;
     int max_counter = 0;
     int temp_counter = 0;
         
     if(test_case.length == 1) //if only only argument is present then the following will occur
     {
       if(test_case[0] == boolean_to_check)
       {
         result[0] = 1 ; // true found, size of max_counter will be 1;
         result[1] = 0 ; // true will be at first place;
       }
       else
       {
         return result;
       }
     }
     
      for ( int i =  0; i< test_case.length; i++) //for arguments >1 it runs the for loop to assign them in new array of returns.                                                    
      {
        result[i] = -1;
      }
     
     for ( int i =  0; i< test_case.length; i++) //checking for trues and false within the test_case array and assigning position to result array respectively.                                                   
     {
       boolean current_boolean = false;

       if(i == 0)
       {
         current_boolean = test_case[i];
         if(boolean_to_check == current_boolean) 
         {
             result[current_result_position] = i;
             temp_counter++;  
             current_result_position++;
             is_consecutive = true; //checking for consecutive occurences
         }
       }
       else
       {
         current_boolean = test_case[i];
         if(current_boolean == boolean_to_check)
         {
           if(!is_consecutive)
           {
             result[current_result_position] = i;
             current_result_position++;
           }
           temp_counter++;
           is_consecutive = true;
         }
         else
         {
           is_consecutive = false;
           if(max_counter < temp_counter)
           {
             max_counter = temp_counter;
           }
           temp_counter = 0;
         }
      }       
     }
     
     if(max_counter < temp_counter) //checking for highest streak everytime loop repeats.
     {
         max_counter = temp_counter;
     }
     
     result[0] = max_counter; //position maxcounter as first entry to return array 
     
     return result;
 }
}