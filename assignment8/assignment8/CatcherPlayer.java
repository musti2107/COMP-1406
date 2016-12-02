
import java.util.*; 
public class CatcherPlayer extends Player{
   
  
  private Player following = null; // VARIABLE REPPIN THE OPPONENT PLAYER THAT IS TO BE FOLLOWED 
  private Deque<Player> stack = new ArrayDeque<Player>(); // MAKE A STACK OF ALL THE PLAYERS THAT ARE AVILABLE TO BE FOLLOWED 
   
   
  public void play(Field field){
    // ArrayList <Player> caught = new ArrayList<Player>();
  
    if (stack.isEmpty()){  // IF THE STACK OF ALL THE PLAYER THAT NEEDS TO BE FOLLOWED IS EMPTY 
      for (Entity e : field.team1){ // FOR ALL THE ENTITIES IN THE ARRAYLIST OF TEAM 1  
        if (!this.equals(e)){ // IF THE TEAMS AREN'T THE SAME 
          stack.push((Player)e); //PUSH IT TO THE STACK 
      }
    }
    
    
    for (Entity e : field.team2){ // WE DON'T KNOW WHICH TEAM THE PLAYER WE ARE PLAYING WITH BELONGS TO SO WE'LL CHECK BOTH ARRAYLIST OF PLAYER 1 AND PLAYER 2 
      if (!this.equals(e)){ // IF THE TEAMS AREN'T THE SAME 
        stack.push((Player)e); //PUSH IT TO THE STACK 
      }
    }
    
    } //  END OF --- if (stack is empty) 
    
    
    
    if (following == null){ // IF THE PLAYER ISNT FOLLOWING ANY PLAYER ATM 
    following = stack.pop(); // POP ONE 
    }
    
    double vector = Math.sqrt( Math.pow(following.y-this.y,2) +  Math.pow(following.x-this.x,2)); // MAGNITUDE 
    this.speedX = (following.x -this.getX())/vector; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
    this.speedY = (following.y -this.getY())/vector;
    
    
    if( field.catchOpponent(following, this)== true){ // IF CAUGHT 
      following = null; // FOLLOWING IS NONE 
    }
           updatePosition(1,field);
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