import java.util.*;
import java.lang.*;


public class Number_10808 {  
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		int [] alph = new int[26];
		
		String input = scanner.next();
		
		for(int i = 0; i < input.length(); i++) {
			alph[(int)(input.charAt(i) - 'a')]++;
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alph[i] + " ");
		}
	}
}