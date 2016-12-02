/**
 COMP1006/1406 - Summer 2014
 Assignment 5, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:25/07/2014
 
// A standard deck of playing cards consists of 52 cards. Each card has a rank (2, 3, . . . , 9, 10, Jack, Queen, King, or Ace)
   and a suit (spade, heart, club, or diamond).
// For this assignment, we will give the following ordering to both the suits and ranks of the cards:
   /suits: The suits will be ordered
   diamonds < clubs < hearts < spades
   /ranks: The ranks will be ordered
   2 < 3 <.....< 9 < 10 < Jack < Queen < King < Ace
// The overall ordering is specified by suit  first and then rank; 
   for example, so all club cards
   are \less than" all heart cards.
// Two cards with the same rank and suit are considered equal.
   
EXAMPLE:
Card c = new Card("Queen", "Diamond");
System.out.println(c)--->12D
card d = new Card("4", "Spade");
c.compareTo(d);
evaluates to -1
d.compareTo(c);
evaluates to 1
card e = new Card("Jack", "Spade");
d.compareTo(e);
evaluates to-1
e.getRank();
evaluates to 11
e.getSuit();
evaluates to "Spade"
 
**/

public class Card extends AbstractCard {
  
  int myRank; //declaring variable for rank of card to be used in class card
  String mySuit; //declaring variable for suit of card in the class card
  
  
// Constructor: Initializes the rank and suit of the current card
// If suit is one of "Spade", "Heart", "Club", or "Diamond"
// and rank is one of "2",..., "9", "10", "Jack", "Queen", "King" or "Ace"
// Then the current card is initialized to the given card
// Otherwise, the current card is initialized to the "2" of "Diamond"
  
  public Card(String rank, String suit){
    
    //CHECKING FOR RANKING 
    //IF rank is any one the following "ACE""KING""QUEEN""JACK"" does the following
    if (rank.equals("Ace")){ 
      
      this.myRank = 1; //highest rank is Ace
      
    } // End of if    
    
    if (rank.equals("King")){
      
      this.myRank =13 ;
      
    } // End of if    
    
    if (rank.equals("Queen")){
      
      this.myRank = 12; 
      
    } // End of if    
    
    if (rank.equals("Jack")){
      
      this.myRank = 11; 
      
    } // End of if
    
    //CHECKING IF RANK IS ANYTHING ELSE BESIDES ACE, JACK, KING and QUEEN
    if (!rank.equals("Queen") && !rank.equals("Jack") &&  !rank.equals("King") && !rank.equals("Ace"))  {
      
      //CHECKING IF RANK IS BETWEEN ANY OF THE NUMBERS IN THE DECK
      if( (Integer.parseInt(rank)) <= 10 && (Integer.parseInt(rank)) >= 2){ 
        
        this.myRank = (Integer.parseInt(rank));
        
      }  // End of if      
      
      else {
        
        this.myRank = 2; //Default rank will be 2 if range doesn't qualify
        
      } // End of else  
      
    } //End of else
    
    //CHECKING IF WRONG TEXT IS PUT IN
    if (!suit.equals("Diamond") &&  !suit.equals("Club") && !suit.equals("Heart") && !suit.equals("Spade")){
      
      this.mySuit = "Diamond"; //Default suit as Diamond
      
    } // End of if))
    
    else{
      
      this.mySuit = suit; 
      
    } // END OF ELSE 
    
  } // END OF CONSTRUCTOR
  
  
// Constructor: Initializes the rank and suit of the current card
// If suit is one of "Spade", "Heart", "Club", or "Diamond"
// and rank is one of 1,2,3,4,5,6,7,8,9,10,11,12 or 13
// then the current card is initialized to the given card
// Otherwise, the current card is initialized to the "Ace" of "Spade" 
  
  public Card(int rank, String suit){
    
    
    if(rank <= 13 && rank >= 1){ 
      
      this.myRank = rank; 
      
    }  // END OF if(rank <= 10 && rank >= 1){ 
    
    else {
      
      this.myRank = 1;  
      
    } // END OF ELSE 
    
    
    if (!suit.equals("Diamond") &&  !suit.equals("Club") && !suit.equals("Heart") && !suit.equals("spades")){
      
      this.mySuit = "Spade"; 
      
    } // END OF (!suit.equals("Jack") ||  !suit.equals("Queen") || !suit.equals("King") || !suit.equals("Ace"))
    
    else{
      
      this.mySuit = suit; 
      
    } // END OF ELSE 
    
  } // END OF CONSTRUCTOR  public Card(String rank, String suit){
  
  
  
  @Override
  public int compareTo(AbstractCard j) {
    
    int tempRank1=0;
    int tempRank2=0; 
    int answer = 0; 
    
    String [] arrayOfCards=  { "Diamond", "1" ,"Club", "2", "Heart", "3", "Spade", "4" }; 
    
    for (int i = 0; i < arrayOfCards.length; i=i+1){
      
      if (this.getSuit().equals(arrayOfCards [i])){ 
        
        tempRank1 = Integer.parseInt(arrayOfCards[i+1]);
        
      } // end of if statement 
      
    } // end of for loop 
    
    
    for (int i = 0; i < arrayOfCards.length; i=i+1){
      
      if (j.getSuit().equals(arrayOfCards [i])){ 
        
        tempRank2 = Integer.parseInt(arrayOfCards[i+1]);
        
      } // end of if statement 
      
    } // end of for loop     
    
    if (tempRank1 > tempRank2){ 
      
      answer = 1; 
      
    } //End of if  
    
    if (tempRank1 < tempRank2){
      
      answer = -1;
      
    } // end of if     
    
    else { 
      if (tempRank1 == tempRank2){ 
        
        if ((this.getRank()== 1) || (j.getRank() == 1)){ 
          
          if(this.getRank() ==1){
            
            answer = 1; 
            
          }// End of if          
          
          if (j.getRank() ==1){
            
            answer = -1;
            
          }// End of if
          
        } // End of if       
        
        else {          
          
          if (this.getRank() > j.getRank()){
            
            answer= 1;
          } // end of if 
          
          else {
            
            answer = -1; 
            
          } //end of else 
          
        } // end of else 
        
      }
      
    } //  End of if
    
    
    return answer; 
    
  } // End of compareTo 
  
  public int getRank(){
    
    return this.myRank;  
  }
  
  public  String getSuit(){
    
    return  this.mySuit;
  }
  
}

