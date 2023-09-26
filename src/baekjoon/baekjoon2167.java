package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2167 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		for(int i =0; i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j = 0; j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int K = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();		
		for(int a =0; a<K;a++) {
			st=new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			for(int b = i-1; b<x; b++) {
				for(int c = j-1; c<y; c++) {
					sum += arr[b][c];
				}
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

}
