package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Stack;

public class baekjoon1406 {
	
	public static Stack<String> leftStack = new Stack<>();
	public static Stack<String> rightStack = new Stack<>();
	
	public static void left() {
		if(leftStack.isEmpty()) {
			return;
		}
		rightStack.add(leftStack.pop());
	}
	
	public static void right() {
		if(rightStack.isEmpty()) {
			return;
		}
		leftStack.add(rightStack.pop());
	}
	
	public static void delete() {
		if(leftStack.isEmpty()) {
			return;
		}
		leftStack.pop();
	}
	
	public static void insert(String x) {
		leftStack.add(x);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			leftStack.add(String.valueOf(c));
		}
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String command = st.nextToken();
			
			if(command.equals("L")) {//왼쪽으로 한칸 이동
				left();
			}else if(command.equals("D")) {//오른쪽으로 한칸 이동
				right();
			}else if(command.equals("B")) {//커서 왼쪽 문자 삭제
				delete();
			}else if(command.equals("P")) {//ㅁ라는 문자를 커서 왼쪽에 추가
				String x = st.nextToken();
				insert(x);
			}
		}
		StringBuffer sb = new StringBuffer();
		while(leftStack.size() != 0) {
			rightStack.add(leftStack.pop());
		}
		while(rightStack.size() != 0) {
			sb.append(rightStack.pop());
		}
		
		System.out.println(sb);
		

	}

}





/*
스택 1개로 시도하다 실패
예제 1은 성공
2,3 실패

public static Stack<String> stack =new Stack<>();
	public static String[] temp;
	public static int top=0;
	
	public static void left() {
		if(stack.isEmpty()) {
			return;
		}
		temp[top++] = stack.pop();
	}
	
	public static void right() {
		if(top==0) {
			return;
		}
		stack.add(temp[top--]);
	}
	
	public static void delete() {
		if(stack.isEmpty()) {
			return;
		}
		if()
		stack.pop();
	}
	
	public static void insert(String x) {
//		temp[top]=stack.pop();
		stack.add(x);
		for(int i=top-1; i>=0; i--) {
			stack.add(temp[i]);
			temp[i]=null;
		}
		top = 0;
//		stack.add(temp[top]);
	}


*/