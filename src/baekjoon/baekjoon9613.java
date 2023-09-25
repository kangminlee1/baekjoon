package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon9613 {
	
	public static int gcd(int a, int b) {
		while(b>0) {
			int temp = b;
			b = a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < TC; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			long result = 0;
			
			for(int j=0; j<N;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for(int j=0; j<N-1; j++) {
				for(int k = j+1; k<N;k++) {
					result +=gcd(arr[j], arr[k]);
				}
			}
			sb.append(result).append("\n");
		}
		
		
		System.out.println(sb);
	}

}
