

public class Team{
  
  private int numOfPlayers;
  private int x=0;//Counter Variable
  protected Player p;
  private int team;
  
  //Constructor needs to take in parameters a field, number of players, the teamStrat and teamNumber they'll be
  public Team (Field theField, int numberOfPlayers, int teamNum, int teamStrat){
    
    /***************************************************************
     * TEAMSTRAT
     * teamStrat determines what kind of team to build.
     *1 = Team with every kind of player (needs atleast 5 players)
     *Everything above 1 makes a team with only one Player type
     *2 = ChaserPlayer
     *3 = CatcherPlayer
     *4 = SeekerPlayer
     *5 = StoppingPlayer
     *6 = RandomWalkerPlayer
     *7 = FreePlayer
     ***************************************************************/
    
    /***************************************************************
     * TEAMNUM
     * teamNum determines what colour the team will be
     *1 = Blue
     *2 = Red
     ***************************************************************/
    
    team = teamNum;//Sets the team to the team number(used for colour of the team)
    numOfPlayers = numberOfPlayers;//Sets the number of players
    
    //Refer to TEAMSTRAT comment block
    if (teamStrat == 1){EveryTypeOfPlayer(theField, team, numOfPlayers);}
    else{OneTypeOfPlayer(theField, team, teamStrat, numOfPlayers);}
  }
  
  /***************************************************************************
  //The method that is called when the team is filled with everytype of player
  ****************************************************************************/
  public void EveryTypeOfPlayer(Field theField, int teamNum, int numberOfPlayers){
    for (int i=0; i<numberOfPlayers; i++){
      if (x==0){//Counter Variable starts to add (depending on x it determines what type of player will be set)
        x = x + 1;
        if (teamNum == 1){//Checks team number
        // "i" in the following constructor determines what the player's number is on that team (player 1, 2, etc...)
        //USE i to make sure you differentiate between the players
        p = new ChaserPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new ChaserPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
      
      if (x==1){
        x = x + 1;
        if (teamNum == 1){
        p = new CatcherPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new CatcherPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
      
      if (x==2){
        x = x + 1;
        if (teamNum == 1){
        p = new RandomWalkerPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new RandomWalkerPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
      
      if (x==3){
        x = x + 1;
        if (teamNum == 1){
        p = new StoppingPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new StoppingPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
      
      if (x==4){
        x = x+1;//x is reset here! The last different kind of player will reset the cycle
        //IF YOU MAKE MORE PLAYERS COPY THIS CODE MAKE X INCREMENT MORE AND MAKE SURE THE NEW PLAYERS ARE ADDED PROPERLY
        if (teamNum == 1){
        p = new SeekerPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        if (teamNum == 2){
        p = new SeekerPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
      if (x==5){//Counter Variable starts to add (depending on x it determines what type of player will be set)
        x = 0;
        if (teamNum == 1){//Checks team number
        // "i" in the following constructor determines what the player's number is on that team (player 1, 2, etc...)
        //USE i to make sure you differentiate between the players
        p = new FreePlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new FreePlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
  }
  
  /*********************************************************************************
  //The method that is called when the team is filled with only one type of player
  *********************************************************************************/
  public void OneTypeOfPlayer(Field theField, int teamNum, int teamStrat, int numOfPlayers){
    
    if (teamStrat==2){//if TeamStrat == 2 makes ChaserPlayers (you can change this to anything you want)
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){//Check what team theyre on
        // "i" in the following constructor determines what the player's number is on that team (player 1, 2, etc...)
          //USE i to make sure you differentiate between the players
        p = new ChaserPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){//Checks what team theyre on
        p = new ChaserPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
    
    if (teamStrat==3){
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){
        p = new CatcherPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new CatcherPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
    
    if (teamStrat==4){
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){
        p = new SeekerPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new SeekerPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
    
    if (teamStrat==5){
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){
        p = new StoppingPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new StoppingPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
    if (teamStrat==6){
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){
        p = new RandomWalkerPlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new RandomWalkerPlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
    if (teamStrat==7){
      for (int i=0; i<numOfPlayers; i++){
        if (teamNum == 1){
        p = new FreePlayer("Cat van Kittenish", i, "blues", 'b', (int) (Math.random()*400)+10,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 1);
        }
        
        if (teamNum == 2){
        p = new FreePlayer("Bunny El-Amin", i, "reds", 'r', (int) (Math.random()*400)+410,(int) (Math.random()*500+10));
        theField.registerPlayer(p, 2);
        }
      }
    }
  }
  
  
}