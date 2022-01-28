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
			int target = deque.indexOf(input.peek()); //찾고자 하는 수 index
			int half = 0;
			if(deque.size() % 2 == 0) { // 중간 index
				half = deque.size() / 2 - 1;
			}
			else {
				half = deque.size() / 2;
			}
			
			if(target <= half) { // 찾고자 하는 수가 중간, 중간 이전에 있는 경우
				for(int j = 0; j < target; j++) {
					deque.offerLast(deque.pollFirst()); //왼쪽으로 이동
					count++;
				}
			}
			else { // 찾고자 하는 수가 중간 이후에 있는 경우
				for(int j = 0; j < deque.size() - target; j++) {
					deque.offerFirst(deque.pollLast()); //오른쪽으로 이동
					count++;
				}
			}
			deque.pollFirst(); //첫 번째 원소 뽑아내기
			input.poll(); //찾은 값 제거
		}
		System.out.println(count);
	}
}