package sideris.putils.sort;

public class HeapSorter {
	private HeapSorter(){ ; }
	
	private static void buildMaxHeap(Comparable[] arr){
		int size = arr.length;
		for(int i = size/2; i>=0; i--)
			maxHeapify(arr, i, size - 1);
	}
	
	private static void maxHeapify(Comparable[] arr, int ind, int size){
		int left = ind * 2;
		int right = ind * 2 + 1;
		int largest = ind;
		if(left <= size && arr[left].compareTo(arr[ind]) > 0) largest = left;
		if(right <= size && arr[right].compareTo(arr[largest]) > 0) largest = right;
		
		if(largest != ind){
			swap(arr, ind, largest);
			maxHeapify(arr, largest, size);
		}

	}
	
	public static void sort(Comparable[] arr){
		buildMaxHeap(arr);
		int n = arr.length - 1;
		for(int i = n; i > 0; i--){
			swap(arr, 0, i);
			n--;
			maxHeapify(arr, 0, n);
		}
	}
	

	private static void swap(Comparable[] arr, int indA, int indB){
		Comparable tmp = arr[indA];
		arr[indA] = arr[indB];
		arr[indB] = tmp;
	}
}
