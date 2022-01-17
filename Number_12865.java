import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_12865 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int arr[][] = new int[n+1][2];
		int result[][] = new int[n+1][k+1];
				
		for(int i = 1;i < n+1; i++) {
			arr[i][0] =scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
				
		for(int i = 1;i <= n; i++) {
			for(int j = 1;j <= k; j++) {
				if(j - arr[i][0] >= 0) {//추가 가능 경우
					
					//이전 result에 저장된 누적 가치와 자신의 가치+남은 무게의 가치 중 큰 값
					result[i][j] = Math.max(result[i-1][j], arr[i][1]+result[i-1][j-arr[i][0]]);
					
				}else {//result 값 그대로 유지
					result[i][j] = result[i-1][j];
				}
			}
		}
				
		System.out.println(result[n][k]);
	}	
}