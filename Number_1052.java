import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_1052 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); //2�� ���� ���� �Ǿ�� �ϳ��� ��ĥ �� ����
		int k = scanner.nextInt();

		int count = 0;
		
		while(true) {
			int temp_count = 0;
			int temp_n = n;
			
			while(temp_n > 0) {
				temp_count += temp_n % 2; //�������� 1�� ��� ���� 1�� �߰�
				temp_n /= 2; 
			}
			
			if(temp_count <= k) {
				break;
			}
		
			count++;
			n++; //���� 1�� ���� �ݿ�
		}
		
		System.out.println(count);
	}
}