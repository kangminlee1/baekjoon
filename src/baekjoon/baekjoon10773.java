package baekjoon;
import java.util.Stack;
import java.util.Scanner;
public class baekjoon10773 {


	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		Scanner in = new Scanner(System.in);
		
		int num=in.nextInt();
		
		for(int i=0;i<num;i++) {
			int a=in.nextInt();
			if(a==0)
				stack.pop();
			else 
				stack.push(a);
		}
		int sum=0;
		for(int i=0;i<stack.size();i++) {
			sum+=stack.get(i);
		}

		System.out.println(sum);
	}

}
