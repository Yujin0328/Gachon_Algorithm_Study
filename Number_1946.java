import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_1946 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		
		for(int i = 0; i < test; i++) {
			int num = scanner.nextInt();
			int [] score = new int[num + 1];
			int count = 1; //1등은 무조건 합격
			
			for(int j = 0; j < num; j++) {
				int paper = scanner.nextInt();
				int interview = scanner.nextInt();
				
				score[paper] = interview; //서류 등수를 index로 사용
			}
			
			int interviewrank = score[1];
			
			for(int j = 2; j <= num; j++) {
				if(interviewrank >= score[j]) { //선발 조건 확인
					interviewrank = score[j];
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}