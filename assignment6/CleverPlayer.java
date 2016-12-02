/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 Clever plays corners and centres if not then it plays random try to win or draw
 **/


public class CleverPlayer extends Player{
  public int playingAs = 0;
  int play = 0;  
  
  
  /**
   * Plays a valid move based on the current state of the Tic-Tac-Toe game.
   * 
   * @param grid is the current state of the game
   * @param 
   * @return an integers between 1 and 9 (inclusive) that represents this
   *         players move on the current grid.
   */
  
  public int play(Grid grid){
    play += 1; 
    int [] positions = {1,3,7,9}; 
    
    int nextPosition = 0; // the variable that will be returned at the end of the method 
    if (grid.getGridElement(positions[0]) !=grid.EMPTY){
      nextPosition = positions[0];  
    } // if statement 
    else {
      
      if (grid.getGridElement(positions[1]) !=grid.EMPTY){
        nextPosition = positions[1];  
      } // if statement 
      
      else {
        
        if (grid.getGridElement(positions[2]) !=grid.EMPTY){
          nextPosition = positions[2];  
        } // if statement 
        
        
        else{
          
          if (grid.getGridElement(positions[3]) !=grid.EMPTY){
            nextPosition = positions[3];  
          } // if statement 
          
          
          
          else { 
            if (grid.getGridElement(5) !=grid.EMPTY){
              nextPosition = 5; 
            } // if statement 
            
            else{
              
              boolean a = false; 
              while (a != true) {
                nextPosition =  1 + (int)(Math.random()*9); 
                if (grid.getGridElement(nextPosition) !=grid.EMPTY){
                  nextPosition = nextPosition;
                  a= true; 
                } // if statement 
                
                
              } //while loop 
              
              
            } //else
          }
        }
      }
    }
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
      
    } 
    if (symbol == Grid.X){
      
      this.playingAs= -1;
      
    }     
  }
}