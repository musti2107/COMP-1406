public class SeekerPlayer extends Player{

  
  
  public void play(Field field){
    
    
    
    
    
    
    int n=0; // n is gonna be assigned the territory of the player 
    
    
    n= field.getTeam.get(this); 
    
    
    
  
    if (n == 1){
        
           
      double vector = Math.sqrt( Math.pow(field.getFlag2Position()[1]-this.y,2) +  Math.pow(field.getFlag2Position()[0]-this.x,2)); // MAGNITUDE 
      
      
      this.speedX = (field.getFlag2Position()[0] -this.getX())/vector; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
      this.speedY = (field.getFlag2Position()[1] -this.getY())/vector;
      
      if (field.pickUpFlag(this)){
        
        field.moverForFlag2 = this;
       
        
        double vector2 = Math.sqrt( Math.pow(field.getBase1Position()[1]-this.y,2) +  Math.pow(field.getBase1Position()[0]-this.x,2)); // MAGNITUDE 
        
        this.speedX = (field.getBase1Position()[0] -this.getX())/vector2; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
        this.speedY = (field.getBase1Position()[1] -this.getY())/vector2;
        
        
     
      }// if flag is picked up end 
      
    

      
      
    } // if n== 1 end 
    
    
    if (n == 2){
   
      double vector = Math.sqrt( Math.pow(field.getFlag1Position()[1]-this.y,2) +  Math.pow(field.getFlag1Position()[0]-this.x,2)); // MAGNITUDE 
      
      
      this.speedX = (field.getFlag1Position()[0] -this.getX())/vector; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
      this.speedY = (field.getFlag1Position()[1] -this.getY())/vector;
      
     if (field.pickUpFlag(this)){
        
        field.moverForFlag1 = this; 
      
        
        double vector2 = Math.sqrt( Math.pow(field.getBase2Position()[1]-this.y,2) +  Math.pow(field.getBase2Position()[0]-this.x,2)); // MAGNITUDE 
       
        this.speedX = (field.getBase2Position()[0] -this.getX())/vector2; // DIVDED BY MAGNITUDE TO GET THE  UNIT VECTOR 
        this.speedY = (field.getBase2Position()[1] -this.getY())/vector2;
        
      }
     
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
  
  public SeekerPlayer(String name, int number, String team,char symbol, int x, int y){
    super(name, number, team, symbol, x, y);
    this.speedX = Math.random()*4-2;
    this.speedY = Math.random()*4-2;
  }
  
  


}