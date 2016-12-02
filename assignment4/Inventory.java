/**
 COMP1006/1406 - Summer 2014
 Assignment 4, Problem 2
 
 name:Muhammad Mustafa
 id:100823576
 date:21/07/2014
 
 // The real estate company will keep an inventory of houses that it has for sale (or recently sold).
    Created a class to keep track of this inventory of House objects.
 // Writing a Java class called Inventory. The class has methods and constructors.
 
 **/

import java.util.Arrays;  // // needed for toString() method

public class Inventory{
  
  private House [] house; 
  
  /**************************************************/
  /* getters                                        */
  /**************************************************/
  
  
  public House[] getHouses(){
    // returns an array of all the unsold houses in the inventory
    // (the order of the houses in the array does not matter)
    
    int count = 0; // counter to determine the length of the array that will be returned 
    
    for (int i = 0;  i < this.house.length;i+=1){ 
      
      if (!house[i].isSold()){ 
        
        count+=1; // if the house is not sold it will count them 
        
      }// end of if statement  
    }// end of for loop 
    
    House [] unSold = new House [count]; // initialize the new array with the length [count]; number of houses not sold.
    // return this array. 
    
    count = -1;  // count will now start from 0  because we want the first object to be placed on array at [0] index                  
    
    for (int i = 0;  i < this.house.length; i+=1){ 
      
      if (!house[i].isSold()){ // checks if the house is not sold 
        
        count+=1;  //add to the count, first time count goes up .. it will be 0 
        unSold[count] = house[i]; // add to unSold array starting at correct index of "0"
        
      }// end of if statement 
    } // end of for loop 
    
    return unSold; // return the array 
  } // end of method 
  
  public House[] getHouses(long lowerPriceRange, long upperPriceRange){
    // returns an array containing all the unsold houses in the inventory such that
    // lowerPriceRange <= asking price <= upperPriceRange 
    // (the order of the returned houses does not matter)
    
    
    
    // The method to this is the same as done above, but with an additions "IF" statement to satisfy the conditions
    
    int count = 0; 
    
    for (int i = 0;  i < this.house.length; i+=1){
      
      if (!house[i].isSold() && house[i].getAskingPrice() >= lowerPriceRange && house[i].getAskingPrice() <= upperPriceRange){
        
        count+=1; 
      }// end of if statement 
      
    }// end of for loop 
    
    House [] unSold = new House [count]; 
    count = -1; 
    
    for (int i = 0;  i < this.house.length; i+=1){    
      
      if ((!house[i].isSold()) && (house[i].getAskingPrice() >= lowerPriceRange) && (house[i].getAskingPrice() <= upperPriceRange)){
        
        count += 1; 
        unSold[count] = house[i]; 
        
      }// end of if statement 
    }// end of for loop 
    
    return unSold;    
  } // end of method 
  
  public House[] getHouses(long sqFeet){
    // returns an array containing all the unsold houses in the inventory with 
    // size (square feet) >= sqFeet
    // (the order of the returned houses does not matter)
    
    
    // The method to this is the same as done above, but with an additions "IF" statement to satisfy the conditions
    
    int count = 0; 
    
    for (int i = 0;  i < this.house.length; i+=1){
      
      if (!house[i].isSold() && house[i].getSquareFeet() >= sqFeet) {
        
        count += 1; 
      } // end of if statement 
      
    }// end of for loop 
    
    House [] unSold = new House [count];
    count = -1; 
    
    for (int i = 0;  i < this.house.length; i+=1){
      
      if (!house[i].isSold() && house[i].getSquareFeet() >= sqFeet) {
        
        count = count +1; 
        unSold[count] = house[i]; 
      } // end of if statement 
      
    }// end of for loop 
    
    return unSold;
  }// end of method 
  
  public House[] getHouses(String thisFeature){    
    // returns an array containing all the unsold houses in the inventory 
    // that have thisFeature as a feature.
    // (the order of the returned houses does not matter)
    
    
    int count = 0; 
    
    for (int i = 0;  i < this.house.length; i++){
      
      if (house[i].getFeatures() != null){ // if statement to check if the getFeatures() exists or not
        
        for (int j = 0; j < house[i].getFeatures().length; j+=1){ // loop to go over the feature []  of the present house 
          
          if (house[i].getFeatures()[j].equals(thisFeature)){
            
            count +=1; 
          } // end of if statement                                         
        } //end of j for loop 
      }// end of if statement to check if the getFeatures() doesn't return a null array 
    } //end of i for loop 
    
    House [] unSold = new House [count]; 
    count = -1;  
    
    for (int i = 0;  i < house.length; i+=1){
      
      
      
      if (house[i].getFeatures() != null){    // if statement to check if the getFeatures() doesn't return a null array or program will throw a null pointer error
        
        for (int z = 0; z < house[i].getFeatures().length; z+=1){ // loop to go over the feature []  of the present house 
          
          if (house[i].getFeatures()[z].equals(thisFeature)){ // string equality test .. comparing String in getFeatures() and String inputed in (thisFeature) 
            
            count +=1; 
            unSold[count] = house[i]; 
          } // end of string equality test .. if statement 
          
        } // end of loop z               
      }// end of if statement to check if the getFeatures() doesn't return a null array
    }// end of for loop i 
    
    return unSold;
    
  }// end of the method 
  
  public House[]  getAllHouses(){
    // returns an array containing all houses in the inventory (both sold and unsold)
    // (the order of the returned houses does not matter)
    
    return this.house; 
  }
  
  public String[] getAddresses(){    
    // returns an array of the address of all the houses in the inventory (both sold and unsold)
    // (the order does not matter; there may be more than one house with the same address)
    
    String [] adrs = new String [this.house.length]; // [] adrs set to the size of the houses 
    
    
    for (int i = 0; i < this.house.length; i+=1){ 
      
      adrs[i] = this.house[i].getAddress(); // get addresses of each house object 
      
    }// end of for loop 
    
    return adrs; 
    
  } // end of the method 
  
  
  
  
  /**************************************************/
  /* setter methods                                */
  /**************************************************/
  public House [] addHouse(House newHouse){    
    // adds newHouse to the current inventory
    
    //inputs data in newly created array
    House houseList [] = {newHouse};
    
    //checks if input array is null or empty
    if (houseList == null || houseList.length == 0){
      return null;
    }//exits method
    
    //checks if current array for house is null
    if (this.house == null){
      
      this.house = new House [houseList.length] ; //initializing the house array as it is null
      
      //adding new houses to current initialized house array
      for (int i=0; i<this.house.length; i+=1){
        
        this.house [i] = houseList [i];
      }
      
    } else {
      
      House[] tempList = this.house; //temporary array for existing houses
      
      this.house = new House[houseList.length + this.house.length]; //creating array of length including old and new house array length
      
      //Copies houses existing in tempList to new array       
      for (int i=0; i<tempList.length; i+=1){
        
        this.house [i] = tempList [i];
      }
      
      //Copies features after the tempList to new array
      for (int i=tempList.length; i<this.house.length; i+=1){
        
        this.house [i] = houseList [i-tempList.length];
        
      }
    }//END OF ELSE
    
    return this.house;
    
  } // END OF METHOD
  
  
  /**ALTERNATIVE METHOD
    if (this.house.length == 0){   // if there is no house present in the inventory 
    
    House [] houseList = { newHouse};  // just make a new array [] houseList and add newHouse to it 
    
    
    this.house = Arrays.copyOf(houseList, houseList.length); // copy houseList to [] this.house  
    
    Arrays.fill(houseList, null);// make sure [] houseList is null after it is used 
    } // end of if statement (if length = 0) 
    
    else{
    
    
    if (this.house.length ==1){
    
    House [] tempList = Arrays.copyOf(this.house , this.house.length); // make a [] tempList holder 
    
    this.house = new House [ tempList.length + 1 ]; // re-initialize the []this.house with a different length
    
    this.house[0] = tempList [0]; // first index 0 of []this.house will be the the first index 0 of tempList 
    
    this.house [1]=newHouse; // and at index 1.. add the new house 
    
    } // end of if statement for length = 1 
    
    
    else{ 
    
    if (this.house.length >=2){ // for cases of 2's and over 2's length 
    House [] tempList = Arrays.copyOf(this.house , this.house.length); // temp holder of the pre-existing array
    
    this.house = new House [ tempList.length + 1 ]; // re-initialize the []this.house with a different length
    this.house[this.house.length-1] = newHouse; // add newHouse to the end of the array 
    
    for (int i = 0; i < (tempList.length); i++){ // go over the holder [] tempList array and add all of them to this.house [] 
    
    this.house[i]= tempList[i];}
    
    
    } //end of if statement to check the length of array >=2 
    } // end of else just above the if statement to check the length of array >=2 
    
    } // end of else statement above the  if statement for length = 1  
    
    
    return this.house;
    
    }// end of the method */
  
  
  /**************************************************/
  /* constructors                                   */
  /**************************************************/
  
  
  public Inventory(){
    // creates empty inventory
    
    House [] house= {};
    
    this.house = Arrays.copyOf(house , house.length);
  }
  
  public Inventory(House[] houses){
    
    this.house = houses; 
    // initialized inventory with the house objects in the input array 
  }
  
  
  
  
  
  
  /**************************************************/
  /* overridden methods from Object                 */
  /**************************************************/
  @Override
  public String toString(){
    // returns a String representation of the inventory
    
    // Do not change this method
    
    String[] addresses = this.getAddresses();
    int len = 0;
    if(addresses != null){
      // don't try to access 'length' attribute unless there is 
      // an actual array object
      len = addresses.length;
    }
    
    String output = "<<";
    
    if(len > 0){
      Arrays.sort(addresses);  // sort the array
      for(int i=0; i<len-1; i+=1){
        output = output + addresses[i] + "||"; 
      }
      output = output + addresses[len-1];
    }
    output += ">>";
    
    return output;
  }
  
  
  
}