public class DummyPlayer extends Player{
 
  @Override
  public void play(Field field){
    // play is the logic for the player
    // you should make changes this player's speed here
    // you should not update position
    if( Math.random() < 0.0005){
      this.speedX *= -1;
    }
    if( Math.random() < 0.0005){
      this.speedY *= -1;
    }
    
    //
    // should not update position here
    //      updatePosition(1,field);
    // this is now removed.  
    //
  }
    
  
  @Override
  public void update(Field field){}
  
  @Override
  public boolean equals(Object o){
    if(o == null){ 
      System.err.println("null equals");
      return false;
      
    }
    if(o instanceof Player && this.getName().equals(((Player)o).getName())){
      return true;
    }
    return false;
  }
  
  /** create a player that has some random motion 
    * <p>
    * the player starts in a random direction
    * 
    * @param name is this player's name 
    * @param number is this player's number
    * @param team is this player's team's name
    * @param symbol is a character representation of this player
    * @param x is the initial x position of this player
    * @param y is the initial y position of this player
    */
  public DummyPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*7-2;
    this.speedY = Math.random()*6-2;
  }
  
}