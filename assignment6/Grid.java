/**
 COMP1006/1406 - Summer 2014
 Assignment 6, Problem 2
 
 name:Muhammad Mustafa
 id:100823576
 date:28/07/2014
 
 /**
 * checks what is in a given grid position in this grid
 * 
 * @param pos is a position in this grid that satisfies 1 <= pos <= 9.
 * @return -1 if an X is in the grid position, +1 if a Y is in the grid position 
 * and 0 if nothing is in the grid position.
 */ 


public class Grid{
  protected int[][] grid;
  
  public static final int X = -1;
  public static final int Y = +1;
  public static final int EMPTY = 0;
  
  
  /**
   * checks what is in a given grid position in this grid
   * 
   * @param pos is a position in this grid that satisfies 1 <= pos <= 9.
   * @return -1 if an X is in the grid position, +1 if a Y is in the grid position 
   * and 0 if nothing is in the grid position.
   */ 
  
  protected int getGridElement(int pos){
    
    int row = (pos-1)/3;
    int col = (pos-1)%3;
    
    return grid[row][col];
    
  }
  
  /** 
   * sets a given position
   * 
   * @param pos is a position in this grid
   * @param value is a number less than zero for an X, greater than zero for 
   * a Y, and equal to zero to empty the position.
   */
  
  protected void setGridElement(int pos, int value){
    
    int row = (pos-1)/3;
    int col = (pos-1)%3;
    
    if(value == EMPTY){
      
      grid[row][col] = EMPTY;
      
    }else if(value < EMPTY){
      
      grid[row][col] = X;
      
    }else{
      
      grid[row][col] = Y;
      
    }
  }
  
  /**
   * checks if a given grid position is empty
   * 
   * @param pos is a position in the grid that satisfies 1 <= pos <= 9.
   * @return true if this grid position is empty and false if an X or Y is there.
   */
  public boolean isEmpty(int pos){
    
    return getGridElement(pos) == EMPTY;
  }
  
  /**
   * checks if a given grid position has an X in it
   * 
   * @param pos is a position in the grid that satisfies 1 <= pos <= 9.
   * @return true if this grid position has an X in it and false otherwise.
   */
  public boolean isX(int pos){
    
    return getGridElement(pos) == X;
  }
  
  /**
   * puts an X in a given grid position
   * 
   * @param pos is a given grid position
   * @return true if this position initially was empty (and sets this position to X) and false if an X or Y was
   * already in this position.  
   */
  public boolean setX(int pos){
    
    if(!isEmpty(pos)){ 
      
      return false;
      
    }
    
    setGridElement(pos, X);
    
    return true;
    
  }  
  
  /**
   * checks if a given grid position has an Y in it
   * 
   * @param pos is a position in the grid that satisfies 1 <= pos <= 9.
   * @return true if this grid position has a Y in it and false otherwise.
   */
  
  public boolean isY(int pos){
    
    return getGridElement(pos) == Y;
    
  }
  
  /**
   * puts an Y in a given grid position
   * 
   * @param pos is a given grid position
   * @return true if this position initially was empty (and sets this position to Y) and false if an X or Y was
   * already in this position.  
   */
  public boolean setY(int pos){
    
    if(!isEmpty(pos)){ 
      
      return false;
    }
    
    setGridElement(pos, Y);
    
    return true;
  }
  
  /**
   * clears this grid so that each position is empty
   */
  
  public void clear(){
    
    for(int pos=1; pos<=9; pos+=1){
      
      setGridElement(pos,EMPTY);
      
    }
  }
  
  /** 
   * create an empty grid
   */
  
  public Grid(){
    
    grid = new int[3][3];
    clear();
    
  }
  
  public String draw(){
    
    String one;
    String two;
    String three;
    String four;
    String five; 
    String six; 
    String seven;
    String eight; 
    String nine; 
    
    //check one
    if (this.grid[0][0] == 1){
      one = "Y"; }
    
    else{
      if(this.grid[0][0] == -1){
        one = "X";}
      else {
        one= " "; }
    }
    
    //checks two
    if (this.grid[0][1] == 1){
      two = "Y"; }
    else{
      if(this.grid[0][1] == -1){
        two = "X";}
      else {
        two= " "; }
    }
    
    //checks three
    if (this.grid[0][2] == 1){
      three = "Y"; }
    else{
      if(this.grid[0][2] == -1){
        three = "X";}
      else {
        three= " "; }
    }
    
    
    //checks four
    if (this.grid[1][0] == 1){
      four = "Y"; }
    else{
      if(this.grid[1][0] == -1){
        four = "X";}
      else {
        four= " "; }
    }
    
    //checks five
    if (this.grid[1][1] == 1){
      five = "Y"; }
    else{
      if(this.grid[1][1] == -1){
        five = "X";}
      else {
        five= " "; }
    }
    
    //checks six
    if (this.grid[1][2] == 1){
      six = "Y"; }
    else{
      if(this.grid[1][2] == -1){
        six = "X";}
      else {
        six= " "; }
    }
    
    //checks seven
    if (this.grid[2][0] == 1){
      seven = "Y"; }
    else{
      if(this.grid[2][0] == -1){
        seven = "X";}
      else {
        seven= " "; }
    }
    
    
    //checks eight    
    if (this.grid[2][1] == 1){
      eight = "Y"; }
    else{
      if(this.grid[2][1] == -1){
        eight = "X";}
      else { 
        eight = " ";}
    }
    
    //checks nine
    if (this.grid[2][2] == 1){
      nine = "Y"; }
    else{
      
      
      if(this.grid[2][2] == -1){
        nine = "X";}
      else { 
        nine = " ";}
    }
        
    //return grid
    return one +" | " + two+ " | " + three+ "\n--+---+--\n" + four +" | "+ five + " | "+ six +"\n--+---+--\n"+ seven+" | "+ eight+ " | "+ nine;
    
  } 
  
}