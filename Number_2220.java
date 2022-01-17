import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_2220 {
	
	
	public static void main(String[] args) throws IOException {    
		Scanner scanner = new Scanner(System.in);
				
		int n = scanner.nextInt();
		
		int[] array = new int[n+1];
		
		
		for (int i = 1; i < n; i++) { //1���� n-1���� �ִ���
			for (int j = i; j > 1; j /= 2) {
				array[j] = array[j / 2]; // �ּڰ� �ִ� ����, �ڽĳ�� > �θ����� �� ��ȯ
			}
			
			array[1] = i + 1; //��Ʈ ��忡 �ִ�
		}
		
		array[n] = 1; //������ ��忡 �ּڰ�
		
		for (int i = 1; i <= n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}