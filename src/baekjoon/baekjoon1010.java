package baekjoon;

import java.util.Scanner;
import java.util.Random;

public class baekjoon1010 {
	
	static int[][] dp=new int[30][30];
	
	static int combi(int M, int N) {//nCr 으로 찾는 것
		if(dp[M][N] > 0) {//이미 찾았을 경우
			return dp[M][N];
		}
		
		if(N==M || N==0) {// nCn or nC0일 경우
			return dp[M][N]=1;
		}
		//위 경우와 해당하지 않을 경우 n+1Cr+1 = nCr + nCr+1
		return dp[M][N] = combi(M-1, N-1) + combi(M-1, N);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int Tc=in.nextInt();
				
		for(int i=0;i<Tc;i++) {
			int N=in.nextInt();
			int M=in.nextInt();
			
			System.out.println(combi(M, N));
			//M개중에서 N개를 골라야 하므로 N, M이 아닌 M, n이다.
		}
		
		
	}

}
