package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arrA = new int[N];
		int[] arrB = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] arr = new int[arrA.length + arrB.length];
//		System.arraycopy(arrA, 0, arr, 0, arrA.length);
//		System.arraycopy(arrB, 0, arr, arrA.length, arrB.length);
		
		int count = 0;
		
		for(int i : arrA) {
			arr[count++] = i;
		}
		for(int i : arrB) {
			arr[count++] = i;
		}
		
		Arrays.sort(arr);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
		
		
	}

}
