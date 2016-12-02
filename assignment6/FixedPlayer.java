/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 Write a Java class FixedPlayer that extends the Player class. This player will have a
special constructor:
 
 /**
 * Plays a valid move based on the current state of the Tic-Tac-Toe game.
 * 
 * @param grid is the current state of the game
 * @param 
 * @return an integers between 1 and 9 (inclusive) that represents this
 *         players move on the current grid.h bnm
 */


import java.util.Arrays;

public class FixedPlayer extends Player{
  
  public int playingAs = 0;
  int [] positions; 
  
  public FixedPlayer( int [] positionList) {
    
    positions = positionList; 
    
    
  } // array in the constructor to start the positions with 
  
  public int play(Grid grid){
    
    
    int nextPosition = 0; // the variable that will be returned at the end of the method 
    
    for (int i = 0 ; i< this.positions.length; i++){ // iterate through the positionList 
      
      int check = grid.getGridElement(this.positions[i]); // check if the smallest position is empty  
      if (check == Grid.EMPTY){ // if true 
        nextPosition  = this.positions[i]; // nextPosition at [i]  
        break; 
      }
    }// end of for loop  
    
    
    
    grid.setGridElement(nextPosition, this.playingAs);
    
    return nextPosition; 
    
  }// end of Play(Grid) 
  
  /**
   * sets the symbol (X or Y) that this player
   * will use for the current game
   * 
   * @param symbol is either X (for symbol 'X') or Y (for symboil 'Y')
   */
  public void playAs(int symbol){
    
    
    if (symbol == Grid.Y){
      
      this.playingAs = 1;
      
    } //end if
    
    if (symbol == Grid.X){
      
      this.playingAs= -1;
      
    } // end if    
  }
}
