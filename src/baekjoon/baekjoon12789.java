package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon12789 {//몇번수정함!


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> que = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<N;i++) {
			que.add(Integer.parseInt(st.nextToken()));
		}
				
		int count = 1;
		while(!que.isEmpty()) {
				if(que.peek() == count) {
					que.poll();
					count++;
				}
				else if(!stack.isEmpty() && stack.peek() == count) {
					stack.pop();
					count++;
				}
				else {
					stack.push(que.poll());
			}
			
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek() == count) {
				stack.pop();
				count++;
			}
			else {
				System.out.println("Sad");
				return;
			}
			
		}
		System.out.println("Nice");
		
		
	}

}
