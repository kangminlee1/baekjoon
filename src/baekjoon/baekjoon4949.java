package baekjoon;
import java.util.Scanner;
import java.util.Stack;
public class baekjoon4949 {
	
	static String stacking(String str) {
		Stack<Character> stack= new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='('||c=='[')
				stack.push(c);
			else if(c==')')
			{
				if(stack.empty()||stack.peek()!='(')
					return "NO";
				else
					stack.pop();
					
			}
			else if(c==']')
			{
				if(stack.empty()||stack.peek()!='[')
					return "NO";
				else
					stack.pop();
			}
		}
		if(stack.size()>0)
			return "NO";
		else
			return "YES";
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String str=in.nextLine();
			
			System.out.println(stacking(str));
			
			if(str.equals("."))break;
		}
		
	}

}
