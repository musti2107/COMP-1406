/**
 COMP1006/1406 - Summer 2014
 Assignment 7, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:01/08/2014
 
- A stack is a data structure where data is accessed using the LIFO (last in first out) approach.
- You will use a stack to check whether a string has balanced parentheses or not.
- There are two parenthesis symbols. An opening parenthesis is the symbol “(”, and a
  closing parenthesis is the symbol “)”. A string has balanced parentheses when
a) The number of opening parentheses is equal to the number of closing parentheses. That
   is, the number of “(” symbols is equal to the number of “)” symbols.
b) Each opening parenthesis has a matching closing parenthesis coming after it in the
   string.
c) The substring between any opening parenthesis and its matching closing parenthesis
   must also have balanced parentheses.
For example,
• “x))y((z” does not have balanced parentheses. It fails both (b) or (c).
• “(hi)” does have balanced parentheses.
• “(abc(w)xyz)” does have balanced parentheses.
• “(x(.)y(.)z(.))” does have balanced parentheses.
• “(x(y)z)(w)” does have balanced parentheses.
 
 **/

import java.util.*; 

public class Balanced{
  
  public static boolean isBalanced(String string){
    // input: a non-null string
    // output: returns true if string has balanced parentheses
    //         returns false otherwise
    
    Stack<Character> s; 
    char character; 
    s = new Stack<Character>(); 
    for (int i=0; i<string.length(); i++) { 
      character = string.charAt(i); 
      
      if (character == '('){ // got open bracket 
        s.push(character); 
      }      
      
      if (character == ')')  { // got closed bracket
        if (s.empty()) 
          return false; // no open bracket for this closed one 
        char top = s.pop(); // get the last opening bracket found
        if ((character == ')') && (top != '(')){
          
          return false;
        }// wrong closing bracket for last opened one 
      } // end of if (c == ')')
    } // end of for loop 
    return s.empty(); // if there are no leftovers 
    
  }//   public static boolean isBalanced(String string){  
}