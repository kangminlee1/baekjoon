package baekjoon;

import java.util.Scanner;

public class baekjoon10810 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N=in.nextInt();
		int M=in.nextInt();
		int[] arrN= new int[N];
		
		for(int a=0;a<M;a++) {
			int i=in.nextInt();
			int j=in.nextInt();
			int k=in.nextInt();


			for(int b=i-1;b<j;b++) {
				arrN[b]=k;
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(arrN[i]+" ");
		}
		
	}

}
