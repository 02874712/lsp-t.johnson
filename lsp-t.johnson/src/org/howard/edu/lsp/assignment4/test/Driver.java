/**
 * 
 */
package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
/**
 * @author Tashiana
 *
 */
public class Driver {

	/**
	 * @param args
	 * @throws IntegerSetException 
	 */
	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		System.out.println("Hello world, Lets look at some ArrayLists!");
	    
	    IntegerSet testSet1 = new IntegerSet();
	    IntegerSet testSet2 = new IntegerSet();
	    IntegerSet testSet3 = new IntegerSet();
	    IntegerSet testSet4 = new IntegerSet();
	    
	    System.out.println("Creating Some Lists...");
	    
	    testSet1.add(1);
	    testSet1.add(2);
	    testSet1.add(3);
	    testSet1.add(4);
	    testSet1.add(5);

	    testSet2.add(1);
	    testSet2.add(2);
	    testSet2.add(3);
	    testSet2.add(4);
	    // testSet2.add(5);

	    testSet4.add(5);
	    testSet4.add(4);
	    testSet4.add(3);
	    testSet4.add(2);
	    testSet4.add(1);

	    System.out.printf("Set 1: %s\n", testSet1.toString());
	    System.out.printf("Set 2: %s\n", testSet2.toString());
	    System.out.printf("Set 3: %s\n", testSet3.toString());
	    System.out.printf("Set 4: %s\n", testSet4.toString());

	    System.out.printf("Set 1 Length: %d\n", testSet1.length());
	    System.out.printf("Set 2 Length: %d\n", testSet2.length());
	    System.out.printf("Set 3 Length: %d\n", testSet3.length());
	    System.out.printf("Set 4 Length: %d\n", testSet4.length());

	    System.out.println("Let's Compare List...");
	    System.out.printf("Is Set 1 Equal to Set 4? %s\n", testSet1.equals(testSet4));
	    System.out.printf("Is Set 1 Equal to Set 2? %s\n", testSet1.equals(testSet2));

	    System.out.printf("Finding the Max of Set 3: %d\n", testSet3.largest());
	    System.out.printf("Finding the Max of Set 2: %d\n", testSet2.largest());
	    System.out.printf("Finding the Min of Set 4: %d\n", testSet4.smallest());
	    System.out.println("Let's Remove Value 5 from Set 1...");
	    testSet1.remove(5);

	    System.out.printf("Set 1: %s\n", testSet1.toString());
	    System.out.printf("Set 2: %s\n", testSet2.toString());
	    System.out.printf("Set 3: %s\n", testSet3.toString());
	    System.out.printf("Set 4: %s\n", testSet4.toString());
	    
	    System.out.printf("Is Set 1 Equal to Set 2? %s\n", testSet1.equals(testSet2));

	    System.out.printf("Is Set 3 Empty? %s\n", testSet3.isEmpty());
	    System.out.println("Let's union Set 2 and Set 3...");
	    testSet2.union(testSet3);
	    System.out.printf("Set 3: %s\n", testSet3.toString());
	    System.out.printf("Is Set 3 Empty? %s\n", testSet3.isEmpty());

	    testSet1.intersect(testSet4);
	    System.out.printf("Set Intersection of 1 and 4: %s\n", testSet1.toString() );

	    testSet4.union(testSet3);
	    System.out.printf("Set Union of 3 and 4: %s\n", testSet3.toString());

	    System.out.printf("Set 2: %s\n", testSet2.toString());
	    System.out.printf("Set 4: %s\n", testSet4.toString());
	    testSet4.diff(testSet2);
	    
	    System.out.printf("Set Difference of 2 and 4: %s\n", testSet4.toString());

	    System.out.printf("Junk Collection || Clearing Data...\nOur new Sets are...\n"); 
	    testSet1.clear();
	    testSet2.clear();
	    testSet4.clear();
	    
	    System.out.printf("Set 1: %s\n", testSet1.toString());
	    System.out.printf("Set 2: %s\n", testSet2.toString());
	    System.out.printf("Set 3: %s\n", testSet3.toString());
	    System.out.printf("Set 4: %s\n", testSet4.toString());
	    

	}

}
