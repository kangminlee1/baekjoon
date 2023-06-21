package baekjoon;
//import java.util.Stack;
import java.util.Scanner;
public class baekjoon10773 {
	public static int top=-1;
	public static int[] stack;
	
	static void push(int item) {
		stack[++top]=item;
	}
	
	static int pop() {
		if(top==-1)
			return -1;
		else {
			int item= stack[top];
			stack[top]=0;
			top--;
			return item;
		}
	}

	public static void main(String[] args) {
//		Stack<Integer> stack=new Stack<>();
		Scanner in = new Scanner(System.in);
		
		int num=in.nextInt();
//		
//		for(int i=0;i<num;i++) {
//			int a=in.nextInt();
//			if(a==0)
//				stack.pop();
//			else 
//				stack.push(a);
//		}
//		int sum=0;
//		for(int i=0;i<stack.size();i++) {
//			sum+=stack.get(i);
//		}
//
//		System.out.println(sum);
		
		stack=new int[num];
		for(int i=0;i<num;i++) {
			int A=in.nextInt();
			if(A==0) {
				pop();
			}
			else {
				push(A);
			}
		}
		
		int sum=0;
		for(int i=0;i<stack.length;i++) {
			sum+=stack[i];
		}
		System.out.println(sum);
	}

}
