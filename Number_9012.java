import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_9012{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
	    
		int test = scanner.nextInt();
		
		for(int i = 0; i < test; i++) {
			String input = scanner.next();
			
			int count = 0;
			boolean check = true;
			
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == '(') {
					count++;
				}
				else {
					count--;
					if(count < 0) {
						check = false;
						break;
					}
				}
			}
			
			if(count != 0 )
				check = false;
			
			if(check) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}