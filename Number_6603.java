import java.util.*;
import java.lang.*;


public class Number_6603 {
	
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int k = scanner.nextInt();
			if(k == 0)
				break;
			
			int[] number = new int[k];
			
			for(int i = 0; i < k; i++) {
				number[i] = scanner.nextInt();
			}
			
			for(int a = 0; a < k; a++) {
				for(int b = a + 1; b < k; b++) {
					for(int c = b + 1; c < k; c++) {
						for(int d = c + 1; d < k; d++) {
							for(int e = d + 1; e < k; e++) {
								for(int f = e + 1; f < k; f++) {
									System.out.println(number[a] + " " + number[b] + " " + number[c] + " "
											+ number[d] + " " + number[e] + " " + number[f]);
						
								}
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
}