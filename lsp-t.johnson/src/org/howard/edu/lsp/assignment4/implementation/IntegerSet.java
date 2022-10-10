/**
 * 
 */
package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;
/**
 * @author Tashiana
 *
 */
public class IntegerSet {
	
	  private ArrayList<Integer> set = new ArrayList<Integer>();
	  private int largest , smallest = 100; 

	  public IntegerSet(){};

	  public void clear() {set.clear();};

	  public int length() {return set.size();}; // returns the length

	  public boolean equals(IntegerSet b) {
	    Boolean isListEqual_False = false; 
	    if ( set.size() != b.length() ){
	      System.out.println("The sets are not of equal length!");
	    }
	    else{
	      for(int i = 0; i < b.length(); i++){
	        if(b.contains(set.get(i)) == true){
	          if(i == b.length() - 1){
	            isListEqual_False = true; 
	          }
	        }
	      }
	  }
	    return isListEqual_False; 
	  }; 

	  public boolean contains(int value) {
	    Boolean listContains_false = false; 
	    if(set.contains(value) == true){
	      listContains_false = true; 
	    }

	    return listContains_false;
	  };    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException{
	  
	  try{
	    if(set.isEmpty()){
	      throw new IntegerSetException("Set Empty Exception Thrown!");
	    }
	    
	    for(int i = 0 ; i < set.size(); i++){
	      if (set.get(i) > largest){
	        largest = set.get(i);
	        }
	      }
	    }
	  catch(IntegerSetException e){
	    System.out.println("MAX CANNOT BE FOUND:" + e);
	    }
	  return largest; 
	}; 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
	  try{
	    if(set.isEmpty()){
	      throw new IntegerSetException("Set Empty Exception Thrown!");
	    }
	    for(int i = 0; i < set.size(); i++){
	      if (set.get(i) < smallest){
	        smallest = set.get(i);
	      }
	    }
	  }
	  catch(IntegerSetException e){
	    System.out.println("MIN CANNOT BE FOUND:" + e);
	  }

	  return smallest; 
	};

	// Adds an item to the set or does nothing it already there	
	 	public void add(int item){
	    if(set.contains(item) == true){
	      //System.out.printf("%i is already in the list!\n", item);
	    }
	    else{
	      set.add(item);
	    }
	  }; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
	  if(set.contains(item) == true){
	    set.remove(set.indexOf(item));
	    }
	  }

	// Set union
	public void union(IntegerSet intSetb) {
	  for(int i = 0; i < set.size(); i++) {
	    intSetb.add(set.get(i)); 
	  }
	};

	// Set intersection
	public void intersect(IntegerSet intSetb) {
	  for(int i = 0; i < set.size(); i++){
	    set.retainAll(intSetb.set);
	    }
	  }; 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb){
	  for(int i = 0; i < set.size(); i++){
	    if (intSetb.contains(set.get(i))){
	      set.remove(set.indexOf(set.get(i)));
	      i--;
	    }
	  }
	}; // set difference, i.e. s1 - s2

	// Returns true if the set is empty, false otherwise
	public boolean isEmpty(){ return set.isEmpty(); }; 

	// Return String representation of your set
	public String toString() { return set.toString(); };	// return String representation of your set


}
