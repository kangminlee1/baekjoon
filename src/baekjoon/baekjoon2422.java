package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2422 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[][] TF = new boolean[N+1][N+1];
		
		for(int i = 0 ; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			TF[A][B] =true;
			TF[B][A] =true;
		}
		
		int count = 0;
		for(int i = 1; i<=N; i++) {
			for(int j= i + 1; j<=N; j++) {
				if(TF[i][j])
					continue;//2개가 맞지 않은 조합
				for(int k = j + 1; k<=N; k++) {
					if(!TF[j][k] && !TF[k][i]) {
						count++;//새로 뽑은 것과 1,2번쨰가 안맞는지 확인
					}
				}
			}
		}
		System.out.println(count);
	}

}
