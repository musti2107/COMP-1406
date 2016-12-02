/**
 COMP1006/1406 - Summer 2014
 Assignment 3, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:18/07/2014
 
 // Considering a class that represents a person. Each person will have a name (consisting of a ?rst
 name, middle name, and a surname), an age and a height.
 // Writing a Java class called Person with methods and constructors.
 
 Examples:
 Person p = new Person("CHARLES", "erNEST", "Gooda", 21, 234);
 p.toString() returns ----> "GOODA, Charles Ernest: 21 years old, 2.34 metres tall."
 p.getName() returns ----> "Charles E. Gooda"
 p.getHeightFeetAndInches() returns ----> [7,8]
 
 **/

public class Person{
  
  // assigning variables to the int and strings being used
  
  private String firstName; 
  private String middleName; 
  private String lastName; 
  private int age; 
  private int height; 
  
  /***********************************************************************************/
  /*****************************  CONSTRUCTORS   *************************************/
  /***********************************************************************************/
  
  public Person(String first, String middle, String surname, int a, int h){    
    // constructor that initializes the person's information
    
    firstName = first; // first - first name 
    middleName = middle; // middle - middle name
    lastName = surname; // surname - surname
    age = a; // age - age in years
    height = h; // height - height in cm
  }
  
  public Person(String first, String surname, int a, int h){    
    // constructor that initializes the person's information 
    
    firstName = first; // first - first name 
    middleName = ""; // middle - middle name
    lastName = surname; // surname - surname
    age = a; // age - age in years
    height = h; // height - height in cm
  }
  
  public Person(){    
    // creates the (default) person such that their 
    
    this.firstName = "Cat"; // first name is "Cat"
    this.middleName= "Eel"; //middle name is "Eel"
    this.lastName= "Dog"; // surname is "Dog"
    this.age= 99; //age is 99 years
    this.height = 17; // height is 17 cm
  }
  
  //*****************************************************************************//
  //*****************************   GETTERS  ************************************//
  //*****************************************************************************//
  
  public String getName(){
    
    // purpose: returns the name of the person
    // preconditions: none
    // postconditions: the person's name is returned as a String
    //                 in the following format:
    //               - first (capitalized) name followed by a space, 
    //                 followed by middle initial (capitalized),
    //                 followed by a dot ".",
    //                 followed a space followed by surname (capitalized).
    //               - if the middle name was empty ("") then 
    //                 first name followed by a space followed by surname
    //                 (both capitalized)
    //
    // examples: if the name was (first middle last)
    //  - Cat Eel Dog then it would return "Cat E. Dog"
    //  - Cat Dog (no middle name) then it would return "Cat Dog"
    
    
    String n = "";
    
    if (this.middleName.length() > 0){
      
      n =  "\"" + this.firstName.substring(0,1).toUpperCase() + this.firstName.substring(1).toLowerCase() +  " " + 
        this.middleName.substring(0,1).toUpperCase() + ". " + this.lastName.toUpperCase() + "\""; 
      
    } 
    
    if (this.middleName.length() == 0){
      
      n = "\"" + this.firstName.toUpperCase() + " " +  this.lastName.toUpperCase() + "\"";  
      
    }
    
    return n;  
    
  }
  
  public int  getHeight(){
    // returns the person's height (in centimetres)
    
    int ht = this.height;  
    
    return ht;
  }
  
  public int[]  getHeightFeetAndInches(){
    
    // purpose: returns the person's height in feet and inches
    // postconditions: returns an array of length 2
    //                 - first element is the exact number feet
    //                 - second element is the rounded number of 
    //                   remaining inches.
    //
    // Note: 1 foot = 12 inches
    //       1 inch = 2.54 cm
    // 
    // example: if the person's height is 126cm then their hight 
    //          is 4 feet and 1.6063 inches.  Thus the returned 
    //          array will be [4,2] (for 4 feet and 2 inches)
    
    
    int ft= (int)(((double)this.height) / (2.54*12.0));
    int in =(int)(((double)this.height % (2.54*12.0) / 2.54)); 
    
    int[] anArray= {ft, in}; 
    
    return anArray; 
    
  }
  
  public int    getAge(){
    // returns the persons age in years
    
    int ag = this.age; 
    return ag;
  }
  
  //****************************************************************************//
  //*****************************  SETTERS  ************************************//
  //****************************************************************************//
  
  public void   setFirstName(String first){
    // sets the person's first name to 'first'
    
    this.firstName=first; 
  }
  
  public void   setMiddleName(String middle){
    // sets the person's middle name to 'middle'
    
    this.middleName= middle; 
  }
  
  public void   setLastName(String last){
    // sets the person's surname to 'last'
    
    this.lastName = last; 
  }
  
  public void   setHeight(int hyt){
    // sets the current persons height
    // input is given in cm (centimetres)
    
    this.height = hyt; 
  }
  
  public void   setAge(int years){
    // sets the persons age to the given input (in years)
    
    this.age = years; 
  }
  
  //*****************************************************************************//
  //******************************  OVERRIDE  ***********************************//
  //*****************************************************************************//
  
  @Override
  public String toString(){     
    // overrides Object's toString() method
    // returns a String in the following format: 
    //  "SURNAME, Firstname Middlename: age years old, height metres tall."
    // of if the person has no middle name
    //  "SURNAME, Firstname: age years old, height metres tall."
    // where
    // - SURNAME is in all uppercase letters
    // - Firstname and Middlename are capitalized
    // - age is in years
    // - height is in metres with exactly
    // - 
    // example: the output might look like
    //      "DOG, Cat Eel: 12 years old, 0.23 metres tall."
    
    String b = "";
    
    if (this.middleName.length() > 0){
      
      b =  "\"" + this.lastName.toUpperCase() + ", " +  this.firstName.substring(0,1).toUpperCase() + this.firstName.substring(1).toLowerCase() +  " " 
        + this.middleName.substring(0,1).toUpperCase() + this.middleName.substring(1).toLowerCase() + ": " + this.age + " years old, " + (double)(this.height/ 100.0) + 
        " meters tall.\"";  
      
    } //  END OF (middleName.length() > 0)
    
    if (this.middleName.length() == 0){
      
      b =  "\""+ this.lastName.toUpperCase()+ ", " +  this.firstName.substring(0,1).toUpperCase() + this.firstName.substring(1).toLowerCase() + 
        ": " + this.age + " years old, " + (double)(this.height/ 100.0) + " meters tall.\"";  
      
    } // END OF (middleName.length() == 0)
    
    return b;  
    
  }
}