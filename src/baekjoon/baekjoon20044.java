package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon20044 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[2*N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2*N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for(int i =0; i<N; i++) {
			min = Math.min(min, arr[i] + arr[(2*N-1)-i]);
		}
		
		System.out.println(min);
	}

}
