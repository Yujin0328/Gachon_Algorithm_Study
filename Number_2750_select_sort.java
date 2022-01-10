import java.util.*;
import java.lang.*;


public class Number_2750_select_sort {
	
	public static void select(int list[], int n) {
		int least, temp;
		
		for(int i = 0; i < n - 1; i++) {
			least = i;
			for(int j = i + 1; j < n; j++) {
				if(list[j] < list[least])
					least = j;
			}
			
			temp = list[i];
			list[i] = list[least];
			list[least] = temp;
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		select(arr, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}