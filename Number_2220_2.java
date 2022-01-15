import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_2220_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int [] arr = new int[number + 1];
		
		arr[1] = 1;
		
		for(int i = 2; i <= number; i++) {
			arr[i] = i;
			
			int temp = arr[i - 1];
			arr[i - 1] = arr[i];
			arr[i] = temp;
			
			for(int j = i - 1; j > 1; j/=2) {
				temp = arr[j];
				arr[j] = arr[j / 2];
				arr[j / 2] = temp;
			}
		}
		
		for(int i = 1; i <= number; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}