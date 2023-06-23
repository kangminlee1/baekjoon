package baekjoon;
import java.util.Scanner;
import java.util.Stack;
public class baekjoon9012 {
	
	static String stacking(String str) {
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
