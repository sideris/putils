package sideris.putils;

import sideris.putils.sort.Sorter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Sorter a = new Sorter();
    	Integer[] b = {1, 10, 23, 2, 5, 9, 23, 123, 1231, 2134};
    	Integer[] c = new Integer[b.length];
    	int i = 0;
    	for(int n : b)
    		c[i++] = n;
    	Sorter.qsort(b);
    	Sorter.mergesort(c);
    	for(int n : b)
    		System.out.print(n + " ");
		System.out.println(" ");

    	for(int n : c)
    		System.out.print(n + " ");

    }
    
}
