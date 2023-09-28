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
				
		StringBuffer sb = new StringBuffer();
		
			boolean flag = false;
			
			String temp = br.readLine();
			for(int i =0;i<temp.length();i++) {
				if(temp.charAt(i)=='<') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					flag = true;
				}else if(temp.charAt(i)=='>') {
					flag = false;
					sb.append(temp.charAt(i));
					continue;
				}
				
				if(flag == true) {
					sb.append(temp.charAt(i));
				}
				else if(flag == false) {
					if(temp.charAt(i)==' ') {
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}
						sb.append(' ');
						continue;
					}else
					stack.push(temp.charAt(i));
				}
				
				if( i == temp.length() -1) {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
				}
		}
		
		
		
		System.out.println(sb);
	}

}
