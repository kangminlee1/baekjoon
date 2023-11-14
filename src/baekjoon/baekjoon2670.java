package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2670 {
	
	public static double[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//N개의 실수
		double[] arr = new double[N+1];
		
		double max = Integer.MIN_VALUE;//최대 값
		
		dp = new double[N+1];
		
		for(int i = 1; i<=N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			dp[i] = Math.max(arr[i], dp[i-1]*arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(String.format("%.3f",max));
	}

}
