package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon9095 {

	public static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		
		dp = new int[11];//num은 11보다 작음
		dp[0] = 0;//0의 경우 0개
		dp[1] = 1;//1의 경우 1개
		dp[2] = 2;//2의 경우 1+1 or 2 2개
		dp[3] = 4;//3의 경우 1+1+1 or 1+2 or 2+1 or 3 4개
		
		//dp[i] = dp[i-1] + dp[i-2] + dp[i - 3]
		for(int i = 4; i<=10; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i<TC; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(dp[num]+"\n");
			
		}
		System.out.println(sb);
		
	}

}
