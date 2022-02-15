import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1107{
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		int target = scanner.nextInt();
		int num = scanner.nextInt();
		
		boolean[] remote = new boolean[10];
		
		for(int i = 0; i < num; i++) {
			int input = scanner.nextInt();
			remote[input] = true;
		}
		
		int count = Math.abs(target - 100); // +, -만 사용
		
		for(int i = 0; i <= 999999; i++) {
			String now = String.valueOf(i);
			int length = now.length();
			boolean stop = false;
			
			for(int j = 0; j < length; j++) {
				if(remote[now.charAt(j) - '0']) { //고장난 버튼
					stop = true;
					break;
				}
			}
			
			if(!stop) { //고장나지 않은 버튼
				int min = Math.abs(target - i) + length; //i 클릭 후 target까지 이동 횟수
				count = Math.min(min, count);
			}
		}
		System.out.println(count);
	}
}