import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_9095{
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		int test = scanner.nextInt();
		int result[] = new int[11];
		
		result[1] = 1; // 1
		result[2] = 2; // 1+1, 2
		result[3] = 4; // 1+1+1, 1+2, 2+1, 3
		
		for(int i = 4; i <= 10; i++) {
			result[i] = result[i - 1] + result[i - 2] + result[i - 3];
		}
		
		for(int i = 0; i < test; i++) {
			int input = scanner.nextInt();
			
			System.out.println(result[input]);
		}
	}
}