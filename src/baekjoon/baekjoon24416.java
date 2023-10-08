package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon24416 {
	
	public static int[] dp;
	public static int count_fib = 0;
	public static int count_fibonacci = 0;

	public static int fib(int N) {
		if(N==1 || N==2) {
			count_fib++;
			return 1;
		}
		else {
			return fib(N-1) + fib(N-2);
		}
		
	}
	
	public static int fibonacci(int N) {
		for(int i= 2; i<N; i++) {
			count_fibonacci++;
			dp[i]= dp[i-1]+dp[i-2];
		}
		return dp[N-1];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp = new int[N];
		dp[0] = 1;
		dp[1] = 1;
		
		fib(N);
		fibonacci(N);
		
		System.out.print(count_fib+" "+count_fibonacci);
	}

}
