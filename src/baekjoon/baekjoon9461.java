package baekjoon;
//파도반 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon9461 {

	public static long[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());//테스트 케이스
		
		dp = new long[101];//100까지 입력을 받음
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
				
		while(TC-->0) {
			int N = Integer.parseInt(br.readLine());//N번째
		
			for(int i = 3; i<=N; i++) {
				//피보나치와 비슷
				//피보나치는 dp[n] = [n-1] + [n-]
				//규칙을 찾다보니 발견해서 풀었는데 다른 방식이 있는지 더 찾아보자
				dp[i] = dp[i-2] + dp[i-3];
			}
			
			System.out.println(dp[N]);
			
			
		}
		
		
	}
	
	//더 찾아본 결과 내가 한 방식은 백트래킹(무조건 탐색) 방식
	//즉, 동적계획에 취지에 맞지 않고 효율도 급격히 떨어진다 함
	public static long pado(int N) {
		
		if(dp[N] == -1) {//탐색하지 않았을 때
			dp[N] = pado(N-2) + pado(N-3);
		}
		
		return dp[N];
	}

}
