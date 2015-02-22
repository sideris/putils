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
