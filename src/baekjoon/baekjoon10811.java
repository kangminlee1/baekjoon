package baekjoon;

import java.util.Scanner;

public class baekjoon10811 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N=in.nextInt();
		int M=in.nextInt();
		
		int[] arrN=new int[N];
		
		for(int i=0;i<N;i++) {
			arrN[i]=i+1;
		}
		
		for(int a=0;a<M;a++) {
			int i=in.nextInt()-1;
			int j=in.nextInt()-1;
			
			while(i<j) {
				int temp = arrN[i];
				arrN[i++]=arrN[j];
				arrN[j--]=temp;
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arrN[i]+" ");
		}
		
		
	}

}
