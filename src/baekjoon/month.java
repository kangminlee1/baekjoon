package baekjoon;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
		String[] days= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
		int totalSum=b;
		
		for(int i=0;i<a-1;i++) {
			totalSum+=months[i];
		}
		System.out.println(days[totalSum%7]);
	}
}
