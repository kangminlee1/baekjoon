package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon3986 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int A=in.nextInt();
		String[] arr=new String[A];
		for(int i=0;i<A;i++) {
			arr[i]=in.next();
		}
		
		int count=0;
		
		for(int i=0;i<A;i++) {
			for(int j=0;j<arr[i].length();j++) {
				if(stack.size()>0 && stack.peek().equals(arr[i].charAt(j)))
					stack.pop();
				else
					stack.push(arr[i].charAt(j));
			}
			if(stack.empty()) {
				count++;
			}
			stack.clear();
		}
		System.out.println(count);
		
	}

}
