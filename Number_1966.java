import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1966{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i = 0; i < test; i++) {
			int size = scanner.nextInt(); //���� ��
			int[] value = new int[size]; // �߿䵵 �񱳸� ���� �迭
			Queue<Integer> queue = new LinkedList<>();
			int goal = scanner.nextInt(); // ��ǥ ���� index
			int count = 0; //�����
			
			for(int j = 0; j < size; j++) {
				int input = scanner.nextInt();
				value[j] = input;
				queue.offer(input);
			}
			
			Arrays.sort(value); // �������� ����
			int maxvalue = size - 1; //���� ū �߿䵵��
			
			while(true) {	
				if(value[maxvalue] > queue.peek()) { //���� �������� �߿䵵 ���� ���� ����
					int now = queue.poll();
					queue.offer(now);
					if(goal == 0) {
						goal = queue.size() - 1;
					}
					else {
						goal--;
					}
				}
				else {
					int now = queue.poll();
					count++;
					if(goal == 0) {
						break;
					}
	
					maxvalue--; //�ִ� �߿䵵 ����
					
					if(goal == 0) {
						goal = queue.size() - 1;
					}
					else {
						goal--;
					}
				}
			}
			System.out.println(count);
		}
	}
}