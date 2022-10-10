package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;

/**
 * @author Tashiana
 * Class IntegerSet Works Over an ArrayList Object that provides basic mathematics set functionality
 *
 */
public class IntegerSet {
	
	/**
	 * Creating private variables that are only to be accessible by the calling object.
	 * @set - ArrayList of Integers || this.set()
	 * @largest - largest num in set, stored within this.set()
	 * @smallest - smallest num in set, stored within this.set() - initialized to a set number
	 */
	  private ArrayList<Integer> set = new ArrayList<Integer>();
	  private int largest , smallest = 100; 

	  /**
	   * Default Constructor - IntegerSet is Created
	   */
	  public IntegerSet(){};
	  
	  /**
	   * clear() - void function removing all integers of ArrayList set
	   */
	  public void clear() {set.clear();};

	  /**
	   * length() - calculates the given length of private variable set
	   * @return length of ArrayList set
	   */
	  public int length() {return set.size();}; 
	  
	  /**
	   * equals(b) - compares the values of this.set() to declared IntegerSet b 
	   * @param b - IntegerSet object(not of this.set()) to be compared  
	   * @return isListEqual_False - given an initialized false value ; boolean returns true if b values == this.set values
	   */
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

	  /**
	   * contains(value) - searches through the given obj for param value
	   * @param value - int passed to function, if found listContains_false is set to true
	   * @return listContains_false - given an initialized false value; boolean returns true if this.set contains the given value
	   */
	  public boolean contains(int value) {
	    Boolean listContains_false = false; 
	    if(set.contains(value) == true){
	      listContains_false = true; 
	    }

	    return listContains_false;
	  };    

	/**
	 * largest - searches for the largest number in a given ArrayList set 
	 * @return largest - integer found to the the max of this.set
	 * @throws IntegerSetException - Exception Thrown when/if this.set is NULL/EMPTY
	 */
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

	/**
	 * smallest - searches for the min number in a given ArrayList set 
	 * @return smallest - integer found to the the min of this.set
	 * @throws IntegerSetException - Exception Thrown when/if this.set is NULL/EMPTY
	 */
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
		/**
		 * add(item) - adds an item to the set and does nothing it set contains item
		 * @param item - value to be added to the given set
		 */
	 	public void add(int item){
	    if(set.contains(item) == true){
	      //System.out.printf("%i is already in the list!\n", item);
	    }
	    else{
	      set.add(item);
	    }
	  };

	/**
	 * remove(item) - removes an item from the given set and does nothing if its not in set
	 * @param item - value to be removed from a given set
	 */
	public void remove(int item) {
	  if(set.contains(item) == true){
	    set.remove(set.indexOf(item));
	    }
	  }

	/**
	 * union(IntegerSet) - combines two IntegerSet objects such that no repeated values are added
	 * @param intSetb - to be the second set that is combined with this.set()
	 */
	public void union(IntegerSet intSetb) {
	  for(int i = 0; i < set.size(); i++) {
	    intSetb.add(set.get(i)); 
	  }
	};

	/**
	 * intersect(IntegerSet) - gives back a ArrayList set of values that can be found in both IntegerSets
	 * @param intSetb - second set that is intersected with this.set()
	 */
	public void intersect(IntegerSet intSetb) {
	  for(int i = 0; i < set.size(); i++){
	    set.retainAll(intSetb.set);
	    }
	  }; 

	/**
	 * diff(IntegerSet) - gives back the difference of intSetb from this.set(), returning values only found in this.set()
	 * @param intSetb - given IntegerSet ArrayList that is compared against this.set()
	 */
	public void diff(IntegerSet intSetb){
	  for(int i = 0; i < set.size(); i++){
	    if (intSetb.contains(set.get(i))){
	      set.remove(set.indexOf(set.get(i)));
	      i--;
	    }
	  }
	};

	/**
	 * isEmpty - checks to find if the given set is empty
	 * @return boolean value true if empty, else false if it is not NULL
	 */
	public boolean isEmpty(){ return set.isEmpty(); }; 

	/**
	 * toString - turns ArrayList values to String
	 * @return String representation of this.set() at time of call
	 */
	public String toString() { return set.toString(); };


}
