import java.util.*;
import java.lang.*;


public class Number_2750_bubble_sort {
	
	public static void bubble(int list[], int n) {
		int temp;
		
		for(int i = n - 1; i >0; i--) {
			for(int j = 0; j < i; j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		bubble(arr, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}