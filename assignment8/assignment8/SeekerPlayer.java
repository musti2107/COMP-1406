public class SeekerPlayer extends Player{
  
  
  public void play(Field field){
    


    
   double vector = Math.sqrt( Math.pow(field.getFlag1Position()[1]-this.y,2) +  Math.pow(field.getFlag1Position()[0]-this.x,2)); // MAGNITUDE 
    
        
    this.speedX = (field.getFlag1Position()[0] -this.getX())/vector; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
    this.speedY = (field.getFlag1Position()[1] -this.getY())/vector;
    
    if (field.pickUpFlag(this)){
      this.speedX = 0;
      this.speedY = 0;
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
    if(o instanceof Player && this.getName().equals(((Player)o).getName())){
      return true;
    }
    return false;
  }
  
  public SeekerPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*4-2;
    this.speedY = Math.random()*4-2;
  }
  

}




  