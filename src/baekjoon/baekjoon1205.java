package baekjoon;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon1205 {
	
	public static int count = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		Integer[] arr = new Integer[N];
		
		if(N > 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i] = num;
			}
			
	        Arrays.sort(arr, Collections.reverseOrder());//Integer로 배열을 선언해야 리버스 가능
			
			if(N == P && M <= arr[arr.length-1]) {
				System.out.println(-1);
				return;
			}
			
			for(int i = 0; i<N; i++) {
				if(M < arr[i]) {
					count++;
				}
				else {
					break;
				}
			}
			
		}
		System.out.println(count);
	}

}
