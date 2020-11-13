package it.unibo.oop.lab05.ex2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

	private final static int INSERTION_LIMIT = 10000;
	
	
    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	final Set<String> stringSet = new TreeSet<>(new CustomComparator());
    	Random random  = new Random();
    	for (int i = 0; i < INSERTION_LIMIT; i++) {
			stringSet.add(String.valueOf(random.nextInt(INSERTION_LIMIT)));
		}
    	
    	
    	System.out.println(stringSet);
    	
    	
    }
}
