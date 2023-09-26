package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon2018 {
	
	public static int counting(int N) {
		int count = 0;
		
		for(int i =1; i<=N;i++) {
			int sum = 0;
			for(int j = i; j<=N; j++) {
				sum += j;
				if(sum>N) {
					break;
				}
				else if(sum == N) {
					count++;
					break;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(counting(N));
		System.out.println(sb);
		

	}

}
