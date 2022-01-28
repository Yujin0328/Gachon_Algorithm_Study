import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1021{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int queuesize = scanner.nextInt();
		int output = scanner.nextInt();
		LinkedList<Integer> deque = new LinkedList<>();
		Queue<Integer> input = new LinkedList<>();
		int count = 0;
		
		for(int i = 1; i <= queuesize; i++) {
			deque.add(i);
		}
		
		for(int i = 0; i < output; i++) {
			input.add(scanner.nextInt());
		}
		
		while(!input.isEmpty()) {
			int target = deque.indexOf(input.peek()); //ã���� �ϴ� �� index
			int half = 0;
			if(deque.size() % 2 == 0) { // �߰� index
				half = deque.size() / 2 - 1;
			}
			else {
				half = deque.size() / 2;
			}
			
			if(target <= half) { // ã���� �ϴ� ���� �߰�, �߰� ������ �ִ� ���
				for(int j = 0; j < target; j++) {
					deque.offerLast(deque.pollFirst()); //�������� �̵�
					count++;
				}
			}
			else { // ã���� �ϴ� ���� �߰� ���Ŀ� �ִ� ���
				for(int j = 0; j < deque.size() - target; j++) {
					deque.offerFirst(deque.pollLast()); //���������� �̵�
					count++;
				}
			}
			deque.pollFirst(); //ù ��° ���� �̾Ƴ���
			input.poll(); //ã�� �� ����
		}
		System.out.println(count);
	}
}