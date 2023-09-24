package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon5347 {
	
	public static long LCM(int a, int b) {
		long big;
		long small;

		if(a>b) {
			big = a;
			small = b;
		}else{
			big = b;
			small = a;
		}
		
		long gcd = GCD(big, small);
		long result = (big*small)/gcd;
		
		return result;
	}
	
	public static long GCD(long big, long small) {
		if( big%small ==0) {
			return small;
		}
		return GCD(small, big%small);
	}
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<TC; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(LCM(a,b)).append("\n");
		}
		System.out.println(sb);
		

	}

}
