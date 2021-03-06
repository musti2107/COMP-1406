
import java.util.*; 
public class CatcherPlayer extends Player{
   
  
  Player following= null; // VARIABLE REPPIN THE OPPONENT PLAYER THAT IS TO BE FOLLOWED 
  Queue<Player> stack = new LinkedList<Player>(); // MAKE A STACK OF ALL THE PLAYERS THAT ARE AVILABLE TO BE FOLLOWED 
  int n=0; // n is gonna be assigned the territory of the player 
  
  
  
  public void play(Field field){
            
    n= field.getTeam.get(this);
    if (n == 2){
      
      if (stack.isEmpty()){
        for (Entity e: field.team1) {
          if (!field.jailForOne.contains((Player)e)){
            stack.add((Player)e);
          }// for !fieldJailForOne.Contains....
          if (field.jailForOne.contains((Player)e)){
          }
        }// for entity in team 1 
      } // if stack is empty 
      
      if (following == null){
        following = stack.remove(); // Peek the player that is next in the line add the player to follow
      }// if following is null
      
      double vector = Math.sqrt( Math.pow(following.y-this.y,2) + Math.pow(following.x-this.x,2)); // MAGNITUDE 
        this.speedX = (following.x -this.getX())/vector*20; // DIVDED BY MAGNITUDE TO GET THE UNIT VECTOR 
        this.speedY = (following.y -this.getY())/vector*20;
      
      if( field.catchOpponent(following, this) == true){
        
        if (following.x > (field.maxX)/2){ // IF CAUGHT 
          field.jailForOne.add(following);
          following = null; 
        } // else if following.x > ....

        else if (following.x < (field.maxX/2)){
          stack.add(following);
          
          following = null;
        } // if else if (following.x <... 
      }// if opponent is caught 
    }///wnd of n===2 

    if (n==1){
      if (stack.isEmpty()){ // if there is no player to be followed in the queue 
        for (Entity e : field.team2){ // WE DON'T KNOW WHICH TEAM THE PLAYER WE ARE PLAYING WITH BELONGS TO SO WE'LL CHECK BOTH ARRAYLIST OF PLAYER 1 AND PLAYER 2
          if (!this.equals(e)){ // IF THE TEAMS AREN'T THE SAME 
            stack.add((Player)e); //PUSH IT TO THE STACK 
          } // if!this
        } // entity
      } // END OF --- if (stack is empty)
      if (following == null){ // IF THE PLAYER ISNT FOLLOWING ANY PLAYER ATM 
        following = stack.peek(); // Peek the player that is next in the line 
      }
                      
      double vector = Math.sqrt( Math.pow(following.y-this.y,2) + Math.pow(following.x-this.x,2)); // MAGNITUDE 
      this.speedX = (following.x -this.getX())/vector; // DIVDED BY MAGNITUDE TO GET THE UNIT VECTOR 
      this.speedY = (following.y -this.getY())/vector;
      if( field.catchOpponent(following, this) == true){
        if (following.x < (field.maxX)/2){ // IF CAUGHT 
          field.jailForTwo.add(following);
          stack.remove();
        }
        stack.remove(); 
        following = null; // FOLLOWING IS NONE 
      }
    }// if n==1
  }
  
  

    
      
   
 
        
  @Override
  public void update(Field field){}
  
  @Override
  public boolean equals(Object o){
    if(o == null){ 
      System.err.println("null equals");
      return false;
      
    }
    if(o instanceof Player && this.getTeam().equals(((Player)o).getTeam())){
      return true;
    }
    return false;
  }
  
  public CatcherPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*4-2;
    this.speedY = Math.random()*4-2;
  }
  

}