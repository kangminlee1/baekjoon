package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

import java.util.PriorityQueue;

public class baekjoon1927 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int count = 0;
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(que.isEmpty()) {
					sb.append(0 + "\n");
				}else {
					sb.append(que.poll() + "\n");
				}
			}else {
				que.add(x);
			}
			
		}
		
		System.out.println(sb);
	}

}
