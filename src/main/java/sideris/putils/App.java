package sideris.putils;

import sorsideris.putils.sort.Sorter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Sorter<Integer> a = new Sorter<Integer>();
    	Integer[] b = {1, 10, 23, 2, 5, 9, 23, 123, 1231, 2134};
    	a.quicksort(b, 0, b.length - 1);
    	for(int i : b)
    		System.out.print(i + " ");
        System.out.println( "Hello World!" );
    }
}
