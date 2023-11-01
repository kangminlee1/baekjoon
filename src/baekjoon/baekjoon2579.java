package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2579 {
	public static Integer[] dp;
	public static int[] arr;
	
	public static int Memozation(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(Memozation(N-2), Memozation(N-3)+arr[N-1]) + arr[N];
			//현재 계단에서 2칸 전에 메모제이션 값과 3칸 이전에 메모제이션 값에 1칸 전 값을 더한 값중 큰 것을 선택하여 현재 계단에 값을 더함
		}
		
		return dp[N];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int stair = Integer.parseInt(br.readLine());
		arr = new int[stair+1];
		//시작점은 0임
		dp = new Integer[stair+1];
		
		for(int i = 1; i<=stair; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = arr[0];//시작점이고 Integer라 null로 저장되므로 0으로 초기화
		dp[1] = arr[1];
		
		if(stair >= 2) {//계단이 1개 아닐 경우
			dp[2] = arr[1] + arr[2];
		}

		int max = Memozation(stair);
		System.out.println(max);
	}
}



/*
 * 반복문으로 해결하는 방법
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int stair = Integer.parseInt(br.readLine());
		arr = new int[stair+1];
		//시작점은 0임
		dp = new Integer[stair+1];
		
		for(int i = 1; i<=stair; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = arr[0];//시작점이고 Integer라 null로 저장되므로 0으로 초기화
		dp[1] = arr[1];
		
		if(stair >= 2) {//계단이 1개 아닐 경우
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i = 3; i<=stair; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1])+arr[i];
		}
		System.out.println(dp[stair]);
 
 */
