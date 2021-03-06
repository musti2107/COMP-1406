/** 
 COMP1006/1406 - Summer 2014
 Project DEMO 3
 
 names: Daihee Kim || Muhammad Mustafa || Stanley Mbah Mbanwi || Malik Ehsanullah
 IDs:   100896156  || 100823576        || 100949700           || 100833433
 date: 08/14/2014
 
 Demo 3: Shows players trying to free a caught player in jail (Incomplete)
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo3{
  
  public static void main(String[] args){
    Field f = new Field();
    
    // create a bunch of players for both teams 
    // (they all have the same name and number for now....)
    
    int NUM_PLAYERS = 25;
    
    Team one = new Team (f, NUM_PLAYERS, 1, 7);
    Team two = new Team (f, NUM_PLAYERS, 2, 3);


      
      boolean gameRunning = true;
    
    long iterations = 0;
    while( gameRunning ){
      iterations += 1;
   
      /* allow players to think about what to do and change directions */
      f.play();
      
      /* move all players */
      f.update();
      
      /* redraw all the players in their new positions */
      f.draw();
      
      
      /* give some message to display on the field */

      if(f.gameStillRunning() == true && iterations < 1000) {
        f.view.message("WINNN");
      }else if(f.gameStillRunning() == true && iterations < 10000){
        f.view.message("WINN");
      }else if(f.gameStillRunning() == true){
        f.view.message("and going...");
      }
      if (f.gameStillRunning() == false){
        f.view.message("ENDGAME");
      }
      
      // uncomment this if game is moving too fast , sleep for 10 ms
      //try{ Thread.sleep(10); } catch(Exception e) {}
      
      gameRunning = f.gameStillRunning();
    }
    
    
  }
  
}