package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Stack;

public class baekjoon28278 {
	
//	public static int[] stack;
//	public static int top = 0;
//	
//	public static void push(int num) {
//		stack[top] = num;
//		top++;
//	}
//	
//	public static int pop(){
//		
//		if(top==0) {
//			return -1;
//		}
//		else {
//			int result = stack[top - 1];
//			stack[top - 1]=0;
//			top--;
//			return result;
//		}
//		
//	}
//	
//	public static int size() {
//		return top;
//	}
//	
//	public static int isEmpty() {
//		if(top==0) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
//	
//	public static int peek() {
//		if(top == 0) {
//			return -1;
//		}
//		else {
//			return stack[top - 1];
//		}
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//		stack = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		 int N = Integer.parseInt(br.readLine()); //명령어의 수

	        while(N --> 0){
	            st = new StringTokenizer(br.readLine());
	            String command = st.nextToken();
	            if(command.equals("1")){
	                stack.push(Integer.parseInt(st.nextToken()));
	            }else if(command.equals("2")){
	                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
	            }else if(command.equals("3")){
	                sb.append(stack.size()).append("\n");
	            }else if(command.equals("4")){
	                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
	            }else if(command.equals("5")){
	                sb.append(stack.isEmpty()? -1 : stack.lastElement()).append("\n");
	            }
	        	}
			System.out.println(sb);
	}
}
