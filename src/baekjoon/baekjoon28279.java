package baekjoon;
//덱 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;

public class baekjoon28279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> que = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());//명령 수
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			switch(num) {
			case 1: 
				que.addFirst(Integer.parseInt(st.nextToken()));
				break;
				
			case 2:
				que.addLast(Integer.parseInt(st.nextToken()));
				break;
				
			case 3:
				if(que.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(que.removeFirst() + "\n");
				}
				break;
				
			case 4: 
				if(que.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(que.removeLast() + "\n");
				}
				break;
				
			case 5:
				sb.append(que.size()+"\n");
				break;
				
			case 6:
				if(que.isEmpty())
					sb.append(1+"\n");
				else
					sb.append(0+"\n");
				break;
				
			case 7:
				if(que.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(que.peekFirst() + "\n");
				}
				break;
				
			case 8:
				if(que.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(que.peekLast() + "\n");
				}
				break;		
			}
		}
		System.out.println(sb);
		
		
	}

}
