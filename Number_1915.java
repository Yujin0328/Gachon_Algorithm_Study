import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_1915 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];
        int dp[][] = new int[n][m];
        int result = 0;
        
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            for(int j=0; j<m; j++){
                arr[i][j] = s.charAt(j) - 48;
                if(arr[i][j] == 1){
                    dp[i][j] = 1;
                    result = 1;
                }
            }
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
            	//왼쪽, 위쪽, 왼-위쪽 대각선, 현재 값 1 확인 후 일치 시, 셋 중 가장 작은 값 + 1(dp[i][j] 포함) 저장
                if(arr[i-1][j] == 1 && arr[i-1][j-1] == 1 && arr[i][j-1] == 1 && arr[i][j] == 1){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]);
                    dp[i][j] = Math.min(dp[i][j],  dp[i][j-1]) + 1;
                }
                result = Math.max(dp[i][j], result);
            }
        }
        System.out.println(result * result);
   	}
}