public class StoppingPlayer extends Player{
  
  @Override
  public void play(Field field){
    if(this.getX() >= (field.maxX-this.getSprite().getWidth()) || this.getX() <= field.minX) {
      this.speedX = 0;
      this.speedY = 0;
    }
    if(this.getY() >= (field.maxY-this.getSprite().getHeight()) || this.getY() <= field.minY) {
      this.speedY = 0;
      this.speedX = 0;
    }
    updatePosition(1,field);
  }
    
  
  @Override
  public void update(Field field){
  }
  
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
  
  public StoppingPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*4-2;
    this.speedY = Math.random()*4-2;
    
  }
  
}