package baekjoon;

import java.util.Scanner;

public class baek2475 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int[] N=new int[5];
		
		for(int i=0;i<N.length;i++) {
			N[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<N.length;i++) {
			N[i]=N[i]*N[i];
			sum+=N[i];
		}
		System.out.println(sum%10);
	}
}