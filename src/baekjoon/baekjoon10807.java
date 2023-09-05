package baekjoon;

import java.util.Scanner;

public class baekjoon10807 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N =in.nextInt();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		
		int v=in.nextInt();
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(v==arr[i])
				count++;
		}
		
		System.out.println(count);
	}

}
