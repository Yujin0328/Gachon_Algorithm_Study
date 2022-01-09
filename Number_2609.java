import java.util.*;
import java.lang.*;


public class Number_2609 {
	public static int cal(int a, int b) {
		int temp = 0;
		
		while(b > 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		
		return a;
	}
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(cal(a, b));
		System.out.print(a * b / cal(a, b));
	}
}