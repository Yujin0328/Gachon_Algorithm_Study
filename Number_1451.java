import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1451{
	
	static int [][] input;
	
	//구간의 합
	public static long sum(int starti, int endi, int startj, int endj) {
		long sum = 0;
		
		for(int i = starti; i < endi; i++) {
			for(int j = startj; j < endj; j++) {
				sum += input[i][j];
			}
		}
		
		return sum;
	}
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		input = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String value = scanner.next();
			for(int j = 0; j < m; j++) {
				input[i][j] = value.charAt(j) - '0';
			}
		}
		
		long result = 0;
		
		for(int i = 1; i < n; i++) {
			long a = sum(0, i, 0, m);
			
			for(int j = 1; j < m; j++) { // ㅠ 형태
				long b = sum(i, n, 0, j);
				long c = sum(i, n, j, m);
				
				long temp = a * b * c;
				
				if(result < temp) {
					result = temp;
				}
			}
			
			for(int j = i + 1; j < n; j++) { //ㅡㅡㅡ 형태
				long b = sum(i, j, 0, m);
				long c = sum(j, n, 0, m);
				
				long temp = a * b * c;
				
				if(result < temp) {
					result = temp;
				}
			}
		}
		
		for(int i = n - 1; i > 0; i--) { //ㅛ 형태
			long a = sum(i, n, 0, m);
			
			for(int j = 1; j < m; j++) {
				long b = sum(0, i, 0, j);
				long c = sum(0, i, j, m);
				
				long temp = a * b * c;
				
				if(result < temp) {
					result = temp;
				}
			}
		}
		
		for(int i = 1; i < m; i++) { //ㅑ 형태
			long a = sum(0, n, 0, i);
			
			for(int j = 1; j < n; j++) {
				 long b = sum(0, j, i, m);
				 long c = sum(j, n, i, m);
	                
	             long temp = a * b * c;
	                
	             if(result < temp) {
	            	 result = temp;
	             }
			}
		
			for(int j = i + 1; j < m; j++) { // ㅣㅣㅣ 형태
	            long b = sum(0, n, i, j);
	            long c = sum(0, n, j, m);
	            
	            long temp = a * b * c;
	            
	            if(result < temp) {
	                result = temp;
	            }
	        }    
	    }
    
	    for(int i = m - 1; i > 0; i--) { //ㅕ 형태
	        long a = sum(0, n, i, m);
	        
	        for(int j = 1; j < n; j++) {
	            long b = sum(0, j, 0, i);
	            long c = sum(j, n, 0, i);
	            
	            long temp = a * b * c;
	            
	            if(result < temp) {
	                result = temp;
	            }
	        }
	    }
	    System.out.println(result);
	}
}