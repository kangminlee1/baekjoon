package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
//import java.util.Deque;
//import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Queue<Integer> que = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		for(int i=1; i<=N;i++) {
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(que.size()>1) {//처음에 null포함됨
			
			for(int i=0;i<M-1;i++) {
				que.add(que.poll());
			}
			sb.append(que.poll()).append(", ");
		}
		
		sb.append(que.poll()).append(">");
		System.out.println(sb);
		
	}

}
