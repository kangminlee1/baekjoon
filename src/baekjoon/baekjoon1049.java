package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1049 {
	
	public static int[][] arr;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M][2];
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int group_min = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		int total = 0;
		
		for(int i =0; i<M; i++) {
			if(arr[i][0]<group_min) {
				group_min = arr[i][0];
			}
			if(arr[i][1]<min) {
				min = arr[i][1];
			}
		}
		
		while(0 < N) {
			if(group_min/6 < min) {
				if(N<6) {
					if(group_min < min*N) {
						total+=group_min;
						N-=6;
					}else {
						total+=min*N;
						N-=N;
					}
					
				}else {
					total+=group_min;
					N-=6;
				}
			}else{
				total+=N*min;
				N-=N;
			}
		}
		
		System.out.println(total);
	}

}
