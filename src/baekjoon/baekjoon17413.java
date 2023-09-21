package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Stack;

public class baekjoon17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		while(st.hasMoreTokens()) {//다음에 재시도
			if(st.equals("<")) {
				stack.add('<');	
			}else if(st.equals(">")){
				stack.pop();
			}
			else {
			StringBuffer temp = new StringBuffer(st.nextToken());
			sb.append(temp.reverse()).append(" ");
			}
		}
		
		System.out.println(sb);
	}

}
