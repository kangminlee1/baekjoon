package baekjoon;
//2*n 타일링
//파도반 수열이랑 같은 문제임

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon11726 {

	public static Long[] dp = new Long[1001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp[1] = 1L;
		dp[2] = 2L;
		dp[3] = 3L;
		
		System.out.println(tile(N));
	}
	
	public static long tile(int N) {
		
		if(dp[N] == null) {
			dp[N] = tile(N-2) + tile(N-1);
		}
		
		
		return dp[N];
	}
	
	

}
