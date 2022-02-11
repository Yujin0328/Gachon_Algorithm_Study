import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_11662{
	
	//두 점 사이의 거리
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		double ax = scanner.nextDouble();
		double ay = scanner.nextDouble();
		double bx = scanner.nextDouble();
		double by = scanner.nextDouble();
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double dx = scanner.nextDouble();
		double dy = scanner.nextDouble();
		
		int gap = 1000000;
		
		//시간별 이동 속도
		double minx = (bx - ax) / gap;
		double miny = (by - ay) / gap;
		double gangx = (dx - cx) / gap;
		double gangy = (dy - cy) / gap;
		
		double min = distance(ax, ay, cx, cy);
		
		for(int i = 1; i <= gap; i++) {
			double temp = distance(ax + minx * i, ay + miny * i,
					cx + gangx * i, cy + gangy * i); //일정한 속도로 이동
			
			if(temp < min) {
				min = temp;
			}
		}
		
		System.out.println(min);
	}
}