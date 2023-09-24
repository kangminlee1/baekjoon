package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Queue;
import java.util.LinkedList;

public class baekjoon2161 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();

		for(int i=1; i<=N;i++) {
			que.add(i);
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i =1; i<N;i++) {
			sb.append(que.poll()).append(" ");
			que.add(que.poll());
		}
		sb.append(que.poll());
		System.out.println(sb);

	}

}
