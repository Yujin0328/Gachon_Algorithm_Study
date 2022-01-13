import java.util.*;
import java.lang.*;


public class Number_2750_quick_sort {
	static int[] result;
	
	public static int partition(int list[], int left, int right) {
		int pivot = list[left], low = left, high = right+1;
		
		do {
			do {
				low++;
			}
			while(low <= right && list[low] < pivot);
			
			do {
				high--;
			}
			while(high >= left && list[high] > pivot);
			
			if(low < high) {
				int temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}while(low < high);
		
		int temp = list[left];
		list[left] = list[high];
		list[high] = temp;
		
		return high;
	}
	
	public static void quick_sort(int list[], int left, int right) {
		if(left < right) {
			int q = partition(list, left, right);
			quick_sort(list, left, q - 1);
			quick_sort(list, q + 1, right);
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
		
		quick_sort(arr, 0, n - 1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}