package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Stack;

public class baekjoon9012 {
	public static Stack<Character> stack = new Stack<>();
	public static StringBuffer sb = new StringBuffer();
	
	public static void finding(String str) {
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.add(str.charAt(i));
			}else if(stack.isEmpty()) {
				sb.append("NO").append("\n");
				return;
			}else {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			sb.append("YES").append("\n");
		}else {
			sb.append("NO").append("\n");
		}
		stack.clear();

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		for(int i =0; i<TC;i++) {
			String str = br.readLine();
			finding(str);
		}
		
		System.out.println(sb);
		
	}
}

/*
 * 
 * 
 * 	static String stacking(String str) {
		Stack<Character> stack= new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(c=='(')
				stack.push(c);
			else if(stack.empty())
				return "NO";
			else
				stack.pop();
			
		}
		
		if(stack.size()>0)
			return "NO";
		else
			return "YES";
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A=in.nextInt();
		
		for(int i=0;i<A;i++) {
			System.out.println(stacking(in.next()));
		}
	}

}
 * 
 */
