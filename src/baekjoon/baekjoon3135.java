package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon3135 {
	
	public static int plus = 1000;
	public static int minus = 1000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int N = Integer.parseInt(br.readLine());
		int min = Math.abs(A-B);
		
		for(int i =0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine());
			min = Math.min(min, Math.abs(B - temp)+1);
		}
		
		System.out.println(min);
	}

}
