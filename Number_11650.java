import java.util.*;
import java.lang.*;


public class Number_11650 {
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int []>() {
			
			@Override 
			public int compare(int o1[], int o2[]) { 
				if(o1[0] == o2[0]) { 
					return o1[1] - o2[1]; //2열 기준 오름차순 정렬 후 리턴
				}else { 
					return o1[0] - o2[0]; //1열 기준 정렬
					} 
				} 
			}
		);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " +arr[i][1]);
		}
	}
}