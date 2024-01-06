package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class baekjoon14469 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			arr[i][0] = start;
			arr[i][1] = end;
			
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			return o1[0]-o2[0];
		});

		int time = 0;
		
		for(int i = 0 ; i<N; i++) {//시간 복잡도가 O(n)으로 하는 방법이 있는데 O(n^3)으로 해결해 버렸음
			if(time < arr[i][0]) {
				time = arr[i][0] + arr[i][1];
			}else {
				time += arr[i][1];
			}
		}
		System.out.println(time);

	}

}
