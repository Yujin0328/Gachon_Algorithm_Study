import java.util.*;
import java.lang.*;


public class Number_2751_shell_sort {
	static StringBuilder sort = new StringBuilder();
	
	public static void insert(int list[], int first, int last, int gap) {
		int j;
		
		for(int i = first + gap; i <= last; i += gap) {
			int key = list[i];
			
			for(j = i - gap; j >= first && key < list[j]; j = j - gap) {
				list[j+gap] = list[j];
			}
			
			list[j+gap] = key;
		}
	}
	
	public static void shell(int list[], int n) {
		for(int gap = n / 2; gap > 0; gap /= 2) {
			if(gap % 2 == 0) {
				gap++;
			}
			for(int i = 0; i < gap; i++) {
				insert(list, i, n -1, gap);
			}
		}
		
		for(int i = 0; i < n; i++) {
			sort.append(list[i]).append("\n");
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		shell(arr, n);
		
		System.out.println(sort.toString());
	}
}