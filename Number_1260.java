import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1260{
	
	static boolean[][] graph = new boolean[1001][1001];
	static boolean[] visit = new boolean[1001];
	
	static void dfs(int first, int node) {
		System.out.print(first + " ");
		
		visit[first] = true;
		
		for(int i = 1; i <= node; i++) {
			if(graph[first][i] && !visit[i]) {
				dfs(i, node);
			}
		}
	}
	
	static void bfs(int first, int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(first);
		visit[first] = true;
		System.out.print(first + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 1; i <= node; i++) {
				if(graph[temp][i] && !visit[i]) {
					queue.offer(i);
					visit[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int node = scanner.nextInt();
		int edge = scanner.nextInt();
		int first = scanner.nextInt();
		
		for(int i = 0; i < edge; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			
			graph[start][end] = true;
			graph[end][start] = true;
		}
		
		dfs(first, node);
		
		for(int i = 0; i <= node; i++) {
			visit[i] = false;
		}
		
		System.out.println();
		
		bfs(first, node);
	}
}