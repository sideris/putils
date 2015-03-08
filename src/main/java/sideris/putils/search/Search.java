package sideris.putils.search;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Search{
	
	public boolean isMember(Comparable[] arr, Comparable element) {
		return binary(arr, element) == -1 ? false : true;
	}
	
	public boolean isMember(Comparable[] arr, Comparable element, Comparator comp) {
		return binary(arr, element, comp) == -1 ? false : true;
	}
	
	public int binary(Comparable[] arr, Comparable element) {
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = (low + high) >>> 1;
			Comparable midValue = arr[mid];
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
	
	public int binary(Comparable[] arr, Comparable element, Comparator comp) {
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = (low + high) >>> 1;
			Comparable midValue = arr[mid];
			int comparison = comp.compare(midValue, element);
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
