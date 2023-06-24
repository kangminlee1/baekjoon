package baekjoon;

import java.util.Scanner;
//import java.util.Queue;
//import java.util.LinkedList;

public class baekjoon18258 {
	public static int[] queue;
	public static int front=0;
	public static int rear=0;
	
	static void push(int item) {
		queue[rear]=item;
		rear++;
	}
	
	static int pop() {
		if(rear==front)
			return -1;
		int res=queue[front];
		front++;
		return res;
	}
	
	static int front() {
		if(rear==front)
			return -1;
		
		return queue[front];
	}
	
	static int back() {
		if(rear==front)
			return -1;
		
		return queue[rear-1];
	}
	
	static int empty() {
		if(rear==front)
			return 1;
		else
			return 0;
	}
	static int size() {
		return rear-front;
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
//		Queue<Integer> que= new LinkedList<>();
		
		int A=in.nextInt();
		queue=new int[A];
		for(int i=0;i<A;i++) {
			String str=in.next();
			
			switch (str){
			case "push": push(in.nextInt()); break;
			case "pop": System.out.println(pop()); break;
			case "front": System.out.println(front()); break;
			case "back": System.out.println(back()); break;
			case "size": System.out.println(size());; break;
			case "empty": System.out.println(empty());; break;
			}

		}
		
	}

}
