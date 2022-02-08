import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_8986{
	
	static long arr[];
	
	public static long cal(long x, long num) {
		long temp = 0;
		
		for(int i = 1; i < num; i++) {
			temp += Math.abs(arr[i] - x * i);
		}
		
		return temp;
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		long num = scanner.nextLong();
		arr = new long[(int) num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scanner.nextLong();
		}
		
		if(num == 1) {
			System.out.println(0);
			return;
		}
		
		long low = 1, high = (long) 1e9;
		
		while(high - low >= 3) {
			long left = (low * 2 + high) / 3;
			long right = (low + high * 2) / 3;
			
			if(cal(left, num) <= cal(right, num)) {
				high = right;
			}
			else {
				low = left;
			}
		}
		
		long result = (long) 2e18;
		
		for(long i = low; i <= high; i++) {
			result = Math.min(result, cal(i, num));
		}
		
		System.out.println(result);
	}
}