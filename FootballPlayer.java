
public class FootballPlayer {
 
  String name;
  int no;
  boolean inPlay;
  int minutes;
  int numberOfGoals;
  
  void play(int minutesToPlay) {
    minutes = minutes + minutesToPlay;
    
  }
  
  void score() {
    numberOfGoals = numberOfGoals + 1;
    
  }
  
  
  
  
  
      
}
