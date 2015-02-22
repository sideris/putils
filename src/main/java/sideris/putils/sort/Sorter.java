package sideris.putils.sort;

import java.util.Comparator;

public class Sorter<T> {
	private Comparator<T> comp;
	
	public Sorter(Comparator<T> comp){
		this.comp = comp;
	}

	public Sorter() { 
		this.comp = (Comparator<T>) new MyIntComparable();
	}
	
	private int partition(T[] A, int start, int end){
		T pivot = A[end];
		int pIndex = start;
		for(int i = start; i < end; i++){
			if(comp.compare(A[i], pivot) <= 0){
				T tmp = A[i];
				A[i] = A[pIndex];
				A[pIndex] = tmp;
				pIndex++;
			}
		}
		T tmp = A[pIndex];
		A[pIndex] = A[end];
		A[end] = tmp;
		return pIndex;
	}
	
	public void quicksort(T[] arr, int start, int end){
		if(start >= end) return;
		int pIndex = partition(arr, start, end);
		quicksort(arr, start, pIndex - 1);
		quicksort(arr, pIndex + 1, end);
	}
	
	class MyIntComparable implements Comparator<Integer>{
		 
	    public int compare(Integer o1, Integer o2) {
	        return (o1>o2 ? 1 : (o1==o2 ? 0 : -1));
	    }
	} 
}
