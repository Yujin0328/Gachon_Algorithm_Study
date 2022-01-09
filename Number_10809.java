import java.util.*;
import java.lang.*;


public class Number_10809 {  
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		int [] alph = new int[26];
		
		String input = scanner.next();
		
		for(int i = 0; i < 26; i++) {
			alph[i] = -1;
		}
		
		for(int i = 0; i < input.length(); i++) {
			int position = (int)(input.charAt(i) - 'a');
			
			if(alph[position] == -1) {
				alph[position] = i;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alph[i] + " ");
		}
	}
}