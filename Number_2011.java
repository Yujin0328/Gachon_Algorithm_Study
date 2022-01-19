import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_2011 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		String input = scanner.next();
		int arr[] = new int[input.length() + 1];
		
		arr[0] = 1;
		
		for(int i = 1; i <= input.length(); i++) {
			int one = input.charAt(i - 1) - '0'; //���� �ڸ�
			
			if(one != 0) { //0�� �ƴϸ� ���� ��ġ
				arr[i] += arr[i - 1];
				arr[i] %= 1000000;
			}
			
			if(i == 1) continue;
			
			int two = input.charAt(i - 2) - '0'; //���� �ڸ�
			
			if(two == 0) continue;
			
			int ten = two * 10 + one; //�� �� �� �� ��
			
			if(ten >= 10 && ten <= 26) { //�߰� ��� �ʿ�
				arr[i] += arr[i - 2]; // ten ������ �� �����ֱ�
				arr[i] %= 1000000;
			}
		}
		System.out.println(arr[input.length()]);
	}
}