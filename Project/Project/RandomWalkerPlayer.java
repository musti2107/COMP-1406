public class RandomWalkerPlayer extends Player{
  
  private Player free;
  
  public void play(Field field){
   
   
    
    
    
    
    if(this.getX() <= field.minX) {
      this.speedX = Math.random()*2;;
    }
    if(this.getX() >= (field.maxX-this.getSprite().getWidth())){
      this.speedX = Math.random()*-2;;
    }
    if(this.getY() <= field.minY) {
      this.speedY = Math.random()*2;;
    }
    if(this.getY() >= (field.maxY-this.getSprite().getHeight())){
      this.speedY = Math.random()*-2;
    }
    
 

    
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
  
  public RandomWalkerPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*4-2;
    this.speedY = Math.random()*4-2;
  }
  

}

