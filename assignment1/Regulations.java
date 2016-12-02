/** 
 COMP1006/1406 - Summer 2014
 Assignment 1, Problem 1

 name:Muhammad Mustafa
   id:100823576
 date:08/07/2014

 Acknowledgement of reading Section E (Chapters 14 and 15)
 of Carleton University's Academic Regulations 
 http://calendar.carleton.ca/undergrad/regulations/academicregulationsoftheuniversity/
 
 */

public class Regulations{
  
  public static void main(String[] args){
    boolean i_have_read_it_all = true;
    String  name = "Muhammad Mustafa";
    
    if( i_have_read_it_all == true){
      System.out.println("I, " + name + 
                         ", acknowledge that I have read Section E " +
                         "(chapters 14 and 15) of the Academic Regulations " +
                         "as set out by Carleton University");
    }else{
      System.out.println("I have not read it. (" + name + ")");
    }
                            
  }
 
}