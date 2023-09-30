package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon13241 {
	
	public static long LCM(long x, long y) {//최소 공배수
		return (x*y)/GCD(x, y);
	}
	
	public static long GCD(long x, long y) {//최대 공약수
		long big = 0;
		long small = 0;
		if(x>y) {
			big = x;
			small = y;
		}
		if(x<y) {
			big = y;
			small = x;
		}
		if((big+small)%big==0)
			return big;//이부분 실수
		else
			return GCD(small, big%small);
	}

	public static void main(String[] args) throws IOException {
		//유클리드 호제법 공부하며 푼 것
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		System.out.println(LCM(N, M));
		
		
	}

}
