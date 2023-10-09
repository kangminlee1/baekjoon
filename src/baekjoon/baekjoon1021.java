package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon1021 {
	
	public static Queue<Integer> que = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i =1; i<=N; i++) {
			que.add(i);
		}
		
		int[] arr = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =0; i<M; i++) {
			int num = arr[i];
			
			//재시도
			
			
			
		}
		
	}

}
