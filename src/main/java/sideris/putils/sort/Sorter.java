package sideris.putils.sort;

import java.util.Comparator;
import java.util.Random;

public class Sorter<T> {
	private Comparator<T> comp;
	
	public Sorter(Comparator<T> comp){
		this.comp = comp;
	}

	public Sorter() { 
		this.comp = (Comparator<T>) new MyIntComparable();
	}
	
	private void merge(T[] l, T[] r, T[] A){
		int sizeLeft = l.length;
		int sizeRight = r.length;
		int i = 0, j = 0, k =0;
		
		while(i < sizeLeft && j < sizeRight){
			if(comp.compare(l[i], r[j]) <= 0){
				A[k] = l[i];
				i++;
			}else{
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
	
	public void mergesort(T[] A){
		int size = A.length;
		if(size < 2 ) return;
		int mid = size / 2;
		T[] a = (T[]) new Object[10];
		T[] left = (T[]) new Object[mid];
		T[] right = (T[]) new Object[size - mid];
		for(int i = 0; i < size; i++){
			if(i < mid) left[i] = A[i];
			else right[i - mid] = A[i];
		}
		mergesort(left);
		mergesort(right);
		merge(left, right, A);
	}
	
	private int partition(T[] A, int start, int end){
		int pivotInd = end;  //can replace with random here
		T pivot = A[pivotInd];
		int partIndex = start;
		for(int i = start; i < end; i++){
			if(comp.compare(A[i], pivot) <= 0){
				T tmp = A[i];
				A[i] = A[partIndex];
				A[partIndex] = tmp;
				partIndex++;
			}
		}
		T tmp = A[partIndex];
		A[partIndex] = A[pivotInd];
		A[end] = tmp;
		return partIndex;
	}
	
	public void quicksort(T[] arr, int start, int end){
		if(start >= end) return;
		int partIndex = partition(arr, start, end);
		quicksort(arr, start, partIndex - 1);
		quicksort(arr, partIndex + 1, end);
	}
	
	private class MyIntComparable implements Comparator<Integer>{
		 
	    public int compare(Integer o1, Integer o2) {
	        return (o1>o2 ? 1 : (o1==o2 ? 0 : -1));
	    }
	} 
	
	private int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
