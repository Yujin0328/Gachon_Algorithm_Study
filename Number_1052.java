import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_1052 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); //2의 제곱 값이 되어야 하나로 합칠 수 있음
		int k = scanner.nextInt();

		int count = 0;
		
		while(true) {
			int temp_count = 0;
			int temp_n = n;
			
			while(temp_n > 0) {
				temp_count += temp_n % 2; //나머지가 1인 경우 물병 1개 추가
				temp_n /= 2; 
			}
			
			if(temp_count <= k) {
				break;
			}
		
			count++;
			n++; //물병 1개 구입 반영
		}
		
		System.out.println(count);
	}
}