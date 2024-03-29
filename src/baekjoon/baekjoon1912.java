package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1912 {
	
	public static int max;
	public static int[] arr;
	public static Integer[] dp;
//	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		dp = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		
		continuous_sum(N - 1);
		
		System.out.println(max);

	}
	
	public static int continuous_sum(int N) {

		if(dp[N] == null) {//아직 탐색하지 않음
			
			dp[N] = Math.max(continuous_sum(N-1) + arr[N], arr[N]);

			
			max = Math.max(max, dp[N]);
			
		}
		
		return dp[N];
	}
//오답 노트 
	
	/*
	 * 1. 첫번째로 출력 값이 나오지 않던 문제
	 * StringTokenizer st;
	 * for(int i = 0 ; i < N; i++) {
	 *	<이 부분에 st = new StringTokenizer(br.readLine());을 작성하여 출력 값이 나오지 않음>
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
	 * 2. 29~35 라인 까지 잘못된 값을 받으려 한 문제와 함수 부분에 return을 max로 받은 문제 + dp[N]값을 구하려 할 때 
	 * Math.max(continuous_sum(N-1), arr[N] + arr[N-1] );을 한점
	 * max 값을 출력해야 하는데 continuous_sum(N - 1)의 값을 출력하려 해서 문제가 발생 거기에 더해
	 * 
	 * Math.max(continuous_sum(N-1), arr[N] + arr[N-1] ); 
	 * 문제가 되는 부분은 continuous_sum 메서드에서 arr[N] + arr[N-1] 부분입니다. 이 부분은 연속된 부분 배열의 합을 계산하는 것이 아니라, 현재 요소 arr[N]과 그 이전 요소 arr[N-1]의 합을 계산하는 것입니다.
	 * 따라서 이 부분을 arr[N]과 이전 dp[N-1] 값의 합으로 수정해야 합니다.
	 * 
	 */
	
	
	
}
