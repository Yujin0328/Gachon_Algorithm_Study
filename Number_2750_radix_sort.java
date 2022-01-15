import java.util.*;
import java.lang.*;
import java.io.*;


public class Number_2750_radix_sort {
	static int getMax(int[] data) {
		int max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	static void countSort(int[] data, int digit) {
		int[] output = new int[data.length];
		int[] count = new int[10];
		
		for(int i = 0; i < data.length; i++) {
			count[(data[i]/digit)%10]++;
		}

		for(int i = 1; i < 10; i++) {
			count[i] += count[i-1];
		}

		for(int i = data.length - 1; i >= 0; i--) {
			output[count[(data[i] / digit % 10)] - 1] = data[i];
			count[(data[i] / digit) % 10]--;
		}

		for(int i=0; i<data.length; i++) {
			data[i] = output[i];
		}
	}
	
	static void radixsort(int[] data) {
		int m = getMax(data);
		for(int digit = 1; m / digit > 0; digit *= 10) {
			countSort(data, digit);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int [] minus = new int[number];
		int [] plus = new int[number];
		int zero = 0;
		
		for(int i = 0; i < number; i++) {
			int input = scanner.nextInt();
			if(input < 0) {
				minus[i] = -1 * input;
				
			}
			else if(input == 0) {
				zero = 1;
			}
			else {
				plus[i] = input;
			}
		}
		
		radixsort(minus);
		radixsort(plus);
		
		for(int i = number - 1; i >= 0; i--) {
			if(minus[i] != 0) {
				System.out.println(-1 * minus[i]);
			}
		}
		
		if(zero == 1) {
			System.out.println(0);
		}
		
		for(int i = 0; i < number; i++) {
			if(plus[i] != 0) {
				System.out.println(plus[i]);
			}
		}
	}

}