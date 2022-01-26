import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1966{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i = 0; i < test; i++) {
			int size = scanner.nextInt(); //문서 수
			int[] value = new int[size]; // 중요도 비교를 위한 배열
			Queue<Integer> queue = new LinkedList<>();
			int goal = scanner.nextInt(); // 목표 문서 index
			int count = 0; //결과값
			
			for(int j = 0; j < size; j++) {
				int input = scanner.nextInt();
				value[j] = input;
				queue.offer(input);
			}
			
			Arrays.sort(value); // 오름차순 정렬
			int maxvalue = size - 1; //가장 큰 중요도값
			
			while(true) {	
				if(value[maxvalue] > queue.peek()) { //현재 문서보다 중요도 높은 문서 존재
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
	
					maxvalue--; //최대 중요도 조절
					
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