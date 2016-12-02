/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 Write a Java class RandomPlayer that extends the Player class. This player will randomly
choose an empty position to make their next move in.
 
 * Plays a valid move based on the current state of the Tic-Tac-Toe game.
 * 
 * @param grid is the current state of the game
 * @param 
 * @return an integers between 1 and 9 (inclusive) that represents this
 *         players move on the current grid.
 */

public class RandomPlayer extends Player{
  
  public int playingAs = 0;
  
  public int play(Grid grid){
    
    int nextPosition = 0; 
    
    boolean empty = false; 
    
    //check for empty position to play
    while (empty == false){      
      
      int i =  1 + (int)(Math.random()*9); //Play random move
      int check = grid.getGridElement(i); 
      
      if (check == Grid.EMPTY){
        
        nextPosition = i;         
        grid.setGridElement(i , this.playingAs);
        break; 
        
      } // end of if loop 
      
    }// end while loop 
    
    return nextPosition; 
    
  }
  
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
