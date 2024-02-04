package baekjoon;
//2*N 타일링 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon11727 {
	
	public static Long[] dp = new Long[1001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1L;
		dp[2] = 3L;
		dp[3] = 5L;
		
		System.out.println(tile(N));
		
		
	}
	
	public static long tile(int N) {
		
		if(dp[N] == null) {
			dp[N] = (tile(N-1) + 2*tile(N-2))%10007;
			
		}
		
		return dp[N];
	}

}
