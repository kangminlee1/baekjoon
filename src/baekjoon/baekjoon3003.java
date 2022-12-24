package baekjoon;

import java.util.Scanner;

public class baekjoon3003 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int[] N=new int[6];
		int A[]= {1,1,2,2,2,8};
		int[] an=new int[6];//출력값 저장
		
		for(int i=0;i<N.length;i++) {
			N[i]=in.nextInt();
			if(N[i]>A[i])//초과
			an[i]=A[i]-N[i];
			else if(N[i]<A[i])//미만
				an[i]=A[i]-N[i];
		}
		for(int i=0;i<N.length;i++)
			System.out.print(an[i]+" ");
		
	}
}
