package sideris.putils;

import sideris.putils.sort.Sorter;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Sorter a = new Sorter();
    	Integer[] b = {1, 10, 23, 2, 5, 9, 23, 123, 1231, 2134};
    	int[] qq = {1, 10, 23, 2, 5, 9, 23, 123, 1231, 2134};
    	Integer[] c = b;
    	int i = 0;
    	printArray(b);
    	Sorter.qsort(b);
    	Sorter.mergesort(c);
    	printArray(b);
    	printArray(c);
    }
    
    public static void printArray(int[] arr){
    	for(int n : arr)
    		System.out.print(n + " ");
    	System.out.println();
    }
    public static void printArray(Integer[] arr){
    	for(int n : arr)
    		System.out.print(n + " ");
    	System.out.println();
    }    
    
}
