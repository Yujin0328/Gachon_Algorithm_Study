import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_11501 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i = 0; i < test; i++) {
			int num = scanner.nextInt();
			int [] input = new int[num];
			
			
			for(int j = 0; j < num; j++) {
				input[j] = scanner.nextInt();
			}
			
			long result = 0;
			int max = input[num - 1];
			
			for(int j = num - 1; j >= 0; j--) {
				if(input[j] < max) {
					result += max - input[j];
				}
				else if(input[j] >= max) {
					max = input[j];
				}
			}
			
			System.out.println(result);
		}
		
	}
}