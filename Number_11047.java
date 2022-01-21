import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_11047{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
	    
	    int n = scanner.nextInt();
	    int money = scanner.nextInt();
	    int count = 0;
	    int [] coin = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        coin[i] = scanner.nextInt();
	    }
	    
	    for(int i = n - 1; i >= 0; i--){
	        count += money / coin[i];
	        money %= coin[i];
	        
	        if(money == 0)
	            break;
	    }
	    
	    System.out.println(count);
	}
}