package baekjoon;

import java.util.Scanner;

public class baekjoon2740 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N=in.nextInt();
		int M=in.nextInt();
		//행과 열을 입력 받음
		int[][] A=new int[N][M];
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				A[i][j]=in.nextInt();
			}
		}
		//A행렬 입력 끝
		M=in.nextInt();
		int K=in.nextInt();
		
		int[][] B=new int[M][K];
		
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[i].length;j++) {
				B[i][j]=in.nextInt();
			}
		}
		//B행렬 입력 끝
		
		
//		행렬 계산 		
		/*
		 연산 과정
		 A(3*2) B(2*3)
		 A=(a b)
		   (c d)
		   (e f)
		 B=(g h i)
		   (j k l)
		 
		 A*B(3*3)
		 =
		 (ag + bj) (ah + bk) (ai + bl)
		 (cg + dj) (ch + dk) (ci + dl)
		 (eg + fj) (eh + fk) (ei + el)
		 
		 */
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				int sum=0;//행렬 값을 저장할 변수
				for(int k=0;k<M;k++) {
					sum+=A[i][k] * B[k][j];
				}//A i행과 j열 계산이 끝나면 바로 출력
				System.out.print(sum+" ");
			}
			System.out.println();//줄바꿈
		}

		
		
	}

}
