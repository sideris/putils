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
    	Integer[] b = {1, 10, 23, 2, 5, 9, 23, 123, 1231, 2134, 2, 4, 98, 4};
    	Integer[] c = b.clone(), d = b.clone(), e = b.clone();
    	int i = 0;
    	printArray(b);
    	System.out.println();
    	Sorter.qsort(b);
    	Sorter.mergesort(c);
    	Sorter.heapSort(d);
    	printArray(b);
    	printArray(c);
    	printArray(d);
    	//printArray(e);
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
