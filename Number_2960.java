import java.util.*;
import java.lang.*;


public class Number_2960 {
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		boolean [] arr = new boolean[n+1];
		int count = 0;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = true;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = i; j <= n; j += i) {
				if(!arr[j])
					continue;
				
				arr[j] = false;
				count++;
				
				if(count == k) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}
}