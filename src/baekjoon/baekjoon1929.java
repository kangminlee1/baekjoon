package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1929 {
	
	public static StringBuffer sb = new StringBuffer();
	
	public static void findPrime(int num) {
		boolean isPrime = true;
		
		if(num == 1) {
			return;
		}
		
		for(int i = 2; i <= (int)Math.sqrt(num); i++ ) {
			if(num%i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
		sb.append(num).append("\n");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = M; i <= N; i++) {
			findPrime(i);
		}
		
		System.out.print(sb);

	}

}
