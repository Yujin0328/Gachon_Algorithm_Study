import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_4963{
	static int[][] arr;
	static boolean[][] visit;
	static int width, height;
	
	static int dfs(int x, int y) {
		int[] movex = {0, 0, 1, -1, -1, 1, -1, 1};
		int[] movey = {1, -1, 0, 0, -1, 1, 1, -1};
		
		visit[x][y] = true;
		
		for(int i = 0; i < 8; i++) {
			int changex = movex[i] + x;
			int changey = movey[i] + y;
			
			if(changex > 0 && changey > 0 && changex <= height && changey <= width) {
				if(arr[changex][changey] == 1 && !visit[changex][changey]) {
					dfs(changex, changey);
				}
			}
		}
		
		return 1;
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			width = scanner.nextInt();
			height = scanner.nextInt();
			int count = 0;
			
			if(width == 0 && height == 0) {
				break;
			}
			
			arr = new int[height+1][width+1];
			visit = new boolean[height+1][width+1];
			
			for(int i = 1; i <= height; i++) {
				for(int j = 1; j <= width; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			
			for(int i = 1; i <= height; i++) {
				for(int j = 1; j <= width; j++) {
					if(arr[i][j] == 1 && !visit[i][j]) {
						count+= dfs(i, j);
					}
				}
			}
			
			System.out.println(count);
		}
	}
}