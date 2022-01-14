import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_2220 {
	
	
	public static void main(String[] args) throws IOException {    
		Scanner scanner = new Scanner(System.in);
				
		int n = scanner.nextInt();
		
		int[] array = new int[n+1];
		
		
		for (int i = 1; i < n; i++) { //1부터 n-1까지 최대힙
			for (int j = i; j > 1; j /= 2) {
				array[j] = array[j / 2]; // 최솟값 최댓값 변경, 자식노드 > 부모노드일 시 교환
			}
			
			array[1] = i + 1; //루트 노드에 최댓값
		}
		
		array[n] = 1; //마지막 노드에 최솟값
		
		for (int i = 1; i <= n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}