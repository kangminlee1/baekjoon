package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Stack;

public class baekjoon1874 {
	
	public static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for(int i=0;i<N;i++) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(count<value) {
				for(int j= count +1; j<=value; j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				count = value;
			}
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);

	}

}
