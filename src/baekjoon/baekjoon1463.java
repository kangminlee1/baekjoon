package baekjoon;

import java.util.Scanner;

public class baekjoon1463 {
	
	static int calculation(int num, int count) {
		
		if(num<2) {
			return count;
		}
		else
			return Math.min(calculation(num/3, count + 1 + num%3),
					calculation(num/2, count + 1 + num%2));
	}

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num =in.nextInt();
		
		System.out.println(calculation(num, 0));
	}

}
