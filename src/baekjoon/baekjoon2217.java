package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = N-1;i >= 0;i--) {//가장 무거운 것부터
			arr[i] = arr[i]*(N-i);//ex) 35 33 30 일 떄 35 = 35kg, 35, 33 =66kg, 35 33 30 = 90kg
			//즉, 가장 무거운 것 부터 선택을 하며 Math.max(max, arr[i]);
			max = Math.max(arr[i], max);
			
		}
		sb.append(max);
		
		System.out.println(sb);
		
	}

}
