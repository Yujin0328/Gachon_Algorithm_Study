import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_2800{
	
	static Map<Integer, Integer> position = new HashMap<>(); // ( ) index 저장
	static List<Integer> positionindex = new ArrayList<>();// ( index 저장
	static Stack<Integer> stack = new Stack<>();
	static String input;
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();

		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') {
				stack.push(i);
				positionindex.add(i);
			}
			else if(input.charAt(i) == ')') {
				position.put(stack.pop(), i);
			}
		}
		
		Set<String> set = new HashSet<>();
		
		for(int i = 1; i < (1 << positionindex.size()); i++) {//경우의 수에 따른 부분 집합
			StringBuilder string = new StringBuilder();
			Map<Integer, Integer> index = new HashMap<>();
			
			for(int j = 0; j < positionindex.size(); j++) {//비트 마스킹 활용 부분 집합
				if((i & (1 << j)) != 0) {
					index.put(positionindex.get(j), position.get(positionindex.get(j)));
				}
			}
			
			for(int k = 0; k < input.length(); k++) {
				if(input.charAt(k) == '(' && index.containsKey(k)) continue; // ( 제외
				if(input.charAt(k) == ')' && index.containsValue(k)) continue; // ) 제외
				
				string.append(input.charAt(k));
			}
			set.add(string.toString());
		}
		
		List<String> output = new ArrayList<>(set); // 중복 제거
		Set<String> temp = new HashSet<String>(output);
		List<String> print = new ArrayList<String>(temp);

		Collections.sort(print); //정렬
		
		for(int i = 0; i < print.size(); i++) {
			if(!print.get(i).equals(input))
				System.out.println(print.get(i));
		}
	}
}