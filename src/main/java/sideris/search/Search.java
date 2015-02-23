package sideris.search;

import java.util.Comparator;

public class Search<E extends Comparable<E>>{
	private Comparator<E> comp;
	public Search(){
		;
	}
	
	public Search(Comparator<E> comp){
		this.comp = comp;
	}
	
	public boolean isMember(E[] arr, E element) {
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = (low + high) >>> 1;
			E midValue = arr[mid];
			int comparison = midValue.compareTo(element);
			if ( comparison < 0 )
				low = mid + 1;
			else if ( comparison > 0 )
				high = mid - 1;
			else
				return true;
		}
		return false;
	}
	
	
	public int binary(E[] arr, E element) {
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = (low + high) >>> 1;
			E midValue = arr[mid];
			int comparison = midValue.compareTo(element);
			if ( comparison < 0 )
				low = mid + 1;
			else if ( comparison > 0 )
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
