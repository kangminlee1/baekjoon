package baekjoon;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

import java.util.Stack;

public class baekjoon4949 {

	
	public static String find(String str) {
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.push('(');
			}else if(str.charAt(i)=='[') {
				stack.push('[');
			}
			
			if(str.charAt(i)==')') {
				if(stack.isEmpty() || stack.peek()!='(') {
					return "no";
				}else {
					stack.pop();
				}
			}
			else if(str.charAt(i)==']') {
				if(stack.isEmpty() || stack.peek()!='[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
		}
		if(stack.isEmpty()) {
			return "yes";
		}else {
			return "no";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		while(true) {			
			String str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			sb.append(find(str)).append("\n");
		}
		
		System.out.println(sb);
	}

}



/*
 static String stacking(String str) {
		Stack<Character> stack= new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='('||c=='[')
				stack.push(c);
			else if(c==')')
			{
				if(stack.empty()||stack.peek()!='(')
					return "no";
				else
					stack.pop();
					
			}
			else if(c==']')
			{
				if(stack.empty()||stack.peek()!='[')
					return "no";
				else
					stack.pop();
			}
		}
		if(stack.size()>0)
			return "no";
		else
			return "yes";
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String str=in.nextLine();
			
			if(str.equals("."))break;
			
			System.out.println(stacking(str));
		}
		
	}

}
 */ 
