import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_9465 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int test = scanner.nextInt();
		
		for(int i = 0;i < test;i++) {
			int n = scanner.nextInt();

			int [][] cost = new int[2][n+1];
			int [][] result = new int[2][n+1];
			
			
			for(int j = 0; j < 2; j++) {
				for(int k = 1; k <= n;k++) {
					cost[j][k] = scanner.nextInt();
				}
			}

			result[0][1] = cost[0][1];
			result[1][1] = cost[1][1];
			
			
			for(int k = 2; k <= n; k++) {
				result[0][k] = Math.max(result[1][k-1], result[1][k-2]) + cost[0][k];
				result[1][k] = Math.max(result[0][k-1], result[0][k-2]) + cost[1][k];
			}
				
			System.out.println(Math.max(result[0][n], result[1][n]));
			
		}
	}
}