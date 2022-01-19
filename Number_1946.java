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
			int count = 1; //1���� ������ �հ�
			
			for(int j = 0; j < num; j++) {
				int paper = scanner.nextInt();
				int interview = scanner.nextInt();
				
				score[paper] = interview; //���� ����� index�� ���
			}
			
			int interviewrank = score[1];
			
			for(int j = 2; j <= num; j++) {
				if(interviewrank >= score[j]) { //���� ���� Ȯ��
					interviewrank = score[j];
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}