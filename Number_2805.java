import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_2805{
	
	static int n, m;
	static int[] tree;
	static long max = 0;
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		tree = new int[n+1];
		
		for(int i = 1; i < n + 1; i++) {
			tree[i] = scanner.nextInt();
			max = Math.max(max,  tree[i]); // 가장 높은 나무 길이
		}
		
		long start = 0, end = max;
		
		while(start <= end) {
			long middle = (start + end) / 2;
			long sum = 0;
			
			for(int i = 1; i < n + 1; i++) {
				if(tree[i] > middle) {
					sum += tree[i] - middle;
				}
			}
			
			if(sum >= m) { // 기준 선 올리기
				start = middle + 1;
			}
			else { // 기준 선 내리기
				end = middle - 1;
			}
		}
		
		System.out.println(end);
	}
}