import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1969{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
	    
		int num = scanner.nextInt();
		int len = scanner.nextInt();
	    String [] change = new String[len];
	    
	    int count = 0;
	    String result = "";
	    
	    for(int i = 0; i < num; i++) { //���� �������� ������
	    	String dna = scanner.next();
	    	
	    	if(i == 0) { //String �迭 �ʱ�ȭ
	    		for(int j = 0; j < len; j++) {
		    		change[j] = Character.toString(dna.charAt(j));
		    	}
	    	}
	    	else {
		    	for(int j = 0; j < len; j++) {
		    		change[j] = change[j] + dna.charAt(j);
		    	}
	    	}
	    }
	    
	    for(int i = 0; i < len; i++) {
	    	int [] alph = new int[26];
	    	int max = 0;
	    	
	    	for(int j = 0; j < num; j++) {
	    		alph[change[i].charAt(j) - 'A']++;
	    		
	    		if(alph[change[i].charAt(j) - 'A'] > max) {
	    			max = alph[change[i].charAt(j) - 'A'];
	    		}
	    	}
	    	
	    	count += num - max; //Hamming Distance �� �����ֱ�

	    	for(int j = 0; j < 26; j++) { //DNA ����
	    		if(alph[j] == max) {
	    			result += (char)(j + 65);
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(result);
	    System.out.println(count);
	}
}