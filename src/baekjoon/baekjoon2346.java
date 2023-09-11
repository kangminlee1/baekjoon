package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.Deque;
import java.util.ArrayDeque;

public class baekjoon2346 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<int[]> deq = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i=0;i<N;i++) {
            int[] arr= {i+1,Integer.parseInt(st.nextToken())};
			deq.add(arr);
		}
		
		
		
		StringBuilder sb = new StringBuilder();
		
		while(deq.size()>1) {
			int[] arr = deq.pollFirst();
			sb.append(arr[0]).append(" ");
			int count = arr[1];
			
			if(count>0) {
				for(int i=1;i<count;i++) {
					deq.add(deq.pollFirst());
				}
			}
			else if(count<0) {
				for(int i=1; i<-count;i++) {
					deq.addFirst(deq.pollLast());
				}
			}
		}
		sb.append(deq.poll()[0]);
		
		System.out.println(sb);//실패함
		
	}

}
