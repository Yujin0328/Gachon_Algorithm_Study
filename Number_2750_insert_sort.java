import java.util.*;
import java.lang.*;


public class Number_2750_insert_sort {
	
	public static void insert(int list[], int n) {
		int key, j;
		
		for(int i = 1; i < n; i++) {
			key = list[i];
			
			for(j = i - 1; j >= 0 && list[j] > key; j--) {
				list[j+1] = list[j];
			}
			list[j+1] = key;
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		insert(arr, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}