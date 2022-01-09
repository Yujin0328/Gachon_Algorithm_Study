import java.util.*;
import java.lang.*;


public class Number_10820 {  
	public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			int lower = 0, upper = 0, digit = 0, space = 0;
			
			for(int i = 0; i < input.length(); i++) {
				char check = input.charAt(i);
				
				if(Character.isDigit(check))
					digit++;
				else if(Character.isUpperCase(check))
					upper++;
				else if(Character.isLowerCase(check))
					lower++;
				else if(Character.isWhitespace(check)) {
					space++;
				}
			}
			
			System.out.println(lower + " " + upper + " " + digit + " " + space);
		}
	}
}