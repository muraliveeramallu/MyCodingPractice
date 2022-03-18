package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Player{
	String name;
	int score;
	
	 // Constructor 
    public Player(String name, 
                               int score) 
    { 
        this.score = score; 
        this.name = name; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.name + 
                           " " + this.score; 
    } 
	

	
}

public class SortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingComparator s = new SortingComparator();
		
		ArrayList<Player> ar = new ArrayList<Player>(); 
        ar.add(new Player("amy", 100)); 
        ar.add(new Player("david", 100)); 
        ar.add(new Player("heraldo", 50)); 
        ar.add(new Player("aakansha", 75)); 
        ar.add(new Player("aleksa", 150)); 
      //Methos 1
      Collections.sort(ar,new Checker());
      //Method 2
      Collections.sort(ar, new Comparator<Player>() {
    	  @Override
    	  public int compare(Player one, Player two) {
    		  if(one.score == two.score)
    			 return one.name.compareTo(two.name);
    		  return one.score-two.score;
    	  }
	});
      
    //Method 2
      
      
	}

}

class Checker implements Comparator<Player> {
    public int compare(Player first, Player second) {
        if(first.score == second.score) {
            return first.name.compareTo(second.name);
        }
        return second.score > first.score ? 1 : -1;
    }
}
