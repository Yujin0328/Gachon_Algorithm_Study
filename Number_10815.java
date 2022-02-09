import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_10815{
	
	static int n;
	static int[] input;
	
	public static boolean binarysearch(int search) {
		int left = 0, right = n - 1;
		
		while(left <= right) {
			int middle = (left + right) / 2;
			int value = input[middle];
			
			if(search < value) {
				right = middle - 1;
			}
			else if(search > value){
				left = middle + 1;
			}
			else {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main (String[] args) throws IOException{
		//Scanner scanner = new Scanner(System.in); Scanner 사용 시 시간 초과
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer string;
		
		n = Integer.parseInt(buffer.readLine());
		input = new int[n];
		
		string = new StringTokenizer(buffer.readLine(), " ");
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(string.nextToken());
		}
		
		Arrays.sort(input);
		
		int m = Integer.parseInt(buffer.readLine());
		
		string = new StringTokenizer(buffer.readLine(), " ");
		for(int i = 0; i < m; i++) {
			int search = Integer.parseInt(string.nextToken());
			
			if(binarysearch(search)) {
				System.out.print(1 + " ");
			}
			else {
				System.out.print(0 + " ");
			}
		}
	}
}