import java.util.*;
import java.lang.*;


public class Number_1517_merge_sort {
	static int[] result;
	static long count = 0;
	
	public static void merge(int list[], int left, int middle, int right) {
		int small = left;
		int large = middle + 1;
		int position = left;
		
		
		while(small <= middle && large <= right) {
			if(list[small] <= list[large]) {
				result[position++] = list[small++];
			}
			else {
				result[position++] = list[large++];
				count += middle - small + 1;
			}
		}
		
		if(small > middle) {
			for(int i = large; i <= right; i++) {
				result[position++] = list[i];
			}
		}
		else {
			for(int i = small; i <= middle; i++) {
				result[position++] = list[i];
			}
		}
		
		for(int i = left; i <= right; i++) {
			list[i] = result[i];
		}
	}
	
	public static void merge_sort(int list[], int left, int right) {
		int middle;
		
		if(left < right) {
			middle = (left + right) / 2;
			merge_sort(list, left, middle);
			merge_sort(list, middle + 1, right);
			merge(list, left, middle, right);
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		result = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		merge_sort(arr, 0, n - 1);
		
		System.out.println(count);
	}
}