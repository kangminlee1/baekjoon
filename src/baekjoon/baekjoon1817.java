package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon1817 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> que = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int N = Integer.parseInt(st.nextToken());//책 수
		int M = Integer.parseInt(st.nextToken());//박스 최대 무게
		
		if(N == 0) {
			System.out.println(0);
			return;
		}
		
		st = new StringTokenizer(br.readLine());		
		for(int i = 0 ; i<N;i++) {
			int addNum = Integer.parseInt(st.nextToken());
			que.add(addNum);
		}
		
		int count = 1;
		int sum = 0;
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < N; i++) {
			sum+=que.peek();
			
			if(sum > M) {
				i--;
				sum = 0;
				count++;
			}else{
				que.poll();
			}
			
		}
		
		sb.append(count);
		System.out.println(sb);
		
	}

}
