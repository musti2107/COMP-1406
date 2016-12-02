/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 1
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 Write a Java class DefensivePlayer that extends the Player class. If this player's
opponent can win in one move (they have two symbols in a row currently) then this player
will block that win. Otherwise, it randomly selects an empty position. (If the opponent can
win by choosing more than one empty position, then this player must block one of them.)
 
 **/

public class DefensivePlayer extends Player{
  
  public int playingAs = 0;
  
  int [] positions; 
  int player2; 
  int nextPosition;  
  
  
  /**
   * Plays a valid move based on the current state of the Tic-Tac-Toe game.
   * 
   * @param grid is the current state of the game
   * @param 
   * @return an integers between 1 and 9 (inclusive) that represents this
   *         players move on the current grid.
   */
  
  
  
  public int play(Grid grid){
    
    //checking grid elements
    
    int one = grid.getGridElement(1); 
    int two = grid.getGridElement(2); 
    int three = grid.getGridElement(3); 
    int four = grid.getGridElement(4);
    int five = grid.getGridElement(5); 
    int six = grid.getGridElement(6); 
    int seven = grid.getGridElement(7); 
    int eight = grid.getGridElement (8); 
    int nine = grid.getGridElement (9); 
    
    if (this.playingAs == -1) {//selection of point
      
      player2= 1;
    }
    else{
      
      player2= -1; 
      
    }
    
    //// IF ONE IS EMPTY 
    if ((one == grid.EMPTY) && (two == player2) && (three==player2)) {
      nextPosition = 1; 
    }
    if ((one == grid.EMPTY) && (four == player2) && (seven==player2)){
      nextPosition = 1; 
    }
    if ((one == grid.EMPTY) && (five == player2) && (nine==player2)){
      nextPosition = 1; 
    }
    //// IF ONE IS EMPTY 
    //// IF TWO IS EMPTY 
    if ((two == grid.EMPTY) && (one == player2) && (three==player2)) {
      
      nextPosition = 2; 
    }
    if ((two == grid.EMPTY) && (five == player2) && (eight==player2)){
      nextPosition = 2; 
    }
    //// IF TWO IS EMPTY 
    //// IF THREE IS EMPTY 
    if ((three == grid.EMPTY) && (two == player2) && (one==player2)) {
      nextPosition = 3; 
    }
    if ((three == grid.EMPTY) && (five == player2) && (seven==player2)){
      nextPosition = 3; 
    }
    if ((three == grid.EMPTY) && (six == player2) && (nine==player2)){
      nextPosition = 3; 
    }
    //// IF THREE IS EMPTY 
    //// IF FOUR IS EMPTY 
    if ((four == grid.EMPTY) && (one == player2) && (seven==player2)) {
      nextPosition = 4; 
    }
    if ((four == grid.EMPTY) && (five == player2) && (six==player2)){
      nextPosition = 4; 
    }
    //// IF FOUR IS EMPTY 
    //// IF FIVE IS EMPTY 
    if ((five == grid.EMPTY) && (two == player2) && (eight==player2)) {
      nextPosition = 5; 
    }
    if ((five == grid.EMPTY) && (three == player2) && (seven==player2)){
      nextPosition = 5; 
    }
    if ((five == grid.EMPTY) && (one == player2) && (nine==player2)){
      nextPosition = 5; 
    }
    if ((five == grid.EMPTY) && (four == player2) && (six==player2)){
      nextPosition = 5; 
    }
    //// IF FIVE IS EMPTY 
    //// IF SIX IS EMPTY 
    if ((six == grid.EMPTY) && (three == player2) && (nine==player2)) {
      nextPosition = 6; 
    }
    if ((six == grid.EMPTY) && (four == player2) && (five==player2)){
      nextPosition = 6;
    }
    //// IF SIX IS EMPTY 
    //// IF SEVEN IS EMPTY 
    if ((seven == grid.EMPTY) && (eight == player2) && (nine==player2)) {
      nextPosition = 7;
    }
    if ((seven == grid.EMPTY) && (one == player2) && (four==player2)){
      nextPosition = 7;
    }
    if ((seven == grid.EMPTY) && (five == player2) && (three==player2)){
      nextPosition = 7;
    }
    //// IF SEVEN IS EMPTY 
    //// IF EIGHT IS EMPTY 
    
    if ((eight == grid.EMPTY) && (seven == player2) && (nine==player2)) {
      nextPosition = 8;
    } 
    if ((eight == grid.EMPTY) && (five == player2) && (two==player2)){
      nextPosition = 8;
    }
    //// IF EIGHT IS EMPTY 
    //// IF NINE IS EMPTY 
    if ((nine == grid.EMPTY) && (six == player2) && (three==player2)) {
      nextPosition =9 ; 
    }
    if ((nine == grid.EMPTY) && (eight == player2) && (seven==player2)){
      nextPosition = 9;
    }
    if ((nine == grid.EMPTY) && (five == player2) && (one==player2)){
      nextPosition = 9;
    }
    
    //// IF NINE IS EMPTY 
    
    grid.setGridElement(nextPosition, this.playingAs);
    
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
      
    } // end if
    
    if (symbol == Grid.X){
      
      this.playingAs= -1;
      
    } // end of if 
  } 
}