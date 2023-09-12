package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;

public class baekjoon2346 {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> deq = new ArrayDeque<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr=new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i=0;i<N;i++) {
            arr[i]= Integer.parseInt(st.nextToken());
			deq.add(arr[i]);
			map.add(i+1, arr[i]);
		}
		
				
		StringBuilder sb = new StringBuilder();
		sb.append(1).append(" ");
		
		int count = 1;
		while(!deq.isEmpty()) {
			
			if(count>0) {
				for(int i=1;i<count;i++) {
					deq.add(deq.pollFirst());
				}
				sb.append(deq.poll()).append(" ");
			}
			else if(count<0) {
				for(int i=1; i<-count;i++) {
					deq.addFirst(deq.pollLast());
				}
				sb.append(deq.pollLast()).append(" ");
			}
		}
		
		System.out.println(sb);//실패함
		*/
		
	}

}
