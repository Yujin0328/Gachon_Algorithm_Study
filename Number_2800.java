import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_2800{
	
	static Map<Integer, Integer> position = new HashMap<>(); // ( ) index ����
	static List<Integer> positionindex = new ArrayList<>();// ( index ����
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
		
		for(int i = 1; i < (1 << positionindex.size()); i++) {//����� ���� ���� �κ� ����
			StringBuilder string = new StringBuilder();
			Map<Integer, Integer> index = new HashMap<>();
			
			for(int j = 0; j < positionindex.size(); j++) {//��Ʈ ����ŷ Ȱ�� �κ� ����
				if((i & (1 << j)) != 0) {
					index.put(positionindex.get(j), position.get(positionindex.get(j)));
				}
			}
			
			for(int k = 0; k < input.length(); k++) {
				if(input.charAt(k) == '(' && index.containsKey(k)) continue; // ( ����
				if(input.charAt(k) == ')' && index.containsValue(k)) continue; // ) ����
				
				string.append(input.charAt(k));
			}
			set.add(string.toString());
		}
		
		List<String> output = new ArrayList<>(set); // �ߺ� ����
		Set<String> temp = new HashSet<String>(output);
		List<String> print = new ArrayList<String>(temp);

		Collections.sort(print); //����
		
		for(int i = 0; i < print.size(); i++) {
			if(!print.get(i).equals(input))
				System.out.println(print.get(i));
		}
	}
}