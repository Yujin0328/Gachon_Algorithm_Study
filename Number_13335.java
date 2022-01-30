import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_13335{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int truck = scanner.nextInt();
		int length = scanner.nextInt();
		int weight = scanner.nextInt();
		int time = 0;
		int nowweight = 0;
		
		Queue<Integer> truckweight = new LinkedList<>(); //���� Ʈ���� ����
		Queue<Integer> bridge = new LinkedList<>(); //���� �ٸ� ��Ȳ
		
		for(int i = 0; i < truck; i++) {
			truckweight.add(scanner.nextInt());
		}
		
		for(int i = 0; i < length; i++) {
			bridge.add(0);
		}
		
		while(!bridge.isEmpty()) {
			time++;
			nowweight -= bridge.poll();
			
			if(!truckweight.isEmpty()) {
				if(truckweight.peek() + nowweight <= weight) {
					nowweight += truckweight.peek();
					bridge.add(truckweight.poll());
				}
				else {
					bridge.add(0);
				}
			}
		}
		System.out.println(time);
	}
}