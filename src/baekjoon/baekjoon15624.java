package baekjoon;
//피보나치7

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon15624 {

	public static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[1000001];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			dp[i] = (dp[i-2] + dp[i-1]) % 1000000007;
			//n이 커지면 피보나치 수가 너무 커지니까 나머지로 구해서 수를 int 범위를 벗어나지 않게 하는 것
		}

		System.out.println(dp[n]);
	}

}
