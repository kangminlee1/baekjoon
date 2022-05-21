package baekjoon;

import java.util.Scanner;

public class SquareNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int A=in.nextInt();
		int[] arr=new int[A+1];
		for(int i=1;i<=A;i++) {
			arr[i]=i;
			for(int j=1;j*j<=i;j++) {
				if(arr[i]>arr[i-j*j]+1) {
					arr[i]=arr[i-j*j]+1;
				}
			}
		}
		System.out.println(arr[A]);
	}

}
