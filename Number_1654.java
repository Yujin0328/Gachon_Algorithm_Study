import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1654{
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		int k = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[] input = new int[k];
		
		long max = 0;
		
		for(int i = 0; i < k; i++) {
			input[i] = scanner.nextInt();
			
			max = Math.max(max, input[i]);
		}
		
		max++;
		
		long min = 0, middle = 0;
		
		while(min < max) {
			middle = (min + max) / 2;
			
			long count = 0;
			
			for(int i = 0; i < k; i++) { //middle로 자를 때의 개수
				count += input[i] / middle;
			}
			
			if(count < n) { //upper bound
				max = middle; //자르는 길이 줄이기 == 개수 증가
			}
			else {
				min = middle + 1; //자르는 길이 늘리기 == 개수 감소
			}
		}
		
		System.out.println(min - 1);
	}
}