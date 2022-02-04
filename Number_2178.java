import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_2178{
	static int n, m;
	static int[] movex = {0, 1, 0, -1}; // 상우하좌
	static int[] movey = {1, 0, -1, 0};
	static int[][] maze;
	static boolean[][] visit;
	
	public static void bfs(int x, int y) {
		Queue<Integer> queuex = new LinkedList<>();
		Queue<Integer> queuey = new LinkedList<>();
		
		queuex.offer(0);
		queuey.offer(0);
		
		while(!queuex.isEmpty()) {
			int nowx = queuex.poll();
			int nowy = queuey.poll();
			
			for(int i = 0; i < 4; i++) { //상하좌우 확인
				int tempx = nowx + movex[i];
				int tempy = nowy + movey[i];
				
				if(tempx >= 0 && tempy >= 0 && tempx < n && tempy < m) {
					if(maze[tempx][tempy] == 1 && !visit[tempx][tempy]) {//유효 범위 확인
						queuex.offer(tempx);
						queuey.offer(tempy);
						
						visit[tempx][tempy] = true;
						
						maze[tempx][tempy] = maze[nowx][nowy] + 1; // 이동 횟수 + 1
					}
				}
			}
		}
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		maze = new int[n][m];
		visit = new boolean[n][m];
		visit[0][0] = true;
		
		for(int i = 0; i < n; i++) {
			String input = scanner.next();
			for(int j = 0; j < m; j++) {
				maze[i][j] = input.charAt(j) - '0';
			}
		}
		
		bfs(0, 0);
		
		System.out.println(maze[n-1][m-1]);
	}
}