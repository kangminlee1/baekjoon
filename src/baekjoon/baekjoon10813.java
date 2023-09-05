package baekjoon;

import java.util.Scanner;

public class baekjoon10813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N=in.nextInt();
		int M=in.nextInt();
		
		int[] arrN=new int[N];
		
		for(int i=0;i<N;i++) {
			arrN[i]=i+1;
		}
		
		for(int a=0;a<M;a++) {
			int i=in.nextInt();
			int j=in.nextInt();
			
			int temp=arrN[i-1];
			arrN[i-1]=arrN[j-1];
			arrN[j-1]=temp;
		}
		for(int i=0;i<N;i++) {
			System.out.print(arrN[i]+" ");
		}
		
	}

}
