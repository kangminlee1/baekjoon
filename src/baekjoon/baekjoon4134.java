package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon4134 {
	
	public static long find(long n) {
		long min = 0;
		for(long i = n;; i++) {
			if(i == 0 || i == 1 || i == 2) {
				min = 2;
				break;
			}
			if(isPrime(i)) {
				min = i;
				break;
			}
		}
		
		
		return min;
	}
	
	public static boolean isPrime(long n) {
		for(long i = 2; i<=(long)Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());//테스트 케이스
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<TC; i++) {
			long n = Long.parseLong(br.readLine());
			sb.append(find(n)).append("\n");
		}
		
		System.out.println(sb);
		
		

	}

}
