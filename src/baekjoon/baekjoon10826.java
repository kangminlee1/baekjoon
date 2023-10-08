package baekjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.math.BigInteger;

public class baekjoon10826 {
	//bigInteger와 다이나믹방법을 사용해서 풀어야함
	
//	public static int fibo(int N) {
//		if(N == 0) {
//			return 0;
//		}
//		
//		if(N == 1) {
//			return 1;
//		}
//
//		return fibo(N-1) + fibo(N-2);
//	}
//기존 알던 방식은 시간초과 발생
	//다이나믹 프로그래밍과 빅인티져를 사용해야함.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[10001];
		dp[0] = new BigInteger("0");
		dp[1] = new BigInteger("1");
		
		for(int i = 2; i<=N; i++) {
			dp[i] = dp[i-2].add(dp[i-1]);
		}
		System.out.println(dp[N]);
		
	}

}
