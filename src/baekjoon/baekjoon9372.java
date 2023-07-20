package baekjoon;

import java.util.Scanner;

public class baekjoon9372 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		
		while(T-->0) {
			int N=in.nextInt();
			int M=in.nextInt();
			
			int[][] arr=new int[M][2];
			
			for(int i=0;i<M;i++) {
				arr[i][0]=in.nextInt();
				arr[i][1]=in.nextInt();
			}//그냥 트리의 성질로 모든 국가를 방문하기 위해서는 연결된 간선의 수만큼 피룡하므로 N-1만 하면되는 문제였다
			
			System.out.println(N-1);
		}
		
	}

}
