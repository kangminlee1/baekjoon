package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon9184 {

	public static StringBuffer sb = new StringBuffer();
	public static int[][][] dp = new int[21][21][21];
	//함수 w에서 a,b,c 중에서 20이 넘어가면 w(20,20,20)을 호출하고
	//0 이하일 경우에는 1을 반환
	//각 배열의 크기가 21을 넘기지 않음(0~20)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) +"\n");
			
		}
		
		System.out.println(sb);
		
	}

	public static int w(int a, int b, int c) {
		
		if(inRange(a, b, c) && dp[a][b][c] != 0) {
			//a, b, c가 범위를 벗어 나지 않고 메모이제이션이 되어 있을 경우
			return dp[a][b][c];
		}
		
		if( a <= 0 || b <= 0 || c <= 0 ) {//0보다 작으면 1
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		
		if(a < b && b < c) {
			return dp[a][b][c] = (w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
		}

			return dp[a][b][c] =  (w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1));
	}
	
	public static boolean inRange(int a, int b, int c) {
		return (0 <= a && a <= 20 && 0 <= b && b<=20 && 0 <= c && c <= 20);
		
	}
}
