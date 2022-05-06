package baekjoon;
import java.util.Scanner;
public class Stack {
	public static int[] s;
	public static int size=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int A=in.nextInt();
		s=new int[A];
		for(int i=0;i<A;i++) {
			String str=in.next();
			if(str.equals("push")) {
				int num=in.nextInt();
				push(num);
			}
			else if(str.equals("pop")) {
				System.out.println(pop());
			}
			else if(str.equals("size")) {
				System.out.println(size());
			}
			else if(str.equals("empty")) {
				System.out.println(empty());
			}
			else if(str.equals("top")) {
				System.out.println(top());
			}
			
		}
	}
	static void push(int item) {
		s[size]=item;
		size++;
	}
	static int pop() {
	if(size==0)return -1;
	
	int temp=s[size-1];
	s[size-1]=0;
	size--;
	return temp;
	}
	static int size() {
		return size;
	}
	static int empty() {
		if(size==0)return 1;
		else return 0;
	}
	static int top() {
		if(size==0)return -1;
		return s[size-1];
	}
}
