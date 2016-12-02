//import java.util.Arrays;

/**
 COMP1006/1406 - Summer 2014
 Assignment 4, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:21/07/2014
 
 // Creating a class that will be used by a real estate company to represent a house that
    is for sale. A house should have an address, an asking price (the desired price by the seller),
    the size of the house (in square feet), and any additional features the house might have (pool,
    new roof, close to transit, etc).
 // a Java class called House, withmethods and constructors.
 
 Examples:
 House h = new House("123 Sesame St", 2500, 40003)
 h.addFeatures( new String[]{"great neighbours", "lots of monsters"})
 h.getAskingPrice() -----> "2500"
 h.makeOffer(1200) ------> "false"
 h.makeOffer(2560) ------> "true"
 
 **/

public class House{
  
  private String address;
  private long askingPrice;
  private long squareFeet;
  private String[] features;
  private int offerCount = 0; //count for offers
  private boolean isSold = false; //initializing to false
  
  /**********************************************/
  /* getters                                    */
  /**********************************************/
  public String getAddress(){
    // returns the address of the current house
    
    return address;
  }
  
  public long getAskingPrice(){
    // return the asking price of the current house
    
    return askingPrice;
  }
  
  public long getSquareFeet(){
    // returns the size of the current house (square feet)
    
    return squareFeet;
  }
  
  public String[] getFeatures(){
    // returns all the features of the current house
    // the order of the features in the array do not matter
    
    return features;
  }
  
  
  /**********************************************/
  /* setters                                    */
  /**********************************************/
  public void addFeatures(String[] features){
    // adds all strings in the input 'features' 
    // to the current list of features 
    // (the order of the features does not matter)
    
    //checks if input features array null or empty
    if (features == null || features.length == 0){
      return;
    }//exits method
    
    //checks if current array for features is null
    if (this.features == null){
      
      this.features = new String[features.length] ; //initializing the features array as it is null
      
      //adding new features to current initialized features array
      for (int i=0; i<this.features.length; i+=1){
        
        this.features [i] = features [i];
      }//end of for loop
      
    }//end of if statement 
    
    else {
      
      String[] tempFeatures = this.features; //temporary array for existing features
      
      this.features = new String[features.length + this.features.length]; //creating array of length icnluding old and new features array length
      
      //Copies features existing in tempfeatures to new array       
      for (int i=0; i<tempFeatures.length; i+=1){
        
        this.features [i] = tempFeatures [i];
      }//end of 1st for loop
      
      //Copies features after the temp features to new array
      for (int i=tempFeatures.length; i<this.features.length; i+=1){
        
        this.features [i] = features [i-tempFeatures.length];
        
      }//end of 2nd for loop
    }//end of else
    
  }//end of method
  
  public void updateAskingPrice(long newPrice){
    // updates the asking price for the current house
    // with the value 'newPrice'
    //
    // Side effect: the number of offers less than
    //              but within 10% of the asking price
    //              is reset to zero each time the 
    //              asking price is updated.
    // (See makeOffer(long) for more details about the offers)
    
    this.askingPrice = newPrice;
    offerCount = 0;
  }
  
  
  /**********************************************/
  /* constructors                               */
  /**********************************************/
  public House(String address, long askingPrice, long sqFeet){
    // initializes house with provided address, asking price and size (square feet)
    
    this.address = address;
    this.askingPrice = askingPrice;
    squareFeet = sqFeet;
  }
  
  public House(String address, long askingPrice, long sqFeet, String[] features){
    // initialized house with provided address, asking price, size
    // and list of features
    
    this.address = address;
    this.askingPrice = askingPrice;
    squareFeet = sqFeet;
    this.features = features;
  }
  
  
  /**********************************************/
  /* instance methods */
  /**********************************************/
  public boolean makeOffer(long offer) {
    // returns true if offer is greater than or equal to the asking price AND
    // the house has not been sold yet. 
    //
    // returns false if the offer is less than the asking price OR if the 
    // house is already sold.
    //
    // Side effects:
    // 1) When this method returns true, the house has been sold. All subsequent 
    //    calls to isSold() must return true.
    // 2) When this method returns true, all subsequent calls to makeOffer() 
    //    must return false
    //
    // The following applies when the house has not been sold yet.
    // 3) If the offer is less than the asking price, but it is within 10%
    //    of it AND this is the fifth offer that satisfies this requirement for 
    //    this asking price, then the asking price is reduced by 5%. (The method still returns false.)
    //    The count of offers within 10% is reset to zero (for this new price).
    // 
    //    The new reduced price is (current asking price) - rounded(0.05 * current asking price)
    
    
    //if the house is not sold and the offer is greater than or equal to the askingPrice
    if ( !isSold() && offer >= askingPrice){
      
      isSold = true; //house Sold
      
      return true; //offer accepted
      
    }//end of if statement 
    
    offerCount+=1; //keeps track of number of offers made
    
    long rangePrice = Math.round(0.9 * askingPrice); //this calulates the range within which the new askingPrice lies
    
    if(rangePrice <= offer && offerCount ==5){
      
      askingPrice = askingPrice - Math.round(0.05 * askingPrice); //prece reduced by 5%
      offerCount = 0; //offer count set to zero after 5 offers are made
      
    }//end of if statement
    
    return false; //offer not accepted
  }//end of method
  
  public boolean isSold(){
    // returns true if the house is sold (an offer has been accepted)
    // returns false if the house is not sold (no offer has been accepted)
    return isSold;
  }
  
  
  /**********************************************/
  /* overridden methods from Object */
  /**********************************************/
  @Override
  public String toString(){
    // returns a string that represents the current house 
    // in the form:
    //    "address, $askingPrice, squareFeet ft^2"
    // Example: 
    //    h = new House("123 Sesame Street", 1243, 400);
    //    h.toString() returns the string
    //    "123 Sesame Street, $1243, 400 ft^2"
    
    String message = address + ", $"+askingPrice + ", " + squareFeet + " ft^2";
    return message; 
  }
  
}