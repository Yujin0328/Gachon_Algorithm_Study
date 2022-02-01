import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_11724{
	
	static boolean[][] graph;
	static boolean[] visit;
	
	static void dfs(int x, int node, int count) {		
		visit[x] = true;
		
		for(int i = 0; i < node; i++) {
			if(graph[x][i] && !visit[i]) {
				dfs(i, node, count);
			}
		}
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int node = scanner.nextInt();
		int edge = scanner.nextInt();
		int count = 0;

		graph = new boolean[node][node];
		visit = new boolean[node];
		
		for(int i = 0; i < edge; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			graph[x - 1][y - 1] = true;
			graph[y - 1][x - 1] = true;
		}
		
		
		for(int i = 0; i < node; i++) {
			if(!visit[i]) {
				count++;
				dfs(i, node, count);
			}
		}
		
		System.out.println(count);
	}
}