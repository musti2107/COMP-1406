/**
 COMP1006/1406 - Summer 2014
 Assignment 3, Problem 2
 
 name:Muhammad Mustafa
 id:100823576
 date:18/07/2014
 
 // Writing a Java program called TestPerson. This program runs ?ve (di?erent) test
 cases for the toString() method in the Person class.
 // Writing a Java class called Person with methods and constructors.
 // For each test case the testing program should output (to standard output) the constructor call 
 (to create the person), expected and actual output toString() call, and a determination in the test was successful or not 
 
 Examples:
 Test 1
 p = new Person("AlfRED", "edward", "Newmann", 73, 123)
 expected output : "NEWMANN, Alfred Edward: 73 years old, 1.23 metres tall."
 actual output : "NEWMANN, Alfred Edward: 73 years old, 1.23 metres tall."
 test passed : true
 Test 2
 p = new Person("AlfRED", "Newmann", 73, 123)
 expected output : "NEWMANN, Alfred: 73 years old, 1.23 metres tall."
 actual output : "NEWMANN, Alfred : 73 years old, 1.23 metres tall."
 test passed : false 
 
 **/

public class TestPerson{ 
  
  public static void main (String [] args){
    
    //TEST 1 with middle name and both being of same format
    Person p = new Person("AlfRED", "edward", "Newmann", 73, 123); //new object "p" 
    String x = "\"NEWMANN, Alfred Edward: 73 years old, 1.23 meters tall.\""; // Expected string that will be compared to to.String
    
    System.out.println("Test 1");    
    
    System.out.println("p = new Person(\"AlfRED\", \"edward\", \"Newmann\", 73, 123)");
    
    System.out.println("Expected output: "+ x); //prints out Expected String
    
    System.out.println("  Actual output: " + p.toString()); //Prints out Actual input String
    
    //Comparing the strings to see if they are equal using the .equals method
    String d= p.toString();
    
    if (x.equals(d)){
      
      System.out.println("    test passed: true"); //if they are equal it prints "true".
      
    } else{
      
      System.out.println("    test passed: false"); //if they are not equal it prints "false".
      
    }//END OF IF STATEMENT
    
    System.out.println();
    
    //TEST 2 without middle name and character error
    Person pp = new Person("AlfRED", "Newmann", 73, 123); //new object "pp" 
    String xx = "\"NEWMANN, Alfred : 73 years old, 1.23 meters tall.\""; // Expected string that will be compared to to.String
    
    System.out.println("Test 2");    
    
    System.out.println("p = new Person(\"AlfRED\", \"Newmann\", 73, 123)");
    
    System.out.println("Expected output: "+ xx); //prints out Expected String
    
    System.out.println("  Actual output: " + pp.toString()); //Prints out Actual input String
    
    //Comparing the strings to see if they are equal using the .equals method
    String dd= pp.toString();
    
    if (xx.equals(dd)){
      
      System.out.println("    test passed: true"); //if they are equal it prints "true".
      
    } else{
      
      System.out.println("    test passed: false"); //if they are not equal it prints "false".
      
    }//END OF IF STATEMENT
    
    System.out.println();
    
    //TEST 3 with a careless spelling mistake in the height (metres/meters)
    Person pb = new Person("AlfRED", "Newmann", 73, 123); //new object "pb" 
    String xb = "\"NEWMANN, Alfred: 73 years old, 1.23 metres tall.\""; // Expected string that will be compared to to.String
    
    System.out.println("Test 3");    
    
    System.out.println("p = new Person(\"AlfRED\", \"Newmann\", 73, 123)");
    
    System.out.println("Expected output: "+ xb); //prints out Expected String
    
    System.out.println("  Actual output: " + pb.toString()); //Prints out Actual input String
    
    //Comparing the strings to see if they are equal using the .equals method
    String db= pb.toString();
    
    if (xb.equals(db)){
      
      System.out.println("    test passed: true"); //if they are equal it prints "true".
      
    } else{
      
      System.out.println("    test passed: false"); //if they are not equal it prints "false".
      
    }//END OF IF STATEMENT
    
    System.out.println();
    
    //TEST 4 with a Caps mistake
    Person ab = new Person("Muhammad", "Mustafa", "Qureshi", 22, 189); //new object "ab" 
    String cb = "\"QURESHI, Muhammad MUstafa: 22 years old, 1.89 metres tall.\""; // Expected string that will be compared to to.String
    
    System.out.println("Test 4");    
    
    System.out.println("p = new Person(\"Muhammad\", \"Mustafa\", \"Qureshi\", 22, 189)");
    
    System.out.println("Expected output: "+ cb); //prints out Expected String
    
    System.out.println("  Actual output: " + ab.toString()); //Prints out Actual input String
    
    //Comparing the strings to see if they are equal using the .equals method
    String eb= pb.toString();
    
    if (cb.equals(eb)){
      
      System.out.println("    test passed: true"); //if they are equal it prints "true".
      
    } else{
      
      System.out.println("    test passed: false"); //if they are not equal it prints "false".
      
    }//END OF IF STATEMENT
    
    System.out.println();
    
    //TEST 5 with a punctuation error (.)
    Person zb = new Person("Muhammad", "Mustafa", "Qureshi", 22, 189); //new object "zb" 
    String yb = "\"QURESHI, Muhammad Mustafa: 22 years old, 1.89 metres tall\""; // Expected string that will be compared to to.String
    
    System.out.println("Test 5");    
    
    System.out.println("p = new Person(\"Muhammad\", \"Mustafa\", \"Qureshi\", 22, 189)");
    
    System.out.println("Expected output: "+ yb); //prints out Expected String
    
    System.out.println("  Actual output: " + zb.toString()); //Prints out Actual input String
    
    //Comparing the strings to see if they are equal using the .equals method
    String wb= zb.toString();
    
    if (yb.equals(wb)){
      
      System.out.println("    test passed: true"); //if they are equal it prints "true".
      
    } else{
      
      System.out.println("    test passed: false"); //if they are not equal it prints "false".
      
    }//END OF IF STATEMENT
    
    System.out.println();    
  }
}


