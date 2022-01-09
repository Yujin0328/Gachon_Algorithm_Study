import java.util.*;
import java.lang.*;


public class Number_10870 {
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n <= 2) {
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.print(fibo(n));
	}
}