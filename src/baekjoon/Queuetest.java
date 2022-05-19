package baekjoon;

import java.util.Scanner;

public class Queuetest {
	public static int size=0;
	public static int front=0;
	public static int back=0;
	public static int[] queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		queue=new int[A];
		for(int i=0;i<A;i++) {
			String s=in.next();
			if(s.equals("push")) {
				int a=in.nextInt();
				push(a);
			}
			else if(s.equals("front")) {
				System.out.println(front());
			}
			else if(s.equals("pop"))
			{
				System.out.println(pop());
			}
			else if(s.equals("size")) {
				System.out.println(Qsize());
			}
			else if(s.equals("empty")) {
				System.out.println(empty());
			}
			else if(s.equals("back")) {
				System.out.println(back());
			}
		}
	}
	public static void push(int item) {
		queue[back]=item;
		back++;
		size++;
	}
	public static int pop() {
		if(size==0) return -1;
		else {
		int temp=queue[front];
		size--;
		front++;
		return temp;
		}
	}
	public static int Qsize() {
		return size;
	}
	public static int empty() {
		if(size==0)return -1;
		else return 0;
	}
	public static int front() {
		if(size==0) return -1;
		else {
		return queue[front];
		}
	}
	public static int back() {
		if(size==0) return -1;
		else return queue[back-1];
	}
}
