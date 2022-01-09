import java.util.*;
import java.lang.*;


public class Number_10872 {
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		if(n <= 1) {
			System.out.print(1);
		}
		else if(n == 2) {
			System.out.print(2);
		}
		else {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			System.out.print(result);
		}
	}
}