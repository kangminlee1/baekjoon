package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon10211 {

	public static int[] arr, dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int TC = Integer.parseInt(br.readLine());
		
		for(int i =0; i<TC; i++) {
			int N = Integer.parseInt(br.readLine());
			arr = new int[N+1];
			dp = new int[N+1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 1; j<=N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println(getMaxArray(N));
			
		}

	}

	public static int getMaxArray(int N) {//다이나믹 프로그래밍은 생각이 바로 떠오르지 않음
		int max = Integer.MIN_VALUE;
		
		for(int i =1; i<=N; i++) {
			dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
			max = Math.max(max, dp[i]);
		}
		
		return max;
	}//다이나믹 프로그래밍 더 공부
	
}
