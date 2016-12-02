/**
 COMP1006/1406 - Summer 2014
 Assignment 5, Problem 2
 
 name:Muhammad Mustafa
 id:100823576
 date:25/07/2014
 
// Purpose: to play a valid crazy-eights card
// Preconditions: hand consists of 1 or more cards (your hand)
//                topCard is the (face up) card on the discard pile
// Postconditions: returns a card that is a valid play based on the topCard
// Side Effects: if you don't have a valid card, you can pick up a card using the 
//               pickUp() method (from the PickUp class).  You can repeatedly pick
//               up cards until you can play a card.
// Valid plays are de ned as follows: (let top be the (face up) card on the discard pile)
1. Any card that has the same suit as top
2. Any card that has the same rank as top
3. Any card with rank 8
   
EXAMPLE:
Card[] hand = new Card[]{ new Card(3, "Spade"), new Card(8, "Heart")};
nextCard(hand, new Card(7, "Diamond"));
returns ---> 8H
nextCard(hand, new Card(2, "Spade"));
returns ---> 3S
nextCard(hand, new Card(3, "Club"));
returns ---> 3S
hand = new Card[]{ new Card(3, "Spade"), new Card(6, "Heart")};
nextCard(hand, new Card("King", "Diamond"));
returns pickUp() returns ----> 10D
 
**/



public class NextCard{
  
  public static Card nextCard(Card[] hand, Card topCard){
    
    Card answer = null; 
    boolean verifier = false; //default checking boolean
    
    //Running through an array
    for ( int i = 0; i < hand.length; i++){
      
      //Checking elements in the array IF any rank OR suit is same
      if ((hand[i].getRank() == topCard.getRank()) || (hand[i].getSuit() == topCard.getSuit())){        
        
        answer = hand[i]; 
        verifier= true; 
        
      }// End of if      
    } //End of for 
    
    if (verifier == false){ 
      
      for ( int i = 0; i < hand.length; i++){
        
        //Checking if any in hand is of rank 8
        if ((hand[i].getRank() == 8)){          
          
          answer = hand[i]; 
          verifier= true; 
        }// End of if        
      }// End for   
    }// End if
    
    if (verifier = false){
      
      //IF nothing in hand works keeps picking up random cards from PickUp
      while (verifier == false){
        
        Card playableCard = PickUp.pickUp(); 
        
        //Checks if either the ranks mathc OR suits match OR if the rank is 8
        if ((playableCard.getRank() == topCard.getRank()) || (playableCard.getSuit() == topCard.getSuit()) || (playableCard.getRank() != 8)){
          
          verifier = true;
          answer = playableCard;
          
        }
      }
    }
    
    return answer; 
    
  }
}





