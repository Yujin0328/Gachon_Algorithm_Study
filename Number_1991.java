import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_1991{
	
	static Map<String, List<String>> map = new HashMap<>();
	
	static void preorder(String root) { //전위 순회
		if(root.equals("."))
			return;
		
		System.out.print(root);
		preorder(map.get(root).get(0));
		preorder(map.get(root).get(1));
	}
	
	static void inorder(String root) { // 중위 순회
		if(root.equals("."))
			return;
		
		inorder(map.get(root).get(0));
		System.out.print(root);
		inorder(map.get(root).get(1));
	}
	
	static void postorder(String root) { // 후위 순회
		if(root.equals("."))
			return;
		
		postorder(map.get(root).get(0));
		postorder(map.get(root).get(1));
		System.out.print(root);
	}
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			String root = scanner.next();
			String left = scanner.next();
			String right = scanner.next();
			List<String> list = new ArrayList<>();
			
			list.add(left);
			list.add(right);
			map.put(root, list);
		}
		
		preorder("A");
		System.out.println();
		inorder("A");
		System.out.println();
		postorder("A");
	}
}