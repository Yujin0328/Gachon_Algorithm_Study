import java.util.*;
import java.lang.*;


public class Number_11729 {
	
	static StringBuilder record = new StringBuilder();
	
	public static void hanoi(int n, int left, int middle, int right) {
		if(n == 1) {
			record.append(left).append(" ").append(right).append("\n");
		}
		else {
			hanoi(n - 1, left, right, middle);
			record.append(left).append(" ").append(right).append("\n");
			hanoi(n - 1, middle, left, right);
		}
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		hanoi(n, 1, 2, 3);
		
		System.out.println((int)Math.pow(2,  n) - 1);
		System.out.println(record.toString());
	}
}