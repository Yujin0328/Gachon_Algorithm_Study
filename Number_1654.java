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
			
			for(int i = 0; i < k; i++) { //middle�� �ڸ� ���� ����
				count += input[i] / middle;
			}
			
			if(count < n) { //upper bound
				max = middle; //�ڸ��� ���� ���̱� == ���� ����
			}
			else {
				min = middle + 1; //�ڸ��� ���� �ø��� == ���� ����
			}
		}
		
		System.out.println(min - 1);
	}
}