import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_1727 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] men = new int[n];
		int[] women = new int[m];
		int[][] dp = new int[n + 1][m + 1];
		
		for(int i = 0; i < n; i++) {
			men[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			women[i] = scanner.nextInt();
		}
		
		Arrays.sort(men);
		Arrays.sort(women);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == j) {//커플만
					dp[i + 1][j + 1] = dp[i][j] + Math.abs(men[i] - women[j]);
				}
				
				if(i > j) { //커플 + 남자 솔로
					dp[i + 1][j + 1] = Math.min(dp[i][j] + Math.abs(men[i] - women[j]), dp[i][j + 1]);
				}
				if(i < j) { //커플 + 여자 솔로
					dp[i + 1][j + 1] = Math.min(dp[i][j] + Math.abs(men[i] - women[j]), dp[i + 1][j]);
				}
			}
		}
		
		System.out.println(dp[n][m]);
	}
}