/** 
 COMP1006/1406 - Summer 2014
 Assignment 9, Problem 1
 
 names: Daihee Kim || Muhammad Mustafa || Stanley Mbah Mbanwi || Malik Ehsanullah
 IDs:   100896156  || 100823576        || 100949700           || 100833433
 date: 08/11/2014
 
 Updated Entity class
 */

public abstract class Entity{
  /** time scaling factor.  Will be more important when View is graphics based */
  public static double TIME_SCALE = 1; 
  
  private static final int IMAGE_SIZE = 10;
  
  /** character representation of this entity */
  protected char symbol;
  
  /** current x-coordinate of this entity */
  protected double x;
  /** current y-coordinate of this entity */
  protected double y;
  
  /** current speed in x-direction of this entity */
  protected double speedX;
  /** current speed in y-direction of this entity */
  protected double speedY;
  
  /** maximum speed for a player for use in tournament */
  public static final int MAX_SPEED = 10;
  
  /** creates an entity with specified symbol at specified position 
    * 
    * @param symbol is a character (char) representation of the entity
    * @param x is the x-coordinate of the entity
    * @param y is the y-coordinate of the entity
    */
  public Entity(char symbol, int x, int y){
    this.symbol = symbol;
    this.x = x;
    this.y = y;
  }
  
  
  /** gets this entity's symbol
    * 
    * @return the symbol of this entity (char)
    */
  public char getSymbol(){ return this.symbol; }
  
  /** gets the current speed in the x-direction of this entity
    * 
    * @return the current x-direction speed of this entity
    */
  public double getSpeedX(){ return this.speedX; }
  
  /** gets the current speed in the y-direction of this entity
    * 
    * @return the current y-direction speed of this entity
    */
  public double getSpeedY(){ return this.speedY; }
  
  
  /** gets the current x-coordinate of this entity 
    * 
    * @return the current x-coordinate of this entity
    */
  public int getX() { return (int) this.x; }
  
  /** gets the current y-coordinate of this entity 
    * 
    * @return the current y-coordinate of this entity
    */
  public int getY() { return (int) this.y; }
  
  /** update the position of this entity using basic physics
    * <p>
    * In each direction, we have
    * new_position = current_position + speed * time_elapsed
    * <p>
    * Note: TIME_SCALE will need to be manually adjusted to a value that allows good game play 
    * 
    * @param time is a length of time
    * @param field is the current field
    */
  public final void updatePosition(long time, Field field) throws EntityOutOfBoundsException{
    this.x += (time * this.speedX) / TIME_SCALE;
    this.y += (time * this.speedY) / TIME_SCALE;
    checkCoordinates(field);
    
  }
  
  /** checks that this player is within the field boundaries
    * 
    * @param field is the field that this entity is on
    */ 
  protected void checkCoordinates(Field field) throws EntityOutOfBoundsException{
    // Checks if this entity is out of bounds
    // If theyre out of bounds throw the exception
    // If theyre in bounds then do nothing
    //String message = "";
    if(this.x > (field.maxX-(this.getSprite().getWidth()-2)) || this.x < 8.5 || this.y > (field.maxY-(this.getSprite().getHeight()-2)) || this.y < 8.5) {
      throw new EntityOutOfBoundsException("(" + this.x + ", " + this.y +")");
    }
  }
  
  
  /** logic for this entity (change direction/speed)
    * <p>
    * logic is based on current playing field (which holds information about 
    * all entities on the field) and possibly state of this entity
    *  
    * @param field is the current playing field
    */
  public abstract void play(Field field);
  
  /** update this entity for any changes to it 
    * <p>
    * For example, if this entity is moved by another entity, this entity's 
    * positions need to be updated.
    * 
    * @param field is the current playing field
    */
  public abstract void update(Field field);
  
  
  /** override the equals method from Object
    * <p>
    * This needs to be implemented in a child class
    * 
    * @param o is an object to be tested for equality with this
    * @return throws an exception
    */
  @Override
  public boolean equals(Object o){
    throw new UnsupportedOperationException("Not supported yet.");    
  }
  
  
  /* Setter methods
   * 
   * We don't want a player of one team to be able to change the
   * position or movement of a player on another team.  These methods
   * need an umpire passed to them to execute, but only Field can
   * create an Umpire. We explicitly check that the umpire is not null.
   */
  
  /** sets the x-coordinate of this entity
    *
    * @param umpire is a Field.Umpire object
    * @param x is the new x-coordinate
    */
  public final void setX(Field.Umpire umpire, double x){
    /* check that an actual Umpire was passed in */
    if( umpire == null ){
      throw new SecurityException("Changing x coordinate of Entity is only permitted by Field.Umpire objects");
    }
    this.x = x;
  }
  
  /** sets the y-coordinate of this entity
    *
    * @param umpire is a Field.Umpire object
    * @param y is the new y-coordinate
    */
  public final void setY(Field.Umpire umpire, double y){ 
    /* check that an actual Umpire was passed in */
    if( umpire == null ){
      throw new SecurityException("Changing y coordinate of Entity is only permitted by Field.Umpire objects");
    }
    this.y = y;
  }
  
  /** sets the speed in the x-direction of this entity 
    * 
    * @param umpire is a Field.Umpire object
    * @param speedX is the new x-direction speed of this entity 
    */
  public final void setSpeedX(Field.Umpire umpire, double speedX){ 
    /* check that an actual Umpire was passed in */
    if( umpire == null ){
      throw new SecurityException("Changing speedX of Entity is only permitted by Field.Umpire objects");
    }
    this.speedX = speedX;
  }
  
  /** sets the current speed in the y-direction of this entity 
    * 
    * @param umpire is a Field.Umpire object
    * @param speedY is the new y-direction speed of this entity 
    */
  public final void setSpeedY(Field.Umpire umpire, double speedY){ 
    if( umpire == null ){
      throw new SecurityException("Changing speedY of Entity is only permitted by Field.Umpire objects");
    }
    this.speedY = speedY;
  }
  
  //
  // this is used for graphical representations
  // 
  /** the sprite that will represent this entity */
  protected Sprite sprite;  
  
  public Sprite getSprite(){ return this.sprite; }
  
  public void setSprite(Field.Umpire umpire, String ref){
    if( umpire == null ){
      throw new SecurityException("Changing sprite is only permitted by Field.Umpire objects");
    }
    this.sprite = SpriteStore.get().getSprite(ref);
  }
  
  
  
}