/**
 COMP1006/1406 - Summer 2014
 Assignment 7, Problem 2
 
 name:Muhammad Mustafa
 id:100823576
 date:01/08/2014
 
- A queue is a data structure where data is accessed using the FIFO (first in first out) approach.
- You will use a queue to simulate the game of hot potato.
- Hot potato is a simple game in which a circle of people pass around a potato, from one
  person to the next around the circle, until the game is paused. The person holding the
  potato when the game is paused is removed from the circle and the game resumes with the
  next person holding the potato. This repeats until there is only one player remaining; who
  is declared the winner.
- You will use a queue to represent the circle of people. The front of the queue is the
  person holding the potato. In order to pass the potato, you will remove the person holding
  the potato from the queue and add them to back of it. The new person at the front of the
  queue is now holding the potato.
  
  /* Example:
 * 
 * Suppose 
 *  numberOfPasses = 3 
 *  players = ["cat", "dog", "eel", "fred", "wilma"]
 * 
 * Then, 
 *  playHotPotato(players) ----outputs---> cat
 * 
 * The game starts with cat holding the potato. Use --n--> to denote the the nth pass
 * of the potato in a given round.
 * 
 * Here's how this game was played.  The game starts with cat holding the potato
 * 
 * cat --1--> dog --2--> eel --3--> fred
 * fred is eliminated and the next round starts with wilma holding the potato
 * 
 * wilma --1--> cat --2--> dog --3--> eel
 * eel is eliminated and the next round will start with wilma holding the potato
 * 
 * wilma --1--> cat --2--> dog --3--> wilma
 * wilma is eliminated and the next round will start with cat holding the potato
 * 
 * cat --1--> dog --2--> cat --3--> dog
 * dog is eliminated
 * 
 * cat is the last player and is the winner
 * 
 * 
 * If numberOfPasses = 2 
 *  players = ["cat", "dog", "eel", "fred", "wilma"]
 * 
 * Then, 
 *  playHotPotato(players) ----outputs---> fred
 * 
 * The players are eliminated in the following order: eel, cat, wilma, dog
 */

import java.util.concurrent.ArrayBlockingQueue; 

public class HotPotato{
  
  /* this value is the number of potato passes before each game pause.
   * For example, if numberOfPasses = 3, then after 3 passes of the 
   * potato, the game pauses and the player holding the potato is eliminated.
   */
  public static int numberOfPasses = 2; 
  
  
  public static String playHotPotato(String[] players){
    // input: 'players' is an array of Strings that represent the participants in the game
    //         It is assumed that numberOfPasses >= 0
    //     
    // output: the winning player of the game.
    
    
    ArrayBlockingQueue<String> lineup= new ArrayBlockingQueue<String>(players.length); 
    
    for (int i = 0 ; i < players.length; i++){
      
      lineup.add(players[i]);
      
    }// all the players to the list     
    
    while(lineup.size() > 1){  // while there is only string left in the queue 
      
      
      for (int k = 0; k < numberOfPasses; k++){ // start the passes 
        
        String a  = lineup.peek(); // the first person in the queue (save his/her String) 
        
        lineup.remove();// remove the first person from the queue 
        
        lineup.add(a); // add him/her back to the queue 
        
      } // end of for loop 
      
      //String peek  = lineup.peek(); // check for the first person in the queue again. 
      
      lineup.remove();  // remove him/her without saving this time. 
      
    }// do it till there is only 1 string left in the queue 
    
    return lineup.remove(); // return the last person standing. 
    
 }
}