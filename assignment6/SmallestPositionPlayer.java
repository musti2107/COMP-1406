/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 
Write a Java class SmallestPositionPlayer that extends the Player class. This player
will always choose the smallest empty position to make their next move in.
 **/


public class SmallestPositionPlayer extends Player{
  public int playingAs = 0;
  
  
  
  
  /**
   * Plays a valid move based on the current state of the Tic-Tac-Toe game.
   * 
   * @param grid is the current state of the game
   * @param 
   * @return an integers between 1 and 9 (inclusive) that represents this
   *         players move on the current grid.
   */
 
  public int play(Grid grid){
    
    
    int nextPosition = 0; 
    
    int [] positions= {1,2,3,4,5,6,7,8,9}; 
    
    for (int i = 0 ; i< positions.length; i++){
      
      int check = grid.getGridElement(positions[i]); 
      if (check == Grid.EMPTY){
        nextPosition = i+1; 
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
      
      this.playingAs = 1;} //if (symbol == Grid.Y)
    
    if (symbol == Grid.X){
      this.playingAs= -1;
    } // end of if (symbol == Grid.X)
    
  } // play as 
}// end of the class 
