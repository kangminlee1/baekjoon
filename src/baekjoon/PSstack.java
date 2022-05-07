package baekjoon;
import java.util.Scanner;
import java.util.Stack;
public class PSstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		for(int i=0;i<A;i++) {
			String str=in.next();
			System.out.println(VPS(str));
		}
	}
	public static String VPS(String str) {
		Stack<Character> stack= new Stack<>();

		for(int i=0;i<str.length();i++) {
			char test=str.charAt(i);
			if(test=='(') {
				stack.push(test);
			}
			else if(stack.empty())
				return "NO";
			else stack.pop();
		}
		if(stack.empty())
			return "yes";
		else 
			return "NO";
	}
}
