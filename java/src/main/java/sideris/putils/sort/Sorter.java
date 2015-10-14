package sideris.putils.sort;

import java.util.Comparator;
import java.util.Random;

public class Sorter {
	
	public static void heapSort(Comparable[] arr){
		 HeapSorter.sort(arr);
	}
	
	/**Merge sort
	 * merge -> merges two arrays, in a sorted fashion, in a containing array
	 * mergesort -> the mergesort algorithm. 
	 * **/
	
	private static void merge(Comparable[] l, Comparable[] r, Comparable[] A){
		int sizeLeft = l.length;
		int sizeRight = r.length;
		int i = 0, j = 0, k = 0;
		
		while(i < sizeLeft && j < sizeRight){
			if( l[i].compareTo(r[j]) <= 0 ) {
				A[k] = l[i];
				i++;
			} else {
				A[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i < sizeLeft){
			A[k] = l[i];
			i++;
			k++;
		}
		
		while(j < sizeRight){
			A[k] = r[j];
			j++;
			k++;
		}
	}
	
	public static void mergesort(Comparable[] A){
		if( A == null ) return;
		
		int size = A.length;
		if( size < 2 ) return;
		int mid = size / 2;
		Comparable[] left = new Comparable[mid];
		Comparable[] right = new Comparable[size - mid];
		for(int i = 0; i < size; i++){
			if(i < mid) left[i] = A[i];
			else right[i - mid] = A[i];
		}
		mergesort(left);
		mergesort(right);
		merge(left, right, A);
	}
	
	/**
	 * Quicksort
	 * partition -> Partitions index and partially sorts according to a pivot value
	 * quicksort -> the recursive quicksort algorithm
	 * qsort     -> Wrapper function for quicksort
	 * **/
	
	private static int partition(Comparable[] A, int start, int end){
	    int pivotInd = end;  //can replace with random here
		Comparable pivot = A[pivotInd];
		int partIndex = start;
		for(int i = start; i < end; i++){
			if(A[i].compareTo(pivot) <= 0){
				swap(A, i, partIndex);
				partIndex++;
			}
		}
		swap(A, partIndex, end);
		return partIndex;
	}
	
	private static void quicksort(Comparable[] arr, int start, int end){
		if(start >= end) return;
		int partIndex = partition(arr, start, end);
		quicksort(arr, start, partIndex - 1);
		quicksort(arr, partIndex + 1, end);
	}
	
	public static void qsort(Comparable[] arr){
		int start = 0, end = arr.length - 1;
		quicksort(arr, start, end);
	}
	
	private static void swap(Comparable[] arr, int indA, int indB){
		Comparable tmp = arr[indA];
		arr[indA] = arr[indB];
		arr[indB] = tmp;
	}
}
